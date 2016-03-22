package finestra;

public class Materiale {

    private String tipo;
    private int costo;
    private String unitaMisura;

    public Materiale(String tipo, int costo, String unitaMisura) {
        this.tipo = tipo;
        this.costo = costo;
        this.unitaMisura = unitaMisura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getUnitaMisura() {
        return unitaMisura;
    }

    public void setUnitaMisura(String unitaMisura) {
        this.unitaMisura = unitaMisura;
    }

    @Override
    public String toString() {
        return "{" + "tipo=" + tipo + ", costo=" + costo + ", unitaMisura=" + unitaMisura + '}';
    }
    

}
