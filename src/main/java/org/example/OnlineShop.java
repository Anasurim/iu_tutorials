package org.example;

public class OnlineShop {
    public static void main(String[] args) throws UngueltigesGeschlechtException {
        Kunde kunde1 = new Kunde();
        kunde1.setName("Roman");
        kunde1.setVorname("Stalone");

        Kunde kunde2 = new Kunde();
        kunde2.setName("Nataliia");
        kunde2 .setVorname("Kirdei");

        String id1 = kunde1.getName();
        String id2 = kunde2.getName();

        System.out.println(id1);
        System.out.println(id2);

        System.out.println(Artikel.TRENNZEICHEN);
        kunde1.setGeschlecht("w");
        String i = kunde1.getGeschlecht();

        System.out.println(i);

        try {

            kunde1.getGeschlecht();

        } catch (UngueltigesGeschlechtException ex) {
            System.out.println(ex.getMessage());
        }

        Kundenverwaltung kundenverwaltung = new Kundenverwaltung();
        kundenverwaltung.aktualisierenAlleKunden();


    }
}
