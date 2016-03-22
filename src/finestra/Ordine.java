package finestra;

import java.util.ArrayList;

public class Ordine {

    private Cliente cliente;
    private ArrayList<Finestra> listaFinestre;
    private int numeroOrdine;

    public Ordine(Cliente cliente, ArrayList<Finestra> listaFinestre, int numeroOrdine) {
        this.cliente = cliente;
        this.listaFinestre = listaFinestre;
        this.numeroOrdine = numeroOrdine;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Finestra> getListaFinestre() {
        return listaFinestre;
    }

    public void setListaFinestre(ArrayList<Finestra> listaFinestre) {
        this.listaFinestre = listaFinestre;
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    @Override
    public String toString() {
        return "Ordine{" + cliente + ", listaFinestre=" + listaFinestre + ", numeroOrdine=" + numeroOrdine + '}';
    }
}
