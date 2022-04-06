package clase;

public class AutobuzBuilder implements Builder {
    private String numeSofer;
    private String model;
    private int nrlinie;
    private int nrLocuri;
    private String nrInmatriculare;
    private boolean deschideUsi;
    private boolean opresteLaCapat;

    @Override
    public Autobuz build() {
        return new Autobuz(numeSofer, model, nrlinie, nrLocuri, nrInmatriculare, deschideUsi, opresteLaCapat);
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public AutobuzBuilder setNrlinie(int nrlinie) {
        this.nrlinie = nrlinie;
        return this;
    }

    public AutobuzBuilder setnrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
        return this;
    }

    public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
        return this;
    }

    public AutobuzBuilder setDeschideUsi(boolean deschideUsi) {
        this.deschideUsi = deschideUsi;
        return this;
    }

    public AutobuzBuilder setOpresteLaCapat(boolean opresteLaCapat) {
        this.opresteLaCapat = opresteLaCapat;
        return this;
    }
}