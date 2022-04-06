package main;

import clase.Metrou.ValidatorAdapterClase;
import clase.Metrou.ValidatorAdapterObiecte;
import clase.Metrou.ValidatorScanare;
import clase.STB.ValidatorNFC;
import clase.STB.ValidatorSTB;

public class Main {
    private static void validareAbonamente(ValidatorSTB validator) {
        validator.valideazaAbonament();
    }

    public static void main(String[] args) {
        ValidatorSTB val = new ValidatorNFC();
        validareAbonamente(val);

//        ValidatorMetrou val2 = new ValidatorScanare();
//        validareAbonamente(val2);

        // ADAPTER OBIECTE
        ValidatorScanare validatorScanare = new ValidatorScanare();
        ValidatorAdapterObiecte adapterObiecte = new ValidatorAdapterObiecte(validatorScanare);
        adapterObiecte.valideazaAbonament();
        adapterObiecte.valideazaBilet();

        // ADAPTER CLASE
        ValidatorAdapterClase validatorClase = new ValidatorAdapterClase();
//        validatorClase.valideazaBilet();
//        validatorClase.valideazaAbonament();
        validareAbonamente(validatorClase);
    }
}
