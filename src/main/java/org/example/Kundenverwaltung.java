package org.example;

public class Kundenverwaltung {
    private Kunde k1;
    private Kunde k2;

    private IKundenSpeicher kundenSpeicher= new DateiKundenSpeicher();

    public void aktualisierenAlleKunden(){
        kundenSpeicher.aktualisieren(k1);
        kundenSpeicher.aktualisieren(k2);
    }
}
