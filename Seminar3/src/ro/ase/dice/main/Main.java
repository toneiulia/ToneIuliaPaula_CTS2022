package ro.ase.dice.main;

import ro.ase.dice.SimpleFactory.FabricaMijlocTransport;
import ro.ase.dice.SimpleFactory.MijlocTransport;
import ro.ase.dice.SimpleFactory.TipMijlocTransport;
import ro.ase.dice.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        // SINGLETON
        Singleton s1 = Singleton.getInstanta();
        Singleton s2 = Singleton.getInstanta();
        System.out.println(s1);
        System.out.println(s2);

        // SIMPLE FACTORY
        MijlocTransport autobuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Autobuz, "IF75PMI");
        MijlocTransport tramvai = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Tramvai, "B111MIR");
        MijlocTransport troleibuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Troleibuz, "IF77CRS");
        System.out.println(autobuz);
    }
}
