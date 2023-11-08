package com.ItFactory.problema1;

public class Electronice extends Produs {

    int voltaj;

    public Electronice() {

    }

    public Electronice(String nume, double pret, int discount, int voltaj) {
        super(nume, pret, discount);
        this.voltaj = voltaj;
    }

    public int getVoltaj() {
        return voltaj;
    }

    public void setVoltaj(int voltaj) {
        this.voltaj = voltaj;

        if (voltaj > 240 || voltaj < 220) {
            System.out.println("acest voltaj nu poate fi folosit");
        }
    }
}
