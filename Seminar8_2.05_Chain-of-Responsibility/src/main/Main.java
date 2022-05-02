package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Handler autobuzHandler = new AutobuzHandler(5);
        Handler tramvaiHandler = new TramvaiHandler(10);
        Handler troleibuzHandler = new TroleibuzHandler(3);
        Handler metrouHandler = new MetrouHandler(1000);

        troleibuzHandler.setNextHandler(autobuzHandler);
        autobuzHandler.setNextHandler(tramvaiHandler);
        tramvaiHandler.setNextHandler(metrouHandler);

        troleibuzHandler.afisareMijlocTransport(7);
        troleibuzHandler.afisareMijlocTransport(20);
        troleibuzHandler.afisareMijlocTransport(2);
        troleibuzHandler.afisareMijlocTransport(4);

        System.out.println();
        //Cluj
        Handler autobuzCluj = new AutobuzHandler(1000);
        Handler tramvaiCluj = new TramvaiHandler(2);
        Handler troleibuzCluj = new TroleibuzHandler(5);

        tramvaiCluj.setNextHandler(troleibuzCluj);
        troleibuzCluj.setNextHandler(autobuzCluj);

        tramvaiCluj.afisareMijlocTransport(1);
        tramvaiCluj.afisareMijlocTransport(3);
        tramvaiCluj.afisareMijlocTransport(10);
    }
}