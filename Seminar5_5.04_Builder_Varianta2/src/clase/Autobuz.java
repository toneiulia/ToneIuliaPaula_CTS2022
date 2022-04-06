package clase;

public class Autobuz {
    private String numeSofer;
    private String model;
    private int nrlinie;
    private int nrLocuri;
    private String nrInmatriculare;
    private boolean deschideUsi;
    private boolean opresteLaCapat;

    Autobuz(String numeSofer, String model, int nrlinie, int nrLocuri, String nrInmatriculare, boolean deschideUsi, boolean opresteLaCapat) {
        this.numeSofer = numeSofer;
        this.model = model;
        this.nrlinie = nrlinie;
        this.nrLocuri = nrLocuri;
        this.nrInmatriculare = nrInmatriculare;
        this.deschideUsi = deschideUsi;
        this.opresteLaCapat = opresteLaCapat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrlinie=").append(nrlinie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", deschideUsi=").append(deschideUsi);
        sb.append(", opresteLaCapat=").append(opresteLaCapat);
        sb.append('}');
        return sb.toString();
    }
}