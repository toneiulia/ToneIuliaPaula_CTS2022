package testare.dubluri;

import claseTestare3.IPachetTuristic;

public class PachetFake implements IPachetTuristic {

    Double pret;
    Boolean rezervare;

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setRezervare(Boolean rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public boolean poateRezerva() {
        return rezervare;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return pret;
    }
}
