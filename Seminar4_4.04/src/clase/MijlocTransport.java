package clase;

public abstract class MijlocTransport {
    private String nrInmatriculare;

    public MijlocTransport(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    protected String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public abstract void afiseazaDescriere();
}