package co.edu.sena.hermes.sema02;

public class Destino {
    private String pais;
    private String ciudad;
    private double costoBase;
    private String categoria;

    public Destino(String pais, String ciudad, double costoBase, String categoria) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.costoBase = costoBase;
        this.categoria = categoria;
    }

    public double calcularImpuesto() {
        return costoBase * 0.12;
    }

    public String obtenerInfoDestino() {
        return ciudad + " - " + pais + " | $" + costoBase +
                " (" + categoria + ")";
    }
}
