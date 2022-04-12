package clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer, Linie> linii;

    public FlyweightFactory() {
        this.linii = new HashMap<Integer, Linie>();
    }

    public Linie getLinie(int nrLinie) {
        if (linii.get(nrLinie) != null) {
            return linii.get(nrLinie);
        } else {
            linii.put(nrLinie, new Linie(nrLinie, "Prima statie", "Ultima statie"));
            return linii.get(nrLinie);
        }
    }
}