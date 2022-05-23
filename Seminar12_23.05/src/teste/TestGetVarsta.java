package teste;

import clase.CNPInvalidException;
import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGetVarsta {

    @Test
    public void testVarstaRight() {
        assertEquals(23, new Persoana("Mircea", "1981212812312").getVarsta());
    }

    @Test
    public void testVarstaBoundaryInferior() {
        assertEquals(222, new Persoana("Alex", "3000101812312").getVarsta());
    }

    @Test
    public void testVarstaBoundarySuperior() {
        assertEquals(0, new Persoana("George", "5220101812312").getVarsta());
    }

    @Test(expected = CNPInvalidException.class)
    public void testVarstaError() {
        new Persoana("Alin", "5270101812312").getVarsta();
    }

    @Test(timeout = 100)
    public void testVarstaPerformance() {
        new Persoana("Alex", "5030101812312").getVarsta();
    }

    @Test
    public void testVarstaFormat() {
        assertTrue(new Persoana("Andrei", "5030101812312").getVarsta() >= 0);
    }

    @Test
    public void testVarstaOrdering() {
        assertTrue(new Persoana("Alex", "198101812312").getVarsta() >
                new Persoana("Alex", "5020101812312").getVarsta());
    }

    @Test(expected = NullPointerException.class)
    public void testVarstaExistence(){
        new Persoana("Cassandra", null).getVarsta();
    }
}