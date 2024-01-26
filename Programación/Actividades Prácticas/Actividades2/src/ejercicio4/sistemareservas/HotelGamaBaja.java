package ejercicio4.sistemareservas;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class HotelGamaBaja extends Hotel {

    private int camasDisponibles;
    private Map<Integer, Integer> habitacionesOcupadas; // Con esto asignamos una relacion clave (numero de cama) con un

    // valor (numeros de reserva)

    public HotelGamaBaja(String nombre, int totalHabitaciones, int habitacionesDoblesDisponibles) {
        super(nombre, totalHabitaciones);
        this.camasDisponibles = totalHabitaciones * 10;
        this.habitacionesOcupadas = new HashMap<>();
    }

    @Override
    public void reservar(Cliente cliente, TipoHabitacion tipoHabitacion) {
        if (camasDisponibles >= 10) {
            // Reserva de habitación compartida (10 camas)
            int numeroReservaCama = generarNumeroReservaCama();
            int numeroHabitacion = obtenerNumeroReservaCamaDesdeCliente();

            habitacionesOcupadas.put(numeroReservaCama, numeroHabitacion);
            camasDisponibles -= 10;
            System.out.println("Se ha reservado una habitación en el hotel " + getNombre() + " para " + cliente
                    + " con número de reserva " + numeroReservaCama);
        }
    }

    @Override
    public void cancelarReserva(Cliente cliente, int identificadorReserva) {
        int numeroReservaCama = obtenerNumeroReservaCamaDesdeCliente();

        if (habitacionesOcupadas.containsKey(numeroReservaCama)) {
            // Restablecer habitación y cualquier otro servicio
            int numeroHabitacion = habitacionesOcupadas.get(numeroReservaCama);
            habitacionesOcupadas.remove(numeroReservaCama);
            camasDisponibles += 10;

            System.out.println("Se ha cancelado la reserva de la habitación " + numeroHabitacion +
                    " en el hotel de gama baja " + getNombre());
        } else {
            System.out.println("No se encontró la reserva asociada al número de reserva de cama " + numeroReservaCama);
        }
    }

    private int generarNumeroReservaCama() {
        Random random = new Random();
        return random.nextInt(1000); // Identificador aleatorio asignado
    }

    private int obtenerNumeroReservaCamaDesdeCliente() {
        // Lógica para obtener el número de reserva de cama del cliente
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese el número de reserva de cama: ");
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.print("Entrada no válida. Se asignará un número de reserva de cama aleatorio.");
            return generarNumeroReservaCama();
        } finally {
            scanner.close();
        }
    }

    public int getCamasDisponibles() {
        return camasDisponibles;
    }

    public void setCamasDisponibles(int camasDisponibles) {
        this.camasDisponibles = camasDisponibles;
    }

    public Map<Integer, Integer> getHabitacionesOcupadas() {
        return habitacionesOcupadas;
    }

    public void setHabitacionesOcupadas(Map<Integer, Integer> habitacionesOcupadas) {
        this.habitacionesOcupadas = habitacionesOcupadas;
    }

}
