package testare.test;

import static org.junit.Assert.*;

import claseTestare3.IPachetTuristic;
import claseTestare3.PachetTuristic;
import org.junit.Test;
import testare.dubluri.PersoanaFake;

public class TestPersoana {

    @Test
    public void testPoateRezerva() {
        PersoanaFake persoanaF = new PersoanaFake();
        persoanaF.setVarsta(22); //peste 18 ani
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaF, "Iasi", 1000.0);
        assertTrue(pachetTuristic.poateRezerva()); //assertTrue
    }


    @Test
    public void testPoateRezervaBoundary() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(18);
        IPachetTuristic pachet = new PachetTuristic(persoana, "Iasi", 1000.0);
        assertTrue(pachet.poateRezerva());
    }

    @Test
    public void testAplicaDiscountVarstniciFake() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(75);
        IPachetTuristic pachet = new PachetTuristic(persoana, "Iasi", 1000.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(900.0, pachet.getPret(), 0.01);
    }

    @Test
    public void testNuAplicaDiscountVarstniciFake() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(35);
        IPachetTuristic pachet = new PachetTuristic(persoana, "Iasi", 1000.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(1000.0, pachet.getPret(), 0.01);
    }

    @Test
    public void testAplicaDiscountVarstniciBoundarySup() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(65);
        IPachetTuristic pachet = new PachetTuristic(persoana, "Iasi", 1000.0);
        pachet.aplicaDiscountVarstnici(10);
        assertEquals(900.0, pachet.getPret(), 0.01);
    }


    @Test
    public void testDiscountBoundary() { //testProcentAplicaDiscountVarstniciBoundary()
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(80);
        IPachetTuristic pachet = new PachetTuristic(persoana, "Iasi", 1000.0);
        pachet.aplicaDiscountVarstnici(100);
        assertEquals(0, pachet.getPret(), 0.01);
    }
}