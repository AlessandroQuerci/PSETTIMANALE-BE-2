package org.example;

public class ElementoConAutore extends ElementoCatalogo {
    private String autore;

    // Costruttore

    public ElementoConAutore(int ISBN, String title, int year, int numPag, String autore) {
        super(ISBN, title, year, numPag);
        this.autore = autore;
    }

    // Getter
    public String getAutore() {
        return autore;
    }

    //Setter
    public void setAutore(String autore) {
        this.autore = autore;
    }

}