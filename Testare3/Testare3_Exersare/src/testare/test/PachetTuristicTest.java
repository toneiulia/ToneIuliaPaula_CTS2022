package testare.test;

import claseTestare3.IPachetTuristic;
import claseTestare3.IPersoana;
import claseTestare3.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.categorii.ITesteCuFake;
import testare.categorii.ITesteCuStub;
import testare.categorii.ITesteDeRight;
import testare.dubluri.PersoanaFake;
import testare.dubluri.PersoanaStub;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PachetTuristicTest {

    @Test
    @Category(ITesteCuStub.class)
    public void testPoateRezerva(){
        PersoanaStub persoanaStub = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaStub, "Sinaia",1000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(ITesteCuStub.class)
    public void testPoateRezerva2(){
        IPersoana persoana= new PersoanaStub();
        IPachetTuristic pachetTuristic = new PachetTuristic(persoana, "Sinaia",1000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(ITesteCuFake.class)
    public void testNuRezerva(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(18);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Mamaia", 1000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category({ITesteCuFake.class, ITesteDeRight.class})
    public void testNuPoateRezerva(){
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(16);
        IPachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Spania", 1850.0);
        assertFalse(pachetTuristic.poateRezerva());
    }
//si daca puneam de la 18 ani in sus -> foloseam assertTrue
}
