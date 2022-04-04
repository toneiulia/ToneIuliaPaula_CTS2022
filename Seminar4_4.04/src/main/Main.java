package main;

import clase.MijlocTransport;
import factory.Factory;
import factory.AutobuzFactory;
import factory.TramvaiFactory;
import factory.TroleibuzFactory;

public class Main {
    public static void afisareMijlocTransport(Factory fabrica, String nrInmatriculare){
        MijlocTransport mijlocTransport = fabrica.getMijlocTransport(nrInmatriculare);
        mijlocTransport.afiseazaDescriere();
    }

    public static void main(String[] args) {
        afisareMijlocTransport(new AutobuzFactory(), "B 756318");
        MijlocTransport troleibuz = new TroleibuzFactory().getMijlocTransport("B 193737");
        troleibuz.afiseazaDescriere();
        new TramvaiFactory().getMijlocTransport("B 993815").afiseazaDescriere();
    }
}
