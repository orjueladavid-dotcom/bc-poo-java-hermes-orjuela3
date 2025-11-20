package co.edu.sena.hermes.sema02;

import java.util.ArrayList;

public class AgenciaViajes {
    private String nombre;
    private ArrayList<ReservaCorporativa> reservas;

    public AgenciaViajes(String nombre) {
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    public void agregarReserva(ReservaCorporativa reserva) {
        reservas.add(reserva);
        System.out.println("Reserva agregada correctamente.");
    }

    public void mostrarTodasReservas() {
        System.out.println("\n=== LISTA DE RESERVAS ===");
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
            return;
        }

        for (ReservaCorporativa r : reservas) {
            System.out.println(r.obtenerResumen());
        }
    }

    public int contarReservas() {
        return reservas.size();
    }
}

