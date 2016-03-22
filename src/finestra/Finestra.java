package finestra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Finestra {

    private double lunghezza;
    private double larghezza;
    private Modello md;

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public Modello getMd() {
        return md;
    }

    public void setMd(Modello md) {
        this.md = md;
    }

    public Finestra(double lunghezza, double larghezza, Modello md) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.md = md;
    }

    @Override
    public String toString() {
        return "Finestra{" + "lunghezza=" + lunghezza + ", larghezza=" + larghezza + ", md=" + md + '}';
    }
    
    public double calcolaSommaFinestra(ElencoMateriale em){
        HashMap<String, Materiale> mappa = new HashMap<>();
        mappa = em.getMapt();
        Materiale cornice = mappa.get(md.getCornice());
        Materiale vetro = mappa.get(md.getVetro());
        double somma = 0;
        somma += (double)(this.larghezza+this.lunghezza)*2*cornice.getCosto();     //cornice
        somma += (double)(this.larghezza*this.lunghezza)*2*vetro.getCosto();     //vetro
        return somma;
    }
    
    public static void main(String[] args) {
        //materiali
        Materiale cameraSemplice = new Materiale("camera-semplice", 30, "mq");
        Materiale cameraDoppia = new Materiale("camera-doppia", 45, "mq");
        Materiale legno = new Materiale("legno", 10, "ml");
        Materiale alluminio = new Materiale("alluminio", 12, "ml");
        
        //elenco materiale
        ElencoMateriale elenco = new ElencoMateriale();
        elenco.addMateriale(legno);
        elenco.addMateriale(alluminio);
        elenco.addMateriale(cameraSemplice);
        elenco.addMateriale(cameraDoppia);
        
        //modello
        Modello primavera = new Modello("Primavera", "camera-doppia", "legno", "fisso");
        Modello estate = new Modello("Estate", "camera-semplice", "alluminio", "ribalta");
        
        //finestra 1
        Finestra finestra1 = new Finestra(1.5, 2.3, primavera);
        System.out.println("Il costo della finestra e': "+finestra1.calcolaSommaFinestra(elenco));
        
        //finestra 2
        Finestra finestra2 = new Finestra(2.0, 2.0, estate);
        
        //lista Finestre
        ArrayList<Finestra> listaFinestre = new ArrayList<>();
        listaFinestre.add(finestra2);
        listaFinestre.add(finestra1);
        
        //cliente
        Cliente mario = new Cliente("Mario");
        
        //ordine
        Ordine ordine = new Ordine(mario, listaFinestre, 001);
        mario.addOrdine(ordine);
        
        System.out.println(ordine);

    }

}
