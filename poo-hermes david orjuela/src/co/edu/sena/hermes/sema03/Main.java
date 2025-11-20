package co.edu.sena.hermes.sema03;

public class Main {
    public static void main(String[] args) {

        Destino d1 = new Destino("Colombia", "Bogotá", "El Dorado", "Premium", 120.0);

        ReservaCorporativa r1 = new ReservaCorporativa("SENA", 5, 900.0, d1);

        ViajeCorporativo v1 = new ViajeCorporativo("David Orjuela", r1, 3, 150.0);

        System.out.println("Empleado: " + v1.getEmpleado());
        System.out.println("Empresa: " + v1.getReserva().getEmpresa());
        System.out.println("Destino: " + v1.getReserva().getDestino().getCiudad());
    }
}

