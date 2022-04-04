package clase;

public class Troleibuz implements MijlocTransport{
    private String vatman;

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    public Troleibuz(String vatman) {
        this.vatman = vatman;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("vatman='").append(vatman).append('\'');
        sb.append('}');
        return sb.toString();
    }
}