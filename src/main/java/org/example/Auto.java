package org.example;

public class Auto {

    private Hersteller hersteller;
    private String model;
    private float hubraum;
    private int anzahlRaeder;
    private int extraTueren;

    public Auto(){
        anzahlRaeder=4;
        hersteller=new Hersteller();
    }

    public int getAnzahlRaeder(){
        return anzahlRaeder;
    }
}
