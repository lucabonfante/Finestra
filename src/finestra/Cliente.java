package finestra;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cognome;
    private String indirizzo;
    private ArrayList<Ordine> listaOrdini = new ArrayList<>();

    public Cliente(String nome, String cognome, String indirizzo) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + '}';
    }

    public void addOrdine(Ordine ordine) {
        this.listaOrdini.add(ordine);
    }

}
