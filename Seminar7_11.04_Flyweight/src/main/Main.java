package main;

import clase.Autobuz;
import clase.AutobuzLinie;
import clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie a1 = new Autobuz("Mercedes", 2011, 50);
        AutobuzLinie a2 = new Autobuz("Otokar", 2008, 40);
        AutobuzLinie a3 = new Autobuz("Mercedes", 2016, 45);
        AutobuzLinie a4 = new Autobuz("Mercedes", 2020, 50);

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        a1.descrie(flyweightFactory.getLinie(168));
        a2.descrie(flyweightFactory.getLinie(226));
        a3.descrie(flyweightFactory.getLinie(168));
        a4.descrie(flyweightFactory.getLinie(137));
    }
}