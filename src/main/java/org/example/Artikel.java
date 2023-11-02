package org.example;

public abstract class Artikel {

    private String hersteller;
    private String titel;
    private String artikelnummer;
    public static String TRENNZEICHEN = ";";
    public String getBeschreibung(){
        return artikelnummer + Artikel.TRENNZEICHEN + hersteller + Artikel.TRENNZEICHEN + titel;
    };

}
