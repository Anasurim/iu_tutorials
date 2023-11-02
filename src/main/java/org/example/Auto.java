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

    public Auto(String model, float hubraum, int anzahlRaeder, int extraTueren){
        this.model=model;
        this.hubraum=hubraum;
        this.anzahlRaeder=anzahlRaeder;
        this.extraTueren=extraTueren;
    }

    public Auto(String model, float hubraum){
        this.model=model;
        this.hubraum=hubraum;

    }

    public String getModel(){
        return model;
    }

    public int getAnzahlRaeder(){
        return anzahlRaeder;
    }
}
