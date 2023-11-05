package org.example;

public class DateiKundenSpeicher implements IKundenSpeicher{
    @Override
    public void neu(Kunde k) {
        System.out.println("DateiKundenSpeicher");
    }

    @Override
    public Kunde laden(int kundeNr) {
        return new Kunde();
    }

    @Override
    public void aktualisieren(Kunde k) {
        System.out.println("DateiKundenSpeicher");
    }

    @Override
    public void loeschen(int kundeNr) {
        System.out.println("DateiKundenSpeicher");
    }
}
