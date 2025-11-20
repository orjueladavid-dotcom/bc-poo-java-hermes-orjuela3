package co.edu.sena.hermes.sema02;

import co.edu.sena.hermes.sema01.EmpleadoEmpresa;

public class Main {
    public static void main(String[] args) {

        // Datos de Semana 1 (Empleado)
        EmpleadoEmpresa empleado1 = new EmpleadoEmpresa(
                "Laura Gómez", "Gerente General",
                "TechSolutions S.A.", "Ejecutivo", 5);

        // Viaje Corporativo desde sema02 (MUY IMPORTANTE)
        ViajeCorporativo viaje1 = new ViajeCorporativo(
                "VC001", "Madrid", "TechSolutions S.A.",
                8, 3200.50);

        Destino destinoMadrid = new Destino(
                "España", "Madrid", 850000, "Corporativo");

        ReservaCorporativa reserva1 = new ReservaCorporativa(
                empleado1, destinoMadrid, viaje1,
                "2025-12-15", 3);

        AgenciaViajes agencia = new AgenciaViajes("Travel Business");
        agencia.agregarReserva(reserva1);

        agencia.mostrarTodasReservas();
        System.out.println("\nTotal de reservas: " + agencia.contarReservas());
    }
}


