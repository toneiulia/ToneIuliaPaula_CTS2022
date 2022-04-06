package clase.Metrou;

public class ValidatorScanare implements ValidatorMetrou{
    @Override
    public void valideazaBiletMetrou() {
        System.out.println("Biletul de metrou a fost validat!");
    }

    @Override
    public void valideazaAbonamentMetrou() {
        System.out.println("Abonamentul de metrou a fost validat!");
    }

    @Override
    public void valideazaBiletDouaCalatorii() {
        System.out.println("Biletul de metrou pentru doua calatorii a fost validat!");
    }
}
