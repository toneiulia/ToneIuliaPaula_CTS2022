package testare;

import clase.Matematica;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTest {

    private Matematica matematica;

    @Before
    public void creeazaObiectMatematica(){
        this.matematica = Matematica.getInstantaMatematica();
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClasa");
    }

    @Test
    public void testSumaCorecta(){
//        Matematica matematica = new Matematica();
        assertEquals(8, matematica.suma(3,5));
    }

    @Test
    public void testSumaNrIdentice(){
//        Matematica matematica = new Matematica();
        int numar = 3;
        assertEquals(6, matematica.suma(numar, numar));
    }

    @Test
    public void testRaportCorect(){
//        Matematica matematica = new Matematica();
        assertEquals(2, matematica.raport(4,2), 0.01);
    }

    @Test
    public void testRaportCuRezultatNrReal(){
        assertEquals(2.5, matematica.raport(5, 2), 0.001);
    }

    //prin JUnit3 cu mecanismul try catch
    @Test
    public void testRaportShouldThrowException(){
        try{
            matematica.raport(56, 0);
            fail("Metoda raport nu arunca exceptie");
        }catch (IllegalArgumentException exceptie){

        }
    }

    //prin JUnit4 adnotare cu param
    @Test(expected = IllegalArgumentException.class)
    public void testRaportThrowException(){
        matematica.raport(49, 0);
    }

    @Test
    public void testVerificaPar(){
        assertTrue(matematica.estePar(2));
        assertFalse(matematica.estePar(3));
        assertTrue(matematica.estePar(0));
        assertTrue(matematica.estePar(-2));
        assertFalse(matematica.estePar(-5));
    }

    @Test
    public void testReturneazaListaNrPare(){
        assertEquals(4, matematica.nNumerePare(4).size());
    }

    @Test
    public void testListaNumere(){
        List<Integer> lista = matematica.nNumerePare(4);
        for(Integer i : lista){
            //assertTrue(matematica.estePar(i));
            assertTrue(i % 2 == 0);
        }
    }

    @Test
    public void testListaNull(){
        assertNull(matematica.nNumerePare(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testListaIndexNegativ(){
        matematica.nNumerePare(-3);
    }

    @Test
    public void testSingleton(){
        Matematica mate1 = Matematica.getInstantaMatematica();
        assertSame(matematica, mate1);
    }

    @Test
    public void testOrdineCrescatoareLista(){
        List<Integer> listaPare = matematica.nNumerePare(4);
        for(int i = 0; i < listaPare.size() - 1; i++){
            assertTrue(listaPare.get(i) < listaPare.get(i + 1));
        }
    }
}