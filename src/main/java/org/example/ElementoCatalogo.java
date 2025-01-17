package org.example;

public class ElementoCatalogo {

    private int ISBN ;
    private String title;
    private int year;
    private int numPag;

    //COSTRUTTORE

    public ElementoCatalogo(int ISBN, String title, int year, int numPag) {
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.numPag = numPag;
    }

    //GETTER

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getNumPag() {
        return numPag;
    }

    //SETTER

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }


}
