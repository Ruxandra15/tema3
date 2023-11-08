package com.ItFactory.problema2.banci;

import com.ItFactory.problema2.persoana.Persoana;

public class BancaPentruLocuinte implements UnitateBancara {
    @Override
    public double calculeazaCredit(Persoana persoana) {
        double c = persoana.getSalariuNet() * 100;
        return c;

    }

    @Override
    public double calculeazaDobandaCreditului(Persoana persoana) {
        double d = (5 * calculeazaCredit(persoana)) / 100;
        return d;

    }
}
