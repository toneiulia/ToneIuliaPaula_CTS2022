package testare.test;

import clase.AgentieTurism;
import clase.IPachetTuristic;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testare.categorii.ITesteCuFake;
import testare.categorii.ITesteCuDummy;
import testare.dubluri.PachetDummy;
import testare.dubluri.PachetStub;

import static org.junit.Assert.assertEquals;

public class AgentieTurismTest {

    @Test
    @Category(ITesteCuDummy.class)
    public void testAdaugaPachet() {
        AgentieTurism agentieTurism = new AgentieTurism();
        IPachetTuristic pachetD = new PachetDummy();

        agentieTurism.adaugaPachet(pachetD);
        assertEquals(1, agentieTurism.getNumarPacheteTuristice());

    }
    //la fel are si Stoica Simona //si Strat Madalina

    @Test
    @Category(ITesteCuFake.class)
    public void testCalculeazaSumaTotala() {
        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(new PachetStub());
        agentieTurism.adaugaPachet(new PachetStub());

        assertEquals(2000, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }
}

//SIMION MARIA:
/*
@Test
@Category({ITesteCuFake.class, ITesteDeRight.class})
public void calculSumaPachete(){
    AgentieTurism agentieTurism= new AgentieTurism();
    PachetFake pachetF1= new PachetFake();
    PachetFake pachetF2= new PachetFake();

    pachetF1.setPret(1000);
    pachetF2.setPret(500);

    agentieTurism.adaugaPachet(pachetF1);
    agentieTurism.adaugaPachet(pachetF2);
    assertEquals(1500, agentieTurism.calculareSumaTotalaPachete(), 0.01);
}
 */

//STOICA SIMONA:
/*
    @Test
    @Category({ITestWithFake.class, ITestWithRight.class})
    public void testCalculSumaPachete() {
        AgentieTurism agentie = new AgentieTurism();
        PachetFake pachet1 = new PachetFake();
        PachetFake pachet2 = new PachetFake();

        pachet1.setPret(100.0);
        pachet2.setPret(10.0);

        agentie.adaugaPachet(pachet1);
        agentie.adaugaPachet(pachet2);

        assertEquals(110.0, agentie.calculareSumaTotalaPachete(), 0.01);

    }
*/


//STRAT MADALINA:
/*
  @Test
    @Category({TestCuFake.class, TestDeRIGHT.class})
    public void testCalculSumaTotalaPachete(){
        AgentieTurism agentieTurism = new AgentieTurism();
        PachetFake pachetF1 = new PachetFake();
        PachetFake pachetF2 = new PachetFake();

        pachetF1.setPret(1000.0);
        pachetF2.setPret(500.0);

        agentieTurism.adaugaPachet(pachetF1);
        agentieTurism.adaugaPachet(pachetF2);

        assertEquals(1500, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }
 */
