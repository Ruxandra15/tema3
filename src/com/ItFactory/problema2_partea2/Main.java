package com.ItFactory.problema2_partea2;

import com.ItFactory.problema2.banci.BancaNevoiPersonale;
import com.ItFactory.problema2.banci.BancaPentruLocuinte;
import com.ItFactory.problema2.banci.UnitateBancara;
import com.ItFactory.problema2.persoana.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana();
        persoana.setNume("Ruxandra");
        persoana.setVarsta(19);
        persoana.setCnp("5794038272820");
        persoana.setSalariuNet(2500);

        if (persoana.getVarsta() < 18) {
            System.out.println("Persoana nu este eligibila pentru un credit");
            System.exit(0);
        } else if (persoana.getVarsta() >= 18 && persoana.getVarsta() <= 40) {
            UnitateBancara unitateBancara = new BancaPentruLocuinte();
            System.out.println("limita maxima a creditului este:");
            System.out.println(unitateBancara.calculeazaCredit(persoana));
            System.out.println("dobanda creditului este:");
            System.out.println(unitateBancara.calculeazaDobandaCreditului(persoana));

        } else {
            UnitateBancara unitateBancara = new BancaNevoiPersonale();
            System.out.println("limita maxima a creditului este:");
            System.out.println(unitateBancara.calculeazaCredit(persoana));
            System.out.println("dobanda creditului este:");
            System.out.println(unitateBancara.calculeazaDobandaCreditului(persoana));
        }

    }
}
