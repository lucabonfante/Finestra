package finestra;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private ArrayList<Ordine> listaOrdini= new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Ordine> getListaOrdini() {
        return listaOrdini;
    }

    public void setListaOrdini(ArrayList<Ordine> listaOrdini) {
        this.listaOrdini = listaOrdini;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + '}';
    }
    
    public void addOrdine(Ordine ordine){
        this.listaOrdini.add(ordine);
    }
    

}
