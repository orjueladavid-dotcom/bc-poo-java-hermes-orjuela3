package co.edu.sena.hermes.sema01;

public      class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN - AGENCIA TRAVEL BUSINESS ===\n");

        // Crear empleados responsables de viajes corporativos
        EmpleadoEmpresa empleado1 = new EmpleadoEmpresa("Laura Gómez", "Gerente General", "TechSolutions S.A.", "Ejecutivo", 5);
        EmpleadoEmpresa empleado2 = new EmpleadoEmpresa("Carlos Pérez", "Jefe de Compras", "Constructora Andina", "Corporativo", 3);

        // Crear viajes corporativos
        ViajeCorporativo viaje1 = new ViajeCorporativo("VC001", "Madrid", empleado1.getEmpresa(), 8, 3200.50);
        ViajeCorporativo viaje2 = new ViajeCorporativo("VC002", "Buenos Aires", empleado2.getEmpresa(), 12, 2800.75);

        // Mostrar información de los empleados
        System.out.println("--- EMPLEADOS RESPONSABLES ---");
        empleado1.mostrarInformacion();
        System.out.println();
        empleado2.mostrarInformacion();

        // Registrar viajes realizados por los empleados
        System.out.println("\n--- REGISTRO DE VIAJES ---");
        empleado1.registrarViaje();
        empleado1.registrarViaje(); // Registrar más de uno
        empleado2.registrarViaje();

        // Verificar si son clientes frecuentes
        System.out.println("\n¿" + empleado1.getEmpresa() + " es cliente frecuente?: " + empleado1.esClienteFrecuente());
        System.out.println("¿" + empleado2.getEmpresa() + " es cliente frecuente?: " + empleado2.esClienteFrecuente());

        // Mostrar información de los viajes
        System.out.println("\n--- VIAJES CORPORATIVOS ---");
        viaje1.mostrarInformacion();
        System.out.println("Costo total del viaje: $" + viaje1.calcularCostoTotal());

        System.out.println();
        viaje2.mostrarInformacion();
        System.out.println("Costo total del viaje: $" + viaje2.calcularCostoTotal());

        // Confirmar un viaje
        System.out.println("\n--- ACTUALIZACIÓN DE ESTADO DE VIAJE ---");
        viaje1.setConfirmado(true);
        viaje1.mostrarInformacion();

        // Simular más viajes para volver frecuente al empleado1
        empleado1.registrarViaje();
        empleado1.registrarViaje();
        empleado1.registrarViaje();
        System.out.println("\n¿" + empleado1.getEmpresa() + " es cliente frecuente ahora?: " + empleado1.esClienteFrecuente());
    }
}
