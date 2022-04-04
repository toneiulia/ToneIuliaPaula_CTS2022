package main;

import clase.Autobuz;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz a1 = new Autobuz("Paul");
        Autobuz a2 = (Autobuz) a1.copiaza();
        a2.setSofer("Laurentiu");

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}