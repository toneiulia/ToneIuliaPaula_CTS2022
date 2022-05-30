package testare.test;

import clase.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.categorii.ITesteCuFake;
import testare.categorii.ITesteCuStub;
import testare.dubluri.PersoanaFake;
import testare.dubluri.PersoanaStub;

import static org.junit.Assert.assertTrue;

public class PachetTuristicTest {

    @Test
    @Category(ITesteCuStub.class)
    public void testPoateRezerva() {
        PersoanaStub persoanaStub = new PersoanaStub();

        PachetTuristic pachetTuristic = new PachetTuristic(persoanaStub, "destinatie", 1000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    //SIMION MARIA:
    /*
    @Test
    @Category(ITesteCuStub.class)
    public void testPoateRezerva(){
        IPersoana persoana= new PersoanaStub();
        IPachetTuristic pachetTuristic= new PachetTuristic(persoana, "Moscova", 2000.5);
        assertTrue(pachetTuristic.poateRezerva());
    }
    */

    //STOICA SIMONA:
    /*
     @Test
    @Category({ITestWithStub.class})
    public void testPoateRezerva() {
        IPersoana persoana = new PersoanaStub();
        IPachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 100.0);
        assertTrue(pachet.poateRezerva());
    }
     */


    @Test
    @Category(ITesteCuFake.class)

    public void testNuRezerva() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setVarsta(18);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "destinatie", 1000.0);
        assertTrue(pachetTuristic.poateRezerva());
    }
}

//SIMION MARIA:
    /*
@Test
@Category({ITesteCuFake.class, ITesteDeRight.class})
public void testNuPoateRezerva(){
    PersoanaFake persoanaFake= new PersoanaFake();
    persoanaFake.setVarsta(17);
    IPachetTuristic pachetTuristic= new PachetTuristic(persoanaFake, "Moscova", 1800.5);
    assertFalse(pachetTuristic.poateRezerva());
}
     */

//STOICA SIMONA:
/*
    @Test
    @Category({ITestWithFake.class, ITestWithRight.class})
    public void testNuPoateRezerva() {
        PersoanaFake persoana = new PersoanaFake();
        persoana.setVarsta(15);
        IPachetTuristic pachet = new PachetTuristic(persoana, "Mamaia", 100.0);
        assertFalse(pachet.poateRezerva());
    }
*/