/*
 * Imagina que tienes que desarrollar un sistema para manejar las reservas de un pequeño hotel.
El hotel tiene tres pisos, cada piso tiene 10 habitaciones y las reservas se pueden hacer para cualquier día del año (asumiremos 365 días).
Para este ejercicio, el hotel se representa como un array tridimensional donde los tres ejes representan el piso, la habitación y el día del año. Cada celda en el array puede ser true (la habitación está reservada para ese día) o false (la habitación está libre).
Deberás implementar la siguiente funcionalidad:
•
Realizar una reserva para un cliente en una habitación específica para un día específico, si la habitación está disponible.
•
Cancelar una reserva existente.
•
Comprobar si una habitación está disponible en un día específico.
•
Comprobar qué habitaciones están disponibles en un día específico.
•
Mostrar un informe de la ocupación del hotel para un día específico.
 */

public class Ejercicio9 {
    public static void main(String[] args) {

        Hotel hotel = new Hotel(3, 10, 365);

        int piso = 1;
        int habitacion = 2;
        int dia = 500;

        // Realiza la reserva
        if (hotel.hacerReserva(piso, habitacion, dia)) {
            System.out.println(
                    "Reserva realizada para el piso " + piso + ", habitación " + habitacion + " el día " + dia);
        } else {
            System.out.println("No se ha podido hacer la reserva para el piso " + piso + ", habitación " + habitacion
                    + " el día " + dia);
        }

        // Comprueba la disponibilidad
        if (!hotel.isHabitacionDisponible(piso, habitacion, dia)) {
            System.out.println("La habitación no está disponible.");
        } else {
            System.out.println("La habitación  está disponible.");
        }

        // Muestra un informe de ocupación
        hotel.mostrarInformeOcupacion(dia);

        // Cancelar reserva
        hotel.cancelarReserva(piso, habitacion, dia);
        System.out.println("Reserva cancelada para el piso " + piso + ", habitación " + habitacion + " el día " + dia);

        // Comprueba la disponibilidad de nuevo
        if (!hotel.isHabitacionDisponible(piso, habitacion, dia)) {
            System.out.println("La habitación no está disponible.");
        } else {
            System.out.println("La habitación  está disponible.");
        }

    }

    private static class Hotel {

        private boolean[][][] hotel; // array tridimensional

        public Hotel() {
        }

        public Hotel(int piso, int habitacion, int dia) {
            hotel = new boolean[piso][habitacion][dia];
        }

        public boolean hacerReserva(int piso, int habitacion, int dia) {
            if (habitacion >= 0 && piso >= 0 && piso < hotel.length && habitacion >= 0 && habitacion < hotel[0].length
                    && dia >= 0 && dia < hotel[0][0].length) {
                if (!hotel[piso][habitacion][dia]) {
                    hotel[piso][habitacion][dia] = true;
                    return true; // La reserva se hizo con éxito
                }
            }
            return false; // La habitación no está disponible
        }

        public boolean cancelarReserva(int piso, int habitacion, int dia) {
            if (habitacion >= 0 && piso >= 0 && piso < hotel.length && habitacion >= 0 && habitacion < hotel[0].length
                    && dia >= 0 && dia < hotel[0][0].length) {
                if (hotel[piso][habitacion][dia]) {
                    hotel[piso][habitacion][dia] = false;
                    return true; // La reserva se canceló con éxito
                }
            }
            return false; // No había reserva que cancelar
        }

        public boolean isHabitacionDisponible(int piso, int habitacion, int dia) {

            if (habitacion >= 0 && piso >= 0 && piso < hotel.length && habitacion >= 0 && habitacion < hotel[0].length
                    && dia >= 0 && dia < hotel[0][0].length) {
                return !hotel[piso][habitacion][dia];
            }
            return false; // Parámetros fuera de rango
        }

        public boolean[] getHabitacionesDisponibles(int day) {
            if (day >= 0 && day < hotel[0][0].length) {
                boolean[] habitacionesDisponibles = new boolean[hotel[0].length];
                for (int piso = 0; piso < hotel.length; piso++) {
                    for (int habitacion = 0; habitacion < hotel[0].length; habitacion++) {
                        habitacionesDisponibles[habitacion] = !hotel[piso][habitacion][day];
                    }
                }
                return habitacionesDisponibles;
            }
            return null; // Dia fuera de rango
        }

        public void mostrarInformeOcupacion(int dia) {
            if (dia >= 0 && dia < hotel[0][0].length) {
                System.out.println("Informe de ocupación para el día " + dia);
                for (int piso = 0; piso < hotel.length; piso++) {
                    for (int habitacion = 0; habitacion < hotel[0].length; habitacion++) {
                        if (hotel[piso][habitacion][dia]) {
                            System.out.println("Piso " + piso + ", Habitación: " + habitacion + ": Reservada.");
                        } else {
                            System.out.println("Piso " + piso + ", Habitación: " + habitacion + ": Disponible.");
                        }
                    }
                }
            } else {
                System.out.println("Día fuera de rango.");
            }
        }
    }
}
