package org.example;

public class Buch extends Artikel {

    private String autor;

    public String getBeschreibung(){
        return super.getBeschreibung() + Artikel.TRENNZEICHEN + autor + Artikel.TRENNZEICHEN;

    };

}
