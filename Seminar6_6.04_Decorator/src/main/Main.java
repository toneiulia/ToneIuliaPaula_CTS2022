package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        PrinterBilet printerBilet = new PrinterBiletConcret("01.12.2021",50);
        printerBilet.afiseazaDescriere();

        Decorator decorator = new PrinterMesajSpecial(printerBilet);
        decorator.afiseazaDescriere();
        decorator.afiseazaVerso();

        PrinterBilet printerBilet1 = new PrinterBiletConcret("17.04.2022",25);
        printerBilet1.afiseazaDescriere();

        Decorator decorator1 = new PrinterMesajPaste(printerBilet1);
        decorator1.afiseazaDescriere();
        decorator1.afiseazaVerso();
    }
}
