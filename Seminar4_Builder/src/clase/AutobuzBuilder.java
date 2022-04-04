package clase;

public class AutobuzBuilder implements Builder {
    private Autobuz autobuz;

    public AutobuzBuilder() {
        autobuz = new Autobuz();
    }

    @Override
    public Autobuz build() {
        return autobuz;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setNrInmatriculare(String nrInmatriculare) {
        autobuz.setNrInmatriculare(nrInmatriculare);
        return this;
    }

    public AutobuzBuilder setNrLinie(String nrLinie) {
        autobuz.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuilder setDeschideUsi(boolean deschideUsi) {
        autobuz.setDeschideUsi(deschideUsi);
        return this;
    }

    public AutobuzBuilder setOprireCapatLinie(boolean oprireCapatLinie) {
        autobuz.setOprireCapatLinie(oprireCapatLinie);
        return this;
    }

    public AutobuzBuilder setTextDerulat(String textDerulat) {
        autobuz.setTextDerulat(textDerulat);
        return this;
    }

    public AutobuzBuilder setNrLocuri(int nrLocuri) {
        autobuz.setNrLocuri(nrLocuri);
        return this;
    }
}