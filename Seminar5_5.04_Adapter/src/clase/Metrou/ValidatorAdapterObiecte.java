package clase.Metrou;

import clase.STB.ValidatorSTB;

public class ValidatorAdapterObiecte implements ValidatorSTB {

    private ValidatorMetrou validatorMetrou;

    public ValidatorAdapterObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
        validatorMetrou.valideazaBiletMetrou();
    }

    @Override
    public void valideazaAbonament() {
        validatorMetrou.valideazaAbonamentMetrou();
    }
}
