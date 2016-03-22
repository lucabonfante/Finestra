package finestra;

public class Modello {

    private String nome;
    private String vetro;
    private String cornice;
    private String assemblaggio;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVetro() {
        return vetro;
    }

    public void setVetro(String vetro) {
        this.vetro = vetro;
    }

    public String getCornice() {
        return cornice;
    }

    public void setCornice(String cornice) {
        this.cornice = cornice;
    }

    public String getAssemblaggio() {
        return assemblaggio;
    }

    public void setAssemblaggio(String assemblaggio) {
        this.assemblaggio = assemblaggio;
    }

    public Modello(String nome, String vetro, String cornice, String assemblaggio) {
        this.nome = nome;
        this.vetro = vetro;
        this.cornice = cornice;
        this.assemblaggio = assemblaggio;
    }

    @Override
    public String toString() {
        return "Modello{" + "nome=" + nome + ", vetro=" + vetro + ", cornice=" + cornice + ", assemblaggio=" + assemblaggio + '}';
    }
    

}
