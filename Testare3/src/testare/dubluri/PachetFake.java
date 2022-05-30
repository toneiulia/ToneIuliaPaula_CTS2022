package testare.dubluri;

import clase.IPachetTuristic;

public class PachetFake implements IPachetTuristic {
    private double pret; //Double?
    private boolean rezervare;

    //Stoica Simona le are cu private
    //Strat Madalina: Boolean rezerva; Double pret;

    public Boolean getRezervare() {
        return rezervare;
    }

    public void setRezervare(Boolean rezervare) {
        this.rezervare = rezervare;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }


    //Simion Maria are doar setteri pentru rezervare si pret. //La fel si Stoica Simona.

    @Override
    public boolean poateRezerva() {
        return rezervare;
    }
    //return false;

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return pret;
    }
    //return null;
}