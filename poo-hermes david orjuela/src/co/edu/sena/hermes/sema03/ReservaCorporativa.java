package co.edu.sena.hermes.sema03;

public class ReservaCorporativa {

    private String empresa;
    private int numeroPersonas;
    private double costoTotal;
    private Destino destino;

    // Constructor completo
    public ReservaCorporativa(String empresa, int numeroPersonas, double costoTotal, Destino destino) {
        setEmpresa(empresa);
        setNumeroPersonas(numeroPersonas);
        setCostoTotal(costoTotal);
        setDestino(destino);
    }

    // Constructor básico
    public ReservaCorporativa(String empresa, Destino destino) {
        this(empresa, 1, 100.0, destino);
    }

    // --- Getters ---
    public String getEmpresa() { return empresa; }
    public int getNumeroPersonas() { return numeroPersonas; }
    public double getCostoTotal() { return costoTotal; }
    public Destino getDestino() { return destino; }

    // --- Setters con validación ---
    public void setEmpresa(String empresa) {
        validarTexto(empresa, "Empresa");
        this.empresa = empresa;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        if (numeroPersonas <= 0) {
            throw new IllegalArgumentException("El número de personas debe ser mayor a 0");
        }
        this.numeroPersonas = numeroPersonas;
    }

    public void setCostoTotal(double costoTotal) {
        if (costoTotal <= 0) {
            throw new IllegalArgumentException("El costo total debe ser mayor a 0");
        }
        this.costoTotal = costoTotal;
    }

    public void setDestino(Destino destino) {
        if (destino == null) {
            throw new IllegalArgumentException("El destino no puede ser nulo");
        }
        this.destino = destino;
    }

    // --- Método auxiliar privado ---
    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException(campo + " no puede estar vacío");
        }
    }
}
