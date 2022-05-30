package clase;

import java.util.ArrayList;
import java.util.List;

public class AgentieTurism {

    //private List<PachetTuristic> pacheteTuristice; //IPachet in loc de PachetTuristic
    private List<IPachetTuristic> pacheteTuristice;

    public AgentieTurism() {
        pacheteTuristice = new ArrayList<IPachetTuristic>();
    }

    public void adaugaPachet(IPachetTuristic pachet) {
        pacheteTuristice.add(pachet);
    }

    public int getNumarPacheteTuristice() { //adaugata in plus fata de ase.acs
        return pacheteTuristice.size();
    }

    public double calculareSumaTotalaPachete() {
        double suma = 0;
        for (IPachetTuristic pachet : pacheteTuristice) {
            suma += pachet.getPret();
        }
        return suma;
    }
}

//Doua categorii:
//claseAgentie
//clasePersoana


//Da, ne folosim de proiectul de la seminarul trecut.