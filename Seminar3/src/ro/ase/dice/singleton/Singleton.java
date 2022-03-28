package ro.ase.dice.singleton;

public class Singleton {
    private static Singleton instanta = null;
    private String nume;

    private Singleton() {}

    public static synchronized Singleton getInstanta() {
        if(instanta == null) instanta = new Singleton();
        return instanta;
    }
}

