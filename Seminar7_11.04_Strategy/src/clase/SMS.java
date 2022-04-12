package clase;

public class SMS implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata in valoare de " + suma + " a fost efectuata prin SMS!");
    }
}