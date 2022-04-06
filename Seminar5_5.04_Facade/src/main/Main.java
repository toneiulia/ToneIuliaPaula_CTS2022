package main;

import clase.Autobuz;
import clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(new Autobuz());
        facade.deschideUsi();
        facade.liberUsi();
    }
}
