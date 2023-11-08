package com.ItFactory.problema1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produs produs = new Produs();
        Imbracaminte imbracaminte = new Imbracaminte();
        IngrijirePersonala ingrijirePersonala = new IngrijirePersonala();
        Electronice electronice = new Electronice();


        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceti tipul de produs pe care il doriti");
        String tipProdus = scanner.nextLine();
        switch (tipProdus) {
            case "Imbracaminte":
                System.out.println("introduceti tipul de imbracaminte dorit");
                String tipImbracaminte = scanner.nextLine();
                switch (tipImbracaminte) {
                    case "pantaloni":
                        imbracaminte.setDiscount(10);
                        imbracaminte.setPret(100);
                        System.out.println(imbracaminte.calculeazaPretNou());
                        break;
                    case "bluza":
                        imbracaminte.setDiscount(20);
                        imbracaminte.setPret(50);
                        System.out.println(imbracaminte.calculeazaPretNou());
                        break;
                    case "accesoriu":
                        imbracaminte.setDiscount(30);
                        imbracaminte.setPret(70);
                        System.out.println(imbracaminte.calculeazaPretNou());
                        break;
                    default:
                        System.out.println("nu se poate aplica discount pentru acest tip de imbracamine");

                }
                break;
            case "IngrijirePersonala":
                System.out.println("Produsul de ingrijire poate fi returnat ?");

                ingrijirePersonala.setNume("aparat de ras");
                ingrijirePersonala.setPret(50);
                ingrijirePersonala.retur = scanner.nextBoolean();

                if (ingrijirePersonala.retur) {
                    System.out.println("nu se va aplica discount");
                    // System.out.println(ingrijirePersonala.getPret());

                } else {
                    System.out.println("se va aplica discount de 20%");
                    ingrijirePersonala.setDiscount(20);
                    ingrijirePersonala.setPret(80);
                    System.out.println(ingrijirePersonala.calculeazaPretNou());
                }
                break;

            case "Electronice":
                System.out.println("introduceti voltajul");
                electronice.voltaj = scanner.nextInt();
                if (electronice.voltaj < 220 || electronice.voltaj > 240) {
                    System.out.println("Conform reglementarilor europene produsele cu voltajul " + electronice.voltaj + "nu pot fi folosite la prizele europene!");
                } else {
                    electronice.setDiscount(0);
                    electronice.setPret(150);
                    System.out.println("pretul produsului este :" + electronice.calculeazaPretNou());
                }
                break;
            default:
                System.out.println("nu exista acest tip de produs");


        }

    }
}
