package clase;

public class Autobuz implements MijlocTransport {
    private int nrCalatori;
    private int nrLinie;

    public Autobuz(int nrCalatori, int nrLinie) {
        this.nrCalatori = nrCalatori;
        this.nrLinie = nrLinie;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul " + nrLinie + " cu " + nrCalatori + " calatori, a oprit in statie.");
    }

    @Override
    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    public int getNrLinie() {
        return nrLinie;
    }
}