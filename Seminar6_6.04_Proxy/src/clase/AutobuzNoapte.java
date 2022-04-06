package clase;

public class AutobuzNoapte implements MijlocTransport {
    Autobuz autobuz;

    public AutobuzNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if (autobuz.getNrCalatori() > 0){
            autobuz.opresteInStatie();
        } else {
            System.out.println("Autobuzul " + autobuz.getNrLinie() + " cu " + autobuz.getNrCalatori() + " calatori, se retrage la autobaza.");
        }
    }

    @Override
    public void setNrCalatori(int nrCalatori) {
        autobuz.setNrCalatori(nrCalatori);
    }
}