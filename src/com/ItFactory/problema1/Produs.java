package com.ItFactory.problema1;

public class Produs {
    String nume;

    double pret;

    double discount;


    public Produs(String nume, double pret, double discount) {
        this.nume = nume;
        this.pret = pret;
        this.discount = discount;
    }

    public Produs() {
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
        if (discount < 0 && discount > 100) {
            System.out.println("discountul nu se poate aplica");

        }
    }

    public double calculeazaPretNou() {
        double p = this.pret - (this.discount / 100) * this.pret;
        return p;

    }
}
