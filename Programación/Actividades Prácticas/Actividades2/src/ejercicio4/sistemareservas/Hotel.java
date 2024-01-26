package ejercicio4.sistemareservas;

import java.util.List;

public abstract class Hotel {

    protected String nombre;
    protected int totalHabitaciones;
    protected List<ReservaHoteles> reservas;

    // Enumeración para los tipos de habitaciones en hoteles
    public enum TipoHabitacion {
        HABITACION_NORMAL, SUITE, HABITACION_SIMPLE, HABITACION_DOBLE, HABITACION_COMPARTIDA
    }

    public Hotel(String nombre, int totalHabitaciones) {
        this.nombre = nombre;
        this.totalHabitaciones = totalHabitaciones;
    }

    public abstract void reservar(Cliente cliente, TipoHabitacion tipoHabitacion);

    public abstract void cancelarReserva(Cliente cliente, int identificadorReserva);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalHabitaciones() {
        return totalHabitaciones;
    }

    public void setTotalHabitaciones(int totalHabitaciones) {
        this.totalHabitaciones = totalHabitaciones;
    }

    public List<ReservaHoteles> getReservas() {
        return reservas;
    }

    @Override
    public String toString() {
        return "Hotel [nombre=" + nombre + ", totalHabitaciones=" + totalHabitaciones + "]";
    }

}