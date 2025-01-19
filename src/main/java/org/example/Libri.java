package org.example;

public class Libri extends ElementoConAutore {


    private String genere ;


    //COSTRUTTORE

    public Libri(int ISBN, String title, int year, int numPag, String autore, String genere) {
        super(ISBN, title, year, numPag, autore);
        this.genere = genere;
    }


    //GETTER

    public String getGenere() {
        return genere;
    }

    //SETTER

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "genere='" + genere + '\'' +
                '}';
    }
}
