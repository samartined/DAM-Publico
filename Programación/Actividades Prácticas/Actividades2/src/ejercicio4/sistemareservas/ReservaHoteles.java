package ejercicio4.sistemareservas;

import ejercicio4.sistemareservas.Hotel.TipoHabitacion;

public class ReservaHoteles {

    private int identificadorReserva;
    private Cliente cliente;
    private TipoHabitacion tipoHabitacion;

    public ReservaHoteles(int numero, Cliente cliente, TipoHabitacion tipoHabitacion) {
        this.identificadorReserva = numero;
        this.cliente = cliente;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getIdentificadorReserva() {
        return identificadorReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }
}
