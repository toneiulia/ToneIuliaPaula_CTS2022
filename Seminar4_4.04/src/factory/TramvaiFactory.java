package factory;

import clase.MijlocTransport;
import clase.Tramvai;

public class TramvaiFactory implements Factory {
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}