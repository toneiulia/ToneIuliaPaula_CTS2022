package clase;

public abstract class Handler {
    protected Handler handler;
    protected int limita;

    public Handler(int limita) {
        this.limita = limita;
        this.handler = null;
    }

    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    public void setLimita(int limita) {
        this.limita = limita;
    }

    public abstract void afisareMijlocTransport(int distanta);
}