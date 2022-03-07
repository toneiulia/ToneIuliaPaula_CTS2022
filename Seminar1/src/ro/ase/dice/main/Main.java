package ro.ase.dice.main;

import ro.ase.dice.clase.Elefant;
import ro.ase.dice.clase.IngrijitorZOO;
import ro.ase.dice.clase.ZOO;
import ro.ase.dice.clase.Zebra;

public class Main {

    public static void main(String[] args) {
        IngrijitorZOO ingrijitorZoo = new IngrijitorZOO("Ingrijitor");

        Zebra z1 = new Zebra("Zebra1");
        Zebra z2 = new Zebra("Zebra2");

        Elefant e1 = new Elefant("Elefant1");
        Elefant e2 = new Elefant("Elefant2");

        ZOO zoo = new ZOO("Gradina Zoologica", ingrijitorZoo);

        zoo.adaugaAnimal(z1);
        zoo.adaugaAnimal(z2);
        zoo.adaugaAnimal(e1);
        zoo.adaugaAnimal(e2);

        zoo.hranesteAnimale("iarba.");
    }
}