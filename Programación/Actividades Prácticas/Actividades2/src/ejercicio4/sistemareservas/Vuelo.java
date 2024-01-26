package ejercicio4.sistemareservas;

public class Vuelo {
    private int numeroVuelo;
    private TipoPlaza tipoPlaza;
    private int plazasNormales;
    private int plazasVIP;

    enum TipoPlaza {
        NORMALES, VIP
    }

    public Vuelo(int numeroVuelo, TipoPlaza tipoPlaza, int plazasNormales, int plazasVIP) {
        this.numeroVuelo = numeroVuelo;
        this.tipoPlaza = tipoPlaza;
        this.plazasNormales = plazasNormales;
        this.plazasVIP = plazasVIP;
    }

    public void reservar(int cantidad) {

        // Lógica de reserva según el tipo de plaza
        switch (tipoPlaza) {
            case NORMALES:
                if (plazasNormales >= cantidad) {
                    System.out
                            .println("Reserva exitosa de " + cantidad + " plazas normales en el vuelo " + numeroVuelo);
                    plazasNormales -= cantidad;
                } else {
                    System.out.println("No hay suficientes plazas normales disponibles en el vuelo " + numeroVuelo);
                }
                break;

            case VIP:
                if (plazasVIP >= cantidad) {
                    System.out.println("Reserva exitosa de " + cantidad + " plazas VIP en el vuelo " + numeroVuelo);
                    plazasVIP -= cantidad;
                } else {
                    System.out.println("No hay suficientes plazas VIP disponibles en el vuelo " + numeroVuelo);
                }
                break;

            default:
                System.out.println("Tipo de plaza no válido en el vuelo " + numeroVuelo);
        }
    }

    public void cancelarReserva(int cantidad) {
        int totalPlazasDisponibles = plazasNormales + plazasVIP;

        // Lógica de cancelación de reserva según el tipo de plaza
        switch (tipoPlaza) {
            case NORMALES:
                if (plazasNormales + cantidad <= totalPlazasDisponibles) {
                    System.out.println(
                            "Cancelación exitosa de " + cantidad + " plazas normales en el vuelo " + numeroVuelo);
                    plazasNormales += cantidad;
                } else {
                    System.out.println("No se puede cancelar la reserva especificada en el vuelo " + numeroVuelo);
                }
                break;

            case VIP:
                if (plazasVIP + cantidad <= totalPlazasDisponibles) {
                    System.out.println("Cancelación exitosa de " + cantidad + " plazas VIP en el vuelo " + numeroVuelo);
                    plazasVIP += cantidad;
                } else {
                    System.out.println("No se puede cancelar la reserva especificada en el vuelo " + numeroVuelo);
                }
                break;

            default:
                System.out.println("Tipo de plaza no válido en el vuelo " + numeroVuelo);
        }
    }
}
