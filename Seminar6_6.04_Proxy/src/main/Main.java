package main;

import clase.Autobuz;
import clase.AutobuzNoapte;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(4,335);
        autobuz.opresteInStatie();

        autobuz.setNrCalatori(0);
        autobuz.opresteInStatie();

        System.out.println();

        AutobuzNoapte autobuzNoapte = new AutobuzNoapte(autobuz);
        autobuzNoapte.setNrCalatori(2);
        autobuzNoapte.opresteInStatie();

        autobuzNoapte.setNrCalatori(0);
        autobuzNoapte.opresteInStatie();
    }
}