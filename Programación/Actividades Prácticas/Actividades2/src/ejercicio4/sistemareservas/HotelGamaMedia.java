package ejercicio4.sistemareservas;

public class HotelGamaMedia extends Hotel {

    private boolean cateringDisponible;
    private boolean cateringReservado;

    public HotelGamaMedia(String nombre, int totalHabitaciones, boolean cateringDisponible) {
        super(nombre, totalHabitaciones);
        this.cateringDisponible = cateringDisponible;
        this.cateringReservado = false;
    }

    @Override
    public void reservar(Cliente cliente, TipoHabitacion tipoHabitacion) {
        // Logica reserva hotel gama media
        if (tipoHabitacion == TipoHabitacion.HABITACION_NORMAL && totalHabitaciones > 0) {
            totalHabitaciones--;
            System.out.println("Se ha reservado una habitación de tipo " + tipoHabitacion + " para " + cliente
                    + " en el hotel de gama media " + getNombre());
        } else {
            System.out.println("No se puede reservar la habitación especificada en el hotel " + getNombre());
        }
    }

    @Override
    public void cancelarReserva(Cliente cliente, int identificadorReserva) {
        // Logica cancelacion reserva hotel gama media
        for (ReservaHoteles reserva : reservas) {
            if (reserva.getIdentificadorReserva() == identificadorReserva && reserva.getCliente().equals(cliente)) {
                totalHabitaciones++;
                System.out.println("Se ha cancelado la reserva de una habitación de tipo "
                        + reserva.getTipoHabitacion() + " para " + cliente + " en el hotel de gama media "
                        + getNombre());
            } else {
                System.out.println("No se puede cancelar la reserva especificada en el hotel " + getNombre());
            }
        }
    }

    public void reservarCatering(Cliente cliente) {
        if (cateringDisponible && !cateringReservado) {
            this.cateringReservado = true;
            System.out.println("Se ha reservado el catering para " + cliente + " en el hotel de gama media "
                    + getNombre());
        } else {
            System.out.println("No se puede reservar el catering en el hotel " + getNombre());
        }
    }
}