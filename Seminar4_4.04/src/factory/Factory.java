package factory;

import clase.MijlocTransport;

public interface Factory {
    public abstract MijlocTransport getMijlocTransport(String nrInmatriculare);
}
