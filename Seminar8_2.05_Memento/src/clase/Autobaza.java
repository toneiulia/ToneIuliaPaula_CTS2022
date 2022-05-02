package clase;

import java.util.ArrayList;
import java.util.List;

public class Autobaza {
    private List<MementoAutobuz> lista;

    public Autobaza() {
        lista = new ArrayList<>();
    }

    public void adaugaMementoAutobuz(MementoAutobuz mementoAutobuz) {
        lista.add(mementoAutobuz);
    }

    public MementoAutobuz getMementoAutobuz(int index) {
        return lista.get(index);
    }
}