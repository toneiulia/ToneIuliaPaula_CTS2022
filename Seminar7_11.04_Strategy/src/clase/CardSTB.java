package clase;

public class CardSTB implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata in valoare de " + suma + " a fost efectuata folosind cardul STB!");
    }
}