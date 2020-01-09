package de.mtag.schulungen.springboot.kasse;

import de.mtag.schulungen.springboot.model.TankVorgang;
import de.mtag.schulungen.springboot.model.Ventil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("kasse")
public class Kasse {

    @PostMapping("neuerVorgang")
    TankVorgang neuerVorgang(Ventil ventil){
        return new TankVorgang(ventil.getSaeulennummer(), ventil.getKraftstoffart(), new BigDecimal("1.30"), new BigDecimal("0"));
    }

    @PutMapping("auftankenAbgeschlossen")
    void auftankenAbgeschlossen(TankVorgang tankVorgang){
        tankVorgang.setGesamtmenge(new BigDecimal("30.00"));
        //tankVorgang.setPreisProLiter(new BigDecimal("1.30"));
    }
}
