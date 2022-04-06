package clase;

public class PrinterMesajPaste extends Decorator{
    public PrinterMesajPaste(PrinterBilet printerBilet) {
        super(printerBilet);
    }

    @Override
    public void afiseazaVerso() {
        System.out.println("Paste fericit!");
        System.out.println(":)");
    }
}