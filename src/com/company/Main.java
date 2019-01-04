package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);
    private static boolean exit=true;
    private static int auswahl=0;

    public static void main(String[] args) {

	    while(exit){
	        System.out.println("Wähle eines der folgenden:");

            System.out.println("[1] Speisenliste");
            System.out.println("[2] Speiseplan einer Kantine");
            System.out.println("[3] Artikelübersicht");
            System.out.println("[4] Neuer Speiseplan");
            System.out.println("[5] Neue Rechnung");
            System.out.println("[6] Exit");

            System.out.print("Ihre Auswahl: ");
            try {
                auswahl = scanner.nextInt();
                if(auswahl <1 || auswahl >6){
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e){
                System.out.println("Ungültige Eingabe!");
                String trash=scanner.next();
                continue;
            }

            switch (auswahl){
                case 1:
                    System.out.println("picked"+auswahl);
                    break;
                case 2:
                    System.out.println("picked"+auswahl);
                    break;
                case 3:
                    System.out.println("picked"+auswahl);
                    break;
                case 4:
                    System.out.println("picked"+auswahl);
                    break;
                case 5:
                    System.out.println("picked"+auswahl);
                    break;
                case 6:
                    exit=false;
                    break;
            }


            System.out.println(" ");
        }
    }
}
