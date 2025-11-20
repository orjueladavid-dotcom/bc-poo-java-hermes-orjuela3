package co.edu.sena.hermes.sema02;

import co.edu.sena.hermes.sema01.EmpleadoEmpresa;

public class ReservaCorporativa {
    private EmpleadoEmpresa empleado;
    private Destino destino;
    private ViajeCorporativo viaje;
    private String fecha;
    private int pasajeros;

    public ReservaCorporativa(EmpleadoEmpresa empleado, Destino destino,
                              ViajeCorporativo viaje, String fecha, int pasajeros) {
        this.empleado = empleado;
        this.destino = destino;
        this.viaje = viaje;
        this.fecha = fecha;
        this.pasajeros = pasajeros;
    }

    public double calcularTotal() {
        double costoViaje = viaje.getCostoPorPersona() * pasajeros;
        double impuesto = destino.calcularImpuesto();
        return costoViaje + impuesto;
    }

    public String obtenerResumen() {
        return "\n--- RESERVA CORPORATIVA ---\n" +
                "Empleado: " + empleado.getNombre() + "\n" +
                "Destino: " + destino.obtenerInfoDestino() + "\n" +
                "Fecha: " + fecha + "\n" +
                "Pasajeros: " + pasajeros + "\n" +
                "Costo total: $" + calcularTotal() + "\n";
    }

    public EmpleadoEmpresa getEmpleado() { return empleado; }
    public Destino getDestino() { return destino; }
    public ViajeCorporativo getViaje() { return viaje; }
    public String getFecha() { return fecha; }
    public int getPasajeros() { return pasajeros; }
}

