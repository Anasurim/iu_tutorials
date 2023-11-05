package org.example;

public interface IKundenSpeicher {
    void neu(Kunde k);
    Kunde laden(int kundeNr);

    void aktualisieren(Kunde k);

    void loeschen(int kundeNr);

}
