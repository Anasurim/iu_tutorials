package org.example;

public class UngueltigesGeschlechtException extends Exception {
    public UngueltigesGeschlechtException(){
        super("Das Geschlecht ist ungueltig!");
    }

    public UngueltigesGeschlechtException(String message){
        super(message);
    }
}
