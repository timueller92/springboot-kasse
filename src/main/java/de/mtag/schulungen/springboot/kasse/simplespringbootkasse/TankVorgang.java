package de.mtag.schulungen.springboot.kasse.simplespringbootkasse;

import java.math.BigDecimal;
import java.util.UUID;

public class TankVorgang {
    UUID uuid;
    int saeulennummer;
    Kraftstoffart kraftstoffart;
    BigDecimal preisProLiter;
    BigDecimal gesamtmenge;

    public TankVorgang(int saeulennummer, Kraftstoffart kraftstoffart, BigDecimal preisProLiter, BigDecimal gesamtmenge) {
        this.uuid = UUID.randomUUID();
        this.saeulennummer = saeulennummer;
        this.kraftstoffart = kraftstoffart;
        this.preisProLiter = preisProLiter;
        this.gesamtmenge = gesamtmenge;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getSaeulennummer() {
        return saeulennummer;
    }

    public void setSaeulennummer(int saeulennummer) {
        this.saeulennummer = saeulennummer;
    }

    public Kraftstoffart getKraftstoffart() {
        return kraftstoffart;
    }

    public void setKraftstoffart(Kraftstoffart kraftstoffart) {
        this.kraftstoffart = kraftstoffart;
    }

    public BigDecimal getPreisProLiter() {
        return preisProLiter;
    }

    public void setPreisProLiter(BigDecimal preisProLiter) {
        this.preisProLiter = preisProLiter;
    }

    public BigDecimal getGesamtmenge() {
        return gesamtmenge;
    }

    public void setGesamtmenge(BigDecimal gesamtmenge) {
        this.gesamtmenge = gesamtmenge;
    }
}
