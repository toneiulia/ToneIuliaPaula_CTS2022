package factory;

import clase.MijlocTransport;
import clase.Troleibuz;

public class TroleibuzFactory implements Factory {
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}