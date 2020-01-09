package de.mtag.schulungen.springboot.model;

public class Ventil {
    private int saeulennummer;
    private Kraftstoffart kraftstoffart;

    public Ventil() {
    }

    public Ventil(int saeulennummer, Kraftstoffart kraftstoffart) {
        this.saeulennummer = saeulennummer;
        this.kraftstoffart = kraftstoffart;
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
}
