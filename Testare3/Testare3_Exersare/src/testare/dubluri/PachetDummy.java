package testare.dubluri;

import claseTestare3.IPachetTuristic;

public class PachetDummy implements IPachetTuristic {
    @Override
    public boolean poateRezerva() {
        return false;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return null;
    }
}
