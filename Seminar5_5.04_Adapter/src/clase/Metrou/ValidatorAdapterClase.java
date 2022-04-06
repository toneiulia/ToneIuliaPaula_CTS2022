package clase.Metrou;

import clase.STB.ValidatorSTB;

public class ValidatorAdapterClase extends ValidatorScanare implements ValidatorSTB {
    @Override
    public void valideazaBilet() {
        super.valideazaBiletMetrou();
    }

    @Override
    public void valideazaAbonament() {
        super.valideazaAbonamentMetrou();
    }
}
