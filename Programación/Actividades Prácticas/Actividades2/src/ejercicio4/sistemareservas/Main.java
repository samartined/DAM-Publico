package ejercicio4.sistemareservas;

public class Main {

    public static void main(String[] args) {
        // Crear vuelos
        Vuelo vuelo1 = new Vuelo(1, Vuelo.TipoPlaza.NORMALES, 50, 10);
        Vuelo vuelo2 = new Vuelo(2, Vuelo.TipoPlaza.VIP, 30, 5);

        // Crear hoteles
        HotelAltaGama hotelAltaGama = new HotelAltaGama("Hotel de Lujo", 100, 20, 30, 50, 100);
        HotelGamaMedia hotelMediaGama = new HotelGamaMedia("Hotel Estándar", 80, true);
        HotelGamaBaja hotelBajaGama = new HotelGamaBaja("Hostal Sencillo", 50, 20);

        // Crear clientes
        Cliente cliente1 = new Cliente("12345678A", "Juan Pérez");
        Cliente cliente2 = new Cliente("98765432B", "María López");

        // Reservas de vuelos
        vuelo1.reservar(5);
        vuelo2.reservar(3);

        // Cancelar reservas de vuelos
        vuelo1.cancelarReserva(2);
        vuelo2.cancelarReserva(1);

        // Reservas de hoteles
        hotelAltaGama.reservar(cliente1, Hotel.TipoHabitacion.SUITE);
        hotelMediaGama.reservar(cliente1, Hotel.TipoHabitacion.HABITACION_NORMAL);
        hotelBajaGama.reservar(cliente2, Hotel.TipoHabitacion.HABITACION_COMPARTIDA);

        // Cancelar reservas de hoteles
        hotelAltaGama.cancelarReserva(cliente1, 1);
        hotelMediaGama.cancelarReserva(cliente1, 2);
        hotelBajaGama.cancelarReserva(cliente2, 3);
    }
}
