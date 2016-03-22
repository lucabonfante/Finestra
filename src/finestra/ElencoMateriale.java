package finestra;

import java.util.HashMap;

public class ElencoMateriale {
    
    private HashMap<String, Materiale> mapt = new HashMap<>();

    public HashMap<String, Materiale> getMapt() {
        return mapt;
    }

    public void setMapt(HashMap<String, Materiale> mapt) {
        this.mapt = mapt;
    }

    @Override
    public String toString() {
        return "ElencoMateriale{" + "mapt=" + mapt + '}';
    }
    
    public void addMateriale(Materiale m) {
        mapt.put(m.getTipo(), m);
    }

}
