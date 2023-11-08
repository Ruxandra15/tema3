package com.ItFactory.problema1;

public class Imbracaminte extends Produs {
    String tipImbracaminte;

    public Imbracaminte() {

    }

    public Imbracaminte(String nume, double pret, int discount, String tipImbracaminte) {
        super(nume, pret, discount);
        this.tipImbracaminte = tipImbracaminte;
    }


    public String getTipImbracaminte() {
        return tipImbracaminte;
    }

    public void setTipImbracaminte(String tipImbracaminte) {
        this.tipImbracaminte = tipImbracaminte;
    }
}
