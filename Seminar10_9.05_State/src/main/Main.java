package main;

import clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz a = new Autobuz(305);
        a.pleacaInCursa();
        a.intraInService();
        a.ieseDinService();
        a.ajungeLaCapatLinie();
        a.pleacaInCursa();
        a.ieseDinService();
        a.intraInService();
        a.ajungeLaCapatLinie();
    }
}
