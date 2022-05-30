package testare.dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {

    public String valoareReturnataDeSex; //Simion Maria: String sex; //Stoica Simona: private String sex;
    public int valoareReturnataDeVarsta; //Simion Maria: Integer varsta; //Stoica Simona: private int varsta;
    public boolean valoareReturnataDeCheckCNP; //Simion Maria: Boolean cnp; //Stoica Simona: private boolean check;
    //Strat Madalina: String sex; int varsta; boolean checkCNP;

    public boolean isCheckCNP() {
        return valoareReturnataDeCheckCNP; //? getter? // celelalte fete nu au
    }

    //Simion Maria are doar setteri pentru sex, varsta si cnp. //La fel si celelalte fete.

    public void setCheckCNP(boolean checkCNP) {
        this.valoareReturnataDeCheckCNP = checkCNP;
    }

    public void setSex(String sex) {
        this.valoareReturnataDeSex = sex;
    }

    public void setVarsta(int varsta) {
        this.valoareReturnataDeVarsta = varsta;
    }

    @Override
    public String getSex() {
        return this.valoareReturnataDeSex; // S.M.: return sex;
    }

    @Override
    public int getVarsta() {
        return this.valoareReturnataDeVarsta; // S.M.: return varsta;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }
    //Simion Maria: return cnp; //Stoica Simona: return false; //Strat Madalina: return checkCNP;
}