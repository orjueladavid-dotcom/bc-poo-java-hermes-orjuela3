package co.edu.sena.hermes.sema01;

public class EmpleadoEmpresa {
    private String nombre;
    private String puesto;
    private String empresa;
    private String categoria;
    private int nivelAutorizacion;
    private int viajesRealizados = 0; // NUEVO

    public EmpleadoEmpresa(String nombre, String puesto, String empresa, String categoria, int nivelAutorizacion) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.empresa = empresa;
        this.categoria = categoria;
        this.nivelAutorizacion = nivelAutorizacion;
    }

    // Mostrar información del empleado (equivalente a Secundaria.mostrarInformacion())
    public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Empresa: " + empresa);
        System.out.println("Categoría: " + categoria);
        System.out.println("Nivel de autorización: " + nivelAutorizacion);
        System.out.println("Viajes registrados: " + viajesRealizados);
    }

    // Registrar un viaje
    public void registrarViaje() {
        viajesRealizados++;
        System.out.println("Se registró un viaje para " + nombre + ". Total ahora: " + viajesRealizados);
    }

    // Cliente frecuente si tiene 3 o más viajes
    public boolean esClienteFrecuente() {
        return viajesRealizados >= 3;
    }

    // Métodos originales
    public boolean puedeAprobarGasto(double monto) {
        return monto <= nivelAutorizacion * 500;
    }

    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public String getEmpresa() { return empresa; }
    public String getCategoria() { return categoria; }
    public int getNivelAutorizacion() { return nivelAutorizacion; }
}
