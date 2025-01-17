package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CatalogoBibliotecario {

    private ArrayList<ElementoCatalogo> catalogoBiblioteca;

    //METODI

    public void aggiungiElemento(ElementoCatalogo newElement) {
        if (catalogoBiblioteca.stream().anyMatch(element -> element.getISBN() == newElement.getISBN())) {
            System.out.println("Elemento già presente, il codice ISBN corrisponde a " + newElement.getTitle());
        } else {
            catalogoBiblioteca.add(newElement);
            System.out.println("Elemento aggiunto con successo!");
        }
    }

    public void findElemento(int ISBN) {
        catalogoBiblioteca.stream().filter(element -> element.getISBN() == ISBN)
                .findFirst()
                .ifPresent(element -> System.out.println("Titolo dell'elemento: " + element.getTitle()));
    }

    public void rimuoviElemento(int ISBN) {
        catalogoBiblioteca.removeIf(element -> element.getISBN() == ISBN);
        System.out.println("Elemento rimosso con successo!");

    }

    public void findYear(int year) {
        System.out.println("Gli Elementi pubblicati nell'anno " + year + " sono: ");
        catalogoBiblioteca.stream().filter(element -> element.getYear() == year).toList().forEach(System.out::println);


    }

    public void findAutore(String autore) {
        System.out.println("Gli Elementi scritti da " + autore + " sono: ");
        catalogoBiblioteca.stream().filter(element -> element instanceof Libri && ((Libri) element).getAutore().equals(autore)).toList().forEach(System.out::println);
    }

    public void updateElemento(int ISBN) {

ElementoCatalogo elemento  = catalogoBiblioteca.stream().filter(element -> element.getISBN() == ISBN)
        .findFirst()
        .orElse(null);


        if (elemento == null){
    System.out.println("Elemento non trovato");
}else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Scegli l'attributo da aggiornare:");
            System.out.println("1. Titolo");
            System.out.println("2. Anno di pubblicazione");
            System.out.println("3. ISBN");
            System.out.println("4. Autore");
            System.out.println("5. Genere");

            int scelta = scanner.nextInt();
            scanner.nextLine();

                switch (scelta) {
                    case 1:
                        System.out.print("Inserisci il nuovo titolo: ");
                        String newTitle = scanner.nextLine();
                        elemento.setTitle(newTitle);
                        System.out.println("Titolo aggiornato!");
                        break;
                    case 2:
                        System.out.print("Inserisci il nuovo anno di pubblicazione: ");
                        int newYear = scanner.nextInt();
                        elemento.setYear(newYear);
                        System.out.println("Anno aggiornato!");
                        break;
                    case 3:
                        System.out.print("Inserisci il nuovo ISBN: ");
                        int newISBN = scanner.nextInt();
                        elemento.setISBN(newISBN);
                        System.out.println("ISBN aggiornato!");
                        break;
                    case 4:
                        if (elemento instanceof ElementoConAutore) {
                            System.out.print("Inserisci il nuovo autore: ");
                            String newAutore = scanner.nextLine();
                            ((ElementoConAutore) elemento).setAutore(newAutore);
                            System.out.println("Autore aggiornato!");
                        } else {
                            System.out.println("Questo elemento non ha un autore da aggiornare.");
                        }
                        break;
                    case 5:
                        System.out.print("Inserisci il nuovo genere: ");
                        int newGenere = scanner.nextInt();
                        elemento.setISBN(newGenere);
                        System.out.println("Genere aggiornato!");
                        break;
                    default:
                        System.out.println("Scelta non valida.");
                        break;
                }


        }



    }

    }
