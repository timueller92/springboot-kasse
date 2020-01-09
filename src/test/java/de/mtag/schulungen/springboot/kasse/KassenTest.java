package de.mtag.schulungen.springboot.kasse;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.mtag.schulungen.springboot.model.Kraftstoffart;
import de.mtag.schulungen.springboot.model.TankVorgang;
import de.mtag.schulungen.springboot.model.Ventil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class KassenTest {

    JacksonTester<Ventil> ventilJacksonTester;
    JacksonTester<TankVorgang> tankVorgangJson;

    @Autowired
    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        JacksonTester.initFields(this, new ObjectMapper());
    }

    @Test
    void testNeuerVorgang() throws Exception {
        Ventil ventil = new Ventil(2, Kraftstoffart.DIESEL);

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post("/kasse/neuerVorgang")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(ventilJacksonTester.write(ventil).getJson())
                    .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        TankVorgang tankVorgang = tankVorgangJson.parseObject(result.getResponse().getContentAsString());
        assertEquals(tankVorgang.saeulennummer, ventil.saeulennummer);
        assertEquals(tankVorgang.kraftstoffart, ventil.kraftstoffart);
        //assertEquals(tankVorgang.preisProLiter, new BigDecimal("1.30"));
        assertEquals(tankVorgang.gesamtmenge, BigDecimal.ZERO);
    }

    @Test
    void testVorgangAbgeschlossen() throws Exception {
        TankVorgang tankVorgang = new TankVorgang(2, Kraftstoffart.DIESEL, new BigDecimal("1.30"), new BigDecimal("30.00"));

        mockMvc
                .perform(MockMvcRequestBuilders.put("/kasse/auftankenAbgeschlossen")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(tankVorgangJson.write(tankVorgang).getJson()))
                .andExpect(status().isNoContent());
    }
}
