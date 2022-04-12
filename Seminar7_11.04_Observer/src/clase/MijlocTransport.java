package clase;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
    private List<ICalator> lista;
    private int nrlinie;

    public MijlocTransport(int nrlinie) {
        lista = new ArrayList<>();
        this.nrlinie = nrlinie;
    }

    public void adaugaCalator(ICalator calator) {
        lista.add(calator);
    }

    public void stergeCalator(ICalator calator) {
        lista.remove(calator);
    }

    public void trimiteMesaj(String mesaj) {
        for (ICalator calator : lista) {
            calator.primireMesaj(mesaj);
        }
    }

    public void trimiteMesajPlecareCapatLinie() {
        trimiteMesaj("Mijlocul de transport " + nrlinie + " a plecat din statie.");
    }
}