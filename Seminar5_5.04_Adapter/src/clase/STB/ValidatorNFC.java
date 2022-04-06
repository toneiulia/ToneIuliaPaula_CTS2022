package clase.STB;

public class ValidatorNFC implements ValidatorSTB{
    @Override
    public void valideazaBilet() {
        System.out.println("Biletul STB a fost validat!");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Abonamentul STB a fost validat!");
    }
}
