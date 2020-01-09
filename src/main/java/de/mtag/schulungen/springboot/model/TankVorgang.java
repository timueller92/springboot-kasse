package de.mtag.schulungen.springboot.model;

import java.math.BigDecimal;
import java.util.UUID;

public class TankVorgang {
    public UUID uuid;
    public int saeulennummer;
    public Kraftstoffart kraftstoffart;
    public BigDecimal preisProLiter;
    public BigDecimal gesamtmenge;

    public TankVorgang(int saeulennummer, Kraftstoffart kraftstoffart, BigDecimal preisProLiter, BigDecimal gesamtmenge) {
        this.uuid = UUID.randomUUID();
        this.saeulennummer = saeulennummer;
        this.kraftstoffart = kraftstoffart;
        this.preisProLiter = preisProLiter;
        this.gesamtmenge = gesamtmenge;
    }

    public TankVorgang() {
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
