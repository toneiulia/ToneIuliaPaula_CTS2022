package clase;

public class Linie {
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Linie [nrLinie=");
        builder.append(nrLinie);
        builder.append(", primaStatie=");
        builder.append(primaStatie);
        builder.append(", ultimaStatie=");
        builder.append(ultimaStatie);
        builder.append("]");
        return builder.toString();
    }
}