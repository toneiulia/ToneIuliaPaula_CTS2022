package clase;

public class Autobuz implements AutobuzLinie {
    private String model;
    private int an;
    private int nrLocuri;


    public Autobuz(String model, int an, int nrLocuri) {
        this.model = model;
        this.an = an;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descrie(Linie linie) {
        System.out.println(this.toString());
        System.out.println(linie.toString());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Autobuz [model=");
        builder.append(model);
        builder.append(", an=");
        builder.append(an);
        builder.append(", nrLocuri=");
        builder.append(nrLocuri);
        builder.append("]");
        return builder.toString();
    }
}