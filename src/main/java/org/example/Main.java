package org.example;


import java.util.Scanner;

public class Main
{
    public static void main( String[] args ) {


        CatalogoBibliotecario catalogo = new CatalogoBibliotecario();

        Scanner scanner = new Scanner(System.in);
while(true){

    System.out.println("---CATALOGO BIBLIOTECARIO---" +"\n");
    System.out.println("SCEGLI UN PERCORSO: " +"\n");
    System.out.println("""
                1)AGGIUNGI UN ELEMENTO \n
                2)RICERCA ELEMENTO TRAMITE ISBN \n
                3)RIMOZIONE ELEMENTO TRAMITE ISBN \n
                4)RICERCA PER ANNO \n
                5)RICERCA PER AUTORE \n
                6)AGGIORNA ELEMENTO TRAMITE ISBN \n
                7)STATISTICHE CATALOGO \n
                0)ESCI
                """);

    int sceltaPercorso = Integer.parseInt(scanner.nextLine());
    switch (sceltaPercorso){
        case 1 :
            System.out.println("---AGGIUNGI ELEMENTO---" + "\n");
            System.out.println("STAI AGGIUNGENDO UN LIBRO (L) O UNA RIVISTA (R)?" + "\n");
            String sceltaLR = scanner.nextLine().toUpperCase();
            if (sceltaLR.equals("L")){
                System.out.println("AGGIUNGI CODICE ISBN" + "\n");
                int codice = Integer.parseInt(scanner.nextLine());
                System.out.println("AGGIUNGI TITOLO DEL LIBRO" + "\n");
                String title = scanner.nextLine();
                System.out.println("AGGIUNGI ANNO DI PUBBLICAZIONE DEL LIBRO" + "\n");
                int year = Integer.parseInt(scanner.nextLine());
                System.out.println("AGGIUNGI NUMERO DI PAGINE DEL LIBRO" + "\n");
                int numPag = Integer.parseInt(scanner.nextLine());
                System.out.println("AGGIUNGI AUTORE DEL LIBRO" + "\n");
                String autore  = scanner.nextLine();
                System.out.println("AGGIUNGI GENERE DEL LIBRO" + "\n");
                String genere  = scanner.nextLine();
                Libri newLibro = new Libri(codice, title , year ,numPag , autore , genere);
                catalogo.aggiungiElemento(newLibro);


            } else if(sceltaLR.equals("R")){
                System.out.println("AGGIUNGI CODICE ISBN" + "\n");
                int codice = Integer.parseInt(scanner.nextLine());
                System.out.println("AGGIUNGI TITOLO DELLA RIVISTA" + "\n");
                String title = scanner.nextLine();
                System.out.println("AGGIUNGI ANNO DI PUBBLICAZIONE DELLA RIVISTA" + "\n");
                int year = Integer.parseInt(scanner.nextLine());
                System.out.println("AGGIUNGI NUMERO DI PAGINE DELLA RIVISTA" + "\n");
                int numPag = Integer.parseInt(scanner.nextLine());
                Riviste newRivista = new Riviste(codice, title , year ,numPag );
                catalogo.aggiungiElemento(newRivista);
            }
            break;
        case 2 :
            System.out.println("---RICERCA ELEMENTO TRAMITE ISBN---"+ "\n");
            System.out.println("FORNISCI CODICE ISBN" + "\n");
            int codice = Integer.parseInt(scanner.nextLine());
            catalogo.findElemento(codice);
            break;

        case 3 :
            System.out.println("---RIMOZIONE ELEMENTO TRAMITE ISBN---" + "\n");
            System.out.println("FORNISCI CODICE ISBN" + "\n");
            int targetCode = Integer.parseInt(scanner.nextLine());
            catalogo.rimuoviElemento(targetCode);
            break;
        case 4 :
            System.out.println("---RICERCA PER ANNO---" + "\n");
            System.out.println("FORNISCI ANNO DI PUBBLICAZIONE" + "\n");
            int year = Integer.parseInt(scanner.nextLine());
            catalogo.findYear(year);
            break;
        case 5 :
            System.out.println("---RICERCA PER AUTORE---" + "\n");
            System.out.println("FORNISCI UN AUTORE" + "\n");
            String autore = scanner.nextLine();
            catalogo.findAutore(autore);
            break;
        case 6 :
            System.out.println("---AGGIORNA ELEMENTO TRAMITE ISBN---");
            System.out.println("FORNISCI CODICE ISBN" + "\n");
            int ISBN = Integer.parseInt(scanner.nextLine());
            catalogo.updateElemento(ISBN);
            break;
        case 0:
            System.out.println("Arrivederci!");
            scanner.close();
            return;

        default:
            System.out.println("Opzione non valida.");
    }
        System.out.println("\nVuoi fare un'altra operazione? Scegli un'opzione:");
}


    }
}
