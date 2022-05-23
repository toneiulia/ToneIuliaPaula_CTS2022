package teste;

import clase.CNPInvalidException;
import clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGetSex {

    @Test
    public void testRightM() {
        Persoana persoana = new Persoana("Andrei", "5010109161702");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testBoundaryInferior() {
        Persoana persoana = new Persoana("Robert", "1970808161603");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void testBoundarySuperior() {
        Persoana persoana = new Persoana("Emilia", "6030808161603");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void testCrossCheck() {
        Persoana persoana = new Persoana("Florina", "6030808161603");
        int cifra = persoana.CNP.charAt(0);
        assertEquals(cifra % 2 != 0 ? "M" : "F", persoana.getSex());
    }

    @Test(expected = CNPInvalidException.class)
    public void testErrorZero() {
        new Persoana("Ioana", "0030808161603").getSex();
    }

    @Test(expected = CNPInvalidException.class)
    public void testErrorCharacter() {
        new Persoana("Mihai", "d030808161603").getSex();
    }

    @Test(timeout = 100)
    public void testPerformance() {
        new Persoana("Marius", "5030808161603").getSex();
    }

    @Test
    public void testFormat() {
        assertEquals(1, new Persoana("Ionela", "5030808161603").getSex().length());
    }

    @Test
    public void testRangeRight() {
        assertEquals("N/A", new Persoana("Anastastia", "8030808161603").getSex());
    }

    @Test(expected = NullPointerException.class)
    public void testExists() {
        new Persoana("Antonia", null).getSex();
    }
}