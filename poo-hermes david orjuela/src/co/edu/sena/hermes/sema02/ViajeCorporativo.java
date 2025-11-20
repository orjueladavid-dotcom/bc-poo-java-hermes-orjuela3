package co.edu.sena.hermes.sema02;

public class ViajeCorporativo {
    private String codigo;
    private String ciudadDestino;
    private String empresa;
    private int duracionDias;
    private double costoPorPersona;

    public ViajeCorporativo(String codigo, String ciudadDestino, String empresa,
                            int duracionDias, double costoPorPersona) {
        this.codigo = codigo;
        this.ciudadDestino = ciudadDestino;
        this.empresa = empresa;
        this.duracionDias = duracionDias;
        this.costoPorPersona = costoPorPersona;
    }

    public double getCostoPorPersona() {
        return costoPorPersona;
    }

    public String obtenerInfoViaje() {
        return codigo + " | " + ciudadDestino + " | " + empresa +
                " | " + duracionDias + " días | $" + costoPorPersona;
    }
}

