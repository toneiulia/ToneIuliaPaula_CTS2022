package testare.dubluri;

import claseTestare3.IPachetTuristic;

public class PachetStub implements IPachetTuristic {
    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return (double) 1000; //sau 1000.0
    }
}
