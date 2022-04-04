package factory;

import clase.Autobuz;
import clase.MijlocTransport;

public class AutobuzFactory implements Factory {
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}