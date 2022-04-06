package clase;

public class Facade {
    private Autobuz autobuz;

    public Facade(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public void deschideUsi(){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public void liberUsi(){
        autobuz.liberUsaFata();
        autobuz.liberUsaMijloc();
        autobuz.liberUsaSpate();
    }
}