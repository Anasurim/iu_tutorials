package org.example;

public class Main {

public static void main(String[] args){
    Auto auto = new Auto();
    Hersteller hersteller = new Hersteller();

    System.out.println(auto.getAnzahlRaeder());
    System.out.println(hersteller.getName());

}
}