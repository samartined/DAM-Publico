package ejercicio4.sistemareservas;

import java.util.ArrayList;
import java.util.List;

public class HotelAltaGama extends Hotel {

    private int suitesDisponibles;
    private int habitacionesDoblesDisponibles;
    private int habitacionesSimplesDisponibles;
    private int suitesReservadas;
    private int habitacionesNormalesDisponibles;
    private int habitacionesNormalesReservadas;
    private int habitacionesDoblesReservadas;
    private int habitacionesSimplesReservadas;
    private List<ReservaHoteles> reservas;

    public HotelAltaGama(String nombre, int totalHabitaciones, int suites, int habitacionesDobles,
            int habitacionesSimples, int habitacionesNormalesDisponibles) {
        super(nombre, totalHabitaciones);
        this.suitesDisponibles = suites;
        this.habitacionesDoblesDisponibles = habitacionesDobles;
        this.habitacionesSimplesDisponibles = habitacionesSimples;
        this.habitacionesNormalesDisponibles = habitacionesNormalesDisponibles;
        this.habitacionesNormalesReservadas = 0;
        this.suitesReservadas = 0;
        this.habitacionesDoblesReservadas = 0;
        this.habitacionesSimplesReservadas = 0;
        this.reservas = new ArrayList<>();
    }

    @Override
    public void reservar(Cliente cliente, TipoHabitacion tipoHabitacion) {
        int numeroReserva = reservas.size() + 1;
        ReservaHoteles reserva = new ReservaHoteles(numeroReserva, cliente, tipoHabitacion);
        reservas.add(reserva);

        switch (tipoHabitacion) {
            case SUITE:
                suitesDisponibles--;
                break;
            case HABITACION_DOBLE:
                habitacionesDoblesDisponibles--;
                break;
            case HABITACION_SIMPLE:
                habitacionesSimplesDisponibles--;
                break;
            case HABITACION_NORMAL:
                habitacionesNormalesDisponibles--;
                break;
            default:
                System.out.println("Tipo de habitación no válido");
        }
        System.out.println("Se ha reservado una habitación de tipo " + tipoHabitacion + " para " + cliente
                + " en el hotel de alta gama " + getNombre());
    }

    @Override
    public void cancelarReserva(Cliente cliente, int identificadorReserva) {
        // Lógica de cancelación de reserva en hotel de alta gama
        for (ReservaHoteles reserva : reservas) {
            if (reserva.getIdentificadorReserva() == identificadorReserva && reserva.getCliente().equals(cliente)) {
                // Encontrar la reserva asociada al cliente y número de reserva
                reservas.remove(reserva);

                switch (reserva.getTipoHabitacion()) {
                    case SUITE:
                        suitesDisponibles++;
                        break;
                    case HABITACION_DOBLE:
                        habitacionesDoblesDisponibles++;
                        break;
                    case HABITACION_SIMPLE:
                        habitacionesSimplesDisponibles++;
                        break;
                    case HABITACION_NORMAL:
                        habitacionesNormalesDisponibles++;
                        break;
                    default:
                        System.out.println("Tipo de habitación no válido");
                }

                System.out
                        .println(cliente + " ha cancelado la reserva " + identificadorReserva + " en el hotel "
                                + getNombre());
                return;
            }
        }
        System.out.println(
                "No se encontró la reserva asociada al cliente " + cliente + " con el número " + identificadorReserva);

    }

    public int getSuitesDisponibles() {
        return suitesDisponibles;
    }

    public void setSuitesDisponibles(int suitesDisponibles) {
        this.suitesDisponibles = suitesDisponibles;
    }

    public int getHabitacionesDoblesDisponibles() {
        return habitacionesDoblesDisponibles;
    }

    public void setHabitacionesDoblesDisponibles(int habitacionesDoblesDisponibles) {
        this.habitacionesDoblesDisponibles = habitacionesDoblesDisponibles;
    }

    public int getHabitacionesSimplesDisponibles() {
        return habitacionesSimplesDisponibles;
    }

    public void setHabitacionesSimplesDisponibles(int habitacionesSimplesDisponibles) {
        this.habitacionesSimplesDisponibles = habitacionesSimplesDisponibles;
    }

    public int getSuitesReservadas() {
        return suitesReservadas;
    }

    public void setSuitesReservadas(int suitesReservadas) {
        this.suitesReservadas = suitesReservadas;
    }

    public int getHabitacionesNormalesDisponibles() {
        return habitacionesNormalesDisponibles;
    }

    public void setHabitacionesNormalesDisponibles(int habitacionesNormalesDisponibles) {
        this.habitacionesNormalesDisponibles = habitacionesNormalesDisponibles;
    }

    public int getHabitacionesNormalesReservadas() {
        return habitacionesNormalesReservadas;
    }

    public void setHabitacionesNormalesReservadas(int habitacionesNormalesReservadas) {
        this.habitacionesNormalesReservadas = habitacionesNormalesReservadas;
    }

    public int getHabitacionesDoblesReservadas() {
        return habitacionesDoblesReservadas;
    }

    public void setHabitacionesDoblesReservadas(int habitacionesDoblesReservadas) {
        this.habitacionesDoblesReservadas = habitacionesDoblesReservadas;
    }

    public int getHabitacionesSimplesReservadas() {
        return habitacionesSimplesReservadas;
    }

    public void setHabitacionesSimplesReservadas(int habitacionesSimplesReservadas) {
        this.habitacionesSimplesReservadas = habitacionesSimplesReservadas;
    }
}
