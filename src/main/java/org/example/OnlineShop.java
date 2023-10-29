package org.example;

public class OnlineShop {
    public static void main(String[] args){
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

    }
}
