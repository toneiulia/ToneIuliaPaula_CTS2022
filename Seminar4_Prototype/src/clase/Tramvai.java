package clase;

public class Tramvai implements MijlocTransport{
    private String vatman;

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    public Tramvai(String vatman) {
        this.vatman = vatman;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("vatman='").append(vatman).append('\'');
        sb.append('}');
        return sb.toString();
    }
}