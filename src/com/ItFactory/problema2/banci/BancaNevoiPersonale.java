package com.ItFactory.problema2.banci;

import com.ItFactory.problema2.persoana.Persoana;

public class BancaNevoiPersonale implements UnitateBancara {
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
