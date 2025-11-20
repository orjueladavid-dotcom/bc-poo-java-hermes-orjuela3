package co.edu.sena.hermes.sema01;

// Agencia de Viajes Corporativos "Travel Business"
public class ViajeCorporativo {

    // Atributos
    private String codigoViaje;
    private String destino;
    private String empresaCliente;
    private int numeroEmpleados;
    private double costoPorPersona;
    private boolean confirmado;

    // Constructor
    public ViajeCorporativo(String codigo, String destino, String empresa, int empleados, double costo) {
        this.codigoViaje = codigo;
        this.destino = destino;
        this.empresaCliente = empresa;
        this.numeroEmpleados = empleados;
        this.costoPorPersona = costo;
        this.confirmado = false;
    }

    // Método void (imprime información del viaje)
    public void mostrarInformacion() {
        System.out.println("=== VIAJE CORPORATIVO ===");
        System.out.println("Código: " + codigoViaje);
        System.out.println("Destino: " + destino);
        System.out.println("Empresa cliente: " + empresaCliente);
        System.out.println("Número de empleados: " + numeroEmpleados);
        System.out.printf("Costo por persona: $%.2f%n", costoPorPersona);
        System.out.println("Estado: " + (confirmado ? "CONFIRMADO" : "PENDIENTE"));
        System.out.printf("Costo total: $%.2f%n", calcularCostoTotal());
    }

    // Método que retorna valor calculado (costo total del viaje)
    public double calcularCostoTotal() {
        return numeroEmpleados * costoPorPersona;
    }

    // Getter (devuelve el código del viaje)
    public String getCodigoViaje() {
        return codigoViaje;
    }

    // Setter (permite confirmar o cancelar el viaje)
    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
}
