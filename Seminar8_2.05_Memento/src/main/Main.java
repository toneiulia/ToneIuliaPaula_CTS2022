package main;

import clase.Autobaza;
import clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("Ioan", 6, 2000, "Mercedes");

        Autobaza autobaza = new Autobaza();
        autobaza.adaugaMementoAutobuz(a1.createMementoAutobuz());

        a1.setNumeSofer("Mihai");
        autobaza.adaugaMementoAutobuz(a1.createMementoAutobuz());

        a1.setConsumMediu(8);
        autobaza.adaugaMementoAutobuz(a1.createMementoAutobuz());

        System.out.println(a1);
        a1.setMementoAutobuz(autobaza.getMementoAutobuz(0));
        System.out.println(a1);
    }
}