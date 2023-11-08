package com.ItFactory.problema1;

public class IngrijirePersonala extends Produs {

    boolean retur;

    public IngrijirePersonala() {

    }

    public IngrijirePersonala(String nume, double pret, int discount, boolean retur) {
        super(nume, pret, discount);
        this.retur = retur;
    }

    public boolean isRetur() {
        return retur;
    }

    public void setRetur(boolean retur) {
        this.retur = retur;
    }
}
