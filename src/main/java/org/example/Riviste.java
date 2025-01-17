package org.example;

public class Riviste extends ElementoCatalogo{

    public enum periodicita{
        SETTIMANALE,
        MENSILE,
        SEMESTRALE

    }

    public Riviste(int ISBN, String title, int year, int numPag) {
        super(ISBN, title, year, numPag);

    }

}
