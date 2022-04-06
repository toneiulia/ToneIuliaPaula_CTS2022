package clase;

public class PrinterMesajSpecial extends Decorator{
    public PrinterMesajSpecial(PrinterBilet printerBilet) {
        super(printerBilet);
    }

    @Override
    public void afiseazaVerso() {
        System.out.println("La multi ani!");
    }
}
