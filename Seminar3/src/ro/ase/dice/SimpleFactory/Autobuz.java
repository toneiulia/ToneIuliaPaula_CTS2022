package ro.ase.dice.SimpleFactory;

public class Autobuz extends MijlocTransport{
    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Autobuz [getNrInmatriculare()=" + getNrInmatriculare() + ", toString()=" + super.toString()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }
}
