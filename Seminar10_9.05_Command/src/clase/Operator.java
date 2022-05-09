package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    private List<Comanda> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void invoca(Comanda comanda){
        comenzi.add(comanda);
    }
    public void executaComanda(){
        if(comenzi.size() > 0){
            comenzi.get(0).executa();
            comenzi.remove(0);
        }
    }
}