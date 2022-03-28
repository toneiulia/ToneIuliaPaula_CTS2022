package ro.ase.dice.SimpleFactory;

public class Tramvai extends MijlocTransport {
    public Tramvai(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Tramvai [getNrInmatriculare()=" + getNrInmatriculare() + ", toString()=" + super.toString()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }
}
