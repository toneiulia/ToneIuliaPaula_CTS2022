package clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata in valoare de " + suma + " a fost efectuata folosind cardul bancar!");
    }
}