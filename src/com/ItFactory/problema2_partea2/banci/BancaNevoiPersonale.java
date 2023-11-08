package com.ItFactory.problema2_partea2.banci;

import com.ItFactory.problema2.persoana.Persoana;

public class BancaNevoiPersonale extends UnitateBancara {
    @Override
    public double calculeazaCredit(Persoana persoana) {
        double c = persoana.getSalariuNet() * 10;
        return c;
    }

    @Override
    public double calculeazaDobandaCreditului(Persoana persoana) {
        double d = (calculeazaCredit(persoana) * 8) / 100;
        return d;
    }
}
