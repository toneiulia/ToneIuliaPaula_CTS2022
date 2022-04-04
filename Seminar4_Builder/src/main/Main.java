package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNrInmatriculare("B 101 XYZ").setNrLinie("104").setNumeSofer("Dan");

        Autobuz autobuz1 = new AutobuzBuilder().setNrLinie("335").setNumeSofer("Mircea").build();
        Autobuz autobuz2 = autobuzBuilder.build();

        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
    }
}