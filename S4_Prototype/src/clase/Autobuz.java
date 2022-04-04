package clase;

public class Autobuz implements MijlocTransport{
    private String sofer;

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    public Autobuz(String sofer) {
        this.sofer = sofer;
    }

    public String getSofer() {
        return sofer;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("sofer='").append(sofer).append('\'');
        sb.append('}');
        return sb.toString();
    }
}