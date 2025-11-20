package co.edu.sena.hermes.sema03;

public class ViajeCorporativo {

    private String empleado;
    private ReservaCorporativa reserva;
    private int dias;
    private double viaticos;

    // Constructor completo
    public ViajeCorporativo(String empleado, ReservaCorporativa reserva, int dias, double viaticos) {
        setEmpleado(empleado);
        setReserva(reserva);
        setDias(dias);
        setViaticos(viaticos);
    }

    // Constructor básico
    public ViajeCorporativo(String empleado, ReservaCorporativa reserva) {
        this(empleado, reserva, 1, 50.0);
    }

    // --- Getters ---
    public String getEmpleado() { return empleado; }
    public ReservaCorporativa getReserva() { return reserva; }
    public int getDias() { return dias; }
    public double getViaticos() { return viaticos; }

    // --- Setters ---
    public void setEmpleado(String empleado) {
        validarTexto(empleado, "Empleado");
        this.empleado = empleado;
    }

    public void setReserva(ReservaCorporativa reserva) {
        if (reserva == null) {
            throw new IllegalArgumentException("La reserva no puede ser nula");
        }
        this.reserva = reserva;
    }

    public void setDias(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("Los días deben ser mayores a 0");
        }
        this.dias = dias;
    }

    public void setViaticos(double viaticos) {
        if (viaticos < 0) {
            throw new IllegalArgumentException("Los viáticos no pueden ser negativos");
        }
        this.viaticos = viaticos;
    }

    // Auxiliar privado
    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException(campo + " no puede estar vacío");
        }
    }
}
