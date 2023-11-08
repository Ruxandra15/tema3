package com.ItFactory.problema2.persoana;

public class Persoana {
    private String nume;
    private int varsta;
    private String cnp;
    private double salariuNet;

    public Persoana(String nume, int varsta, String cnp, double salariuNet) {
        this.nume = nume;
        this.varsta = varsta;
        this.cnp = cnp;
        this.salariuNet = salariuNet;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public double getSalariuNet() {
        return salariuNet;
    }

    public void setSalariuNet(double salariuNet) {
        this.salariuNet = salariuNet;
    }

    public Persoana() {
    }
}
