package testare.dubluri;

import clase.IPersoana;

public class PersoanaStub implements IPersoana {
    @Override
    public String getSex() {
        return "F";
    }

    @Override
    public int getVarsta() {
        return 18;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
    //return true;
//Simion Maria: return false; //Stoica Simona: return false; //Strat Madalina: return false;
}