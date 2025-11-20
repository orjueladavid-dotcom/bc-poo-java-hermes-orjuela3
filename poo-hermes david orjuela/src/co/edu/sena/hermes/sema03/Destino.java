package co.edu.sena.hermes.sema03;

public class Destino {
    private String pais;
    private String ciudad;
    private String aeropuerto;
    private String categoria;
    private double impuestoBase;

    // --- Constructores ---
    public Destino(String pais, String ciudad, String aeropuerto, String categoria, double impuestoBase) {
        setPais(pais);
        setCiudad(ciudad);
        setAeropuerto(aeropuerto);
        setCategoria(categoria);
        setImpuestoBase(impuestoBase);
    }

    // Constructor básico
    public Destino(String pais, String ciudad) {
        this(pais, ciudad, "Sin aeropuerto", "Económica", 50.0);
    }

    // --- Getters ---
    public String getPais() { return pais; }
    public String getCiudad() { return ciudad; }
    public String getAeropuerto() { return aeropuerto; }
    public String getCategoria() { return categoria; }
    public double getImpuestoBase() { return impuestoBase; }

    // --- Setters con validaciones ---
    public void setPais(String pais) {
        validarTexto(pais, "País");
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        validarTexto(ciudad, "Ciudad");
        this.ciudad = ciudad;
    }

    public void setAeropuerto(String aeropuerto) {
        validarTexto(aeropuerto, "Aeropuerto");
        this.aeropuerto = aeropuerto;
    }

    public void setCategoria(String categoria) {
        validarTexto(categoria, "Categoría");
        this.categoria = categoria;
    }

    public void setImpuestoBase(double impuestoBase) {
        if (impuestoBase <= 0) {
            throw new IllegalArgumentException("El impuesto debe ser mayor a 0");
        }
        this.impuestoBase = impuestoBase;
    }

    // --- Método privado auxiliar ---
    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException(campo + " no puede estar vacío");
        }
    }
}