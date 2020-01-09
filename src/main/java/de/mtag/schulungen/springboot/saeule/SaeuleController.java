package de.mtag.schulungen.springboot.saeule;

import de.mtag.schulungen.springboot.model.TankVorgang;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saeule")
public class SaeuleController {

    @PutMapping("/bezahlenAbgeschlossen")
    public ResponseEntity bezahlenAbgeschlossen(@RequestBody TankVorgang tankVorgang) {
        return ResponseEntity.noContent().build();
    }
}
