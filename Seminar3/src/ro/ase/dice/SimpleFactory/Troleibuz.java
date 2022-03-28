package ro.ase.dice.SimpleFactory;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Troleibuz [getNrInmatriculare()=");
        builder.append(getNrInmatriculare());
        builder.append(", toString()=");
        builder.append(super.toString());
        builder.append(", getClass()=");
        builder.append(getClass());
        builder.append(", hashCode()=");
        builder.append(hashCode());
        builder.append("]");
        return builder.toString();
    }
}
