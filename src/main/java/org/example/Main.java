package org.example;


import java.util.Scanner;

public class Main
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
while (true){
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
                """);

    int sceltaPercorso = scanner.nextInt();

    switch (sceltaPercorso){
        case 1 :
            System.out.println("---AGGIUNGI ELEMENTO---");


    }

        }

    }
}
