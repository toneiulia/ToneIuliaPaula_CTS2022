package testare.test;

import claseTestare3.AgentieTurism;
import claseTestare3.IPachetTuristic;
import claseTestare3.PachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.categorii.ITesteCuDummy;
import testare.categorii.ITesteCuFake;
import testare.categorii.ITesteDeRight;
import testare.dubluri.PachetDummy;
import testare.dubluri.PachetFake;
import testare.dubluri.PachetStub;

import static org.junit.Assert.assertEquals;

public class AgentieTurismTest {

    @Test
    @Category(ITesteCuDummy.class)
    public void testAdaugaPachet(){
        AgentieTurism agentieTurism = new AgentieTurism();
        IPachetTuristic pachetD = new PachetDummy();

        agentieTurism.adaugaPachet(pachetD);
        assertEquals(1, agentieTurism.getNumarPacheteTuristice());
    }

    @Test
    @Category({ITesteCuFake.class})
    public void testCalculareSumaTotalaPachete(){
        AgentieTurism agentieTurism =  new AgentieTurism();
        PachetStub pachet1 = new PachetStub();
        PachetStub pachet2 = new PachetStub();

        agentieTurism.adaugaPachet(pachet1);
        agentieTurism.adaugaPachet(pachet2);

        assertEquals(2000, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }

    @Test
    @Category({ITesteCuFake.class, ITesteDeRight.class})
    public void testCalculareSumaTotalaPacheteFake(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake pachetF1 = new PachetFake();
        PachetFake pachetF2 = new PachetFake();

        pachetF1.setPret(1000);
        pachetF2.setPret(500);

        agentieTurism.adaugaPachet(pachetF1);
        agentieTurism.adaugaPachet(pachetF2);

        assertEquals(1500, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }
}
