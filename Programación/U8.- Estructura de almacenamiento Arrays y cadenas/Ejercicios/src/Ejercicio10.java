/*Imagina que tienes una aplicación de música y quieres implementar una funcionalidad para manejar playlists. Cada playlist se representará como una clase Playlist con las siguientes propiedades:
•
nombre: El nombre de la playlist.
•
canciones: Un array de strings, donde cada string representa el nombre de una canción. El formato de cada string será el siguiente: “nombre canción – duración”. Por ejemplo, "Bohemian Rhapsody - 5.55". La cantidad de canciones que puede contener el playlist la establece el usuario cuando se crea.
Deberás implementar los siguientes métodos en la clase Playlist:
•
Un método para agregar una nueva canción a la playlist.
•
Un método para eliminar una canción de la playlist por su nombre.
•
Un método para imprimir todas las canciones en la playlist.
•
Una función que reciba el nombre de una canción y devuelva true si la canción está en la playlist, false en caso contrario.
•
Una función que devuelva la canción más larga de la playlist.
•
Una función que devuelva el total de la duración de todas las canciones en la playlist. */

import java.text.DecimalFormat;

public class Ejercicio10 {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("rap", 5);

        playlist.añadirCancion(new Playlist.Cancion("Laboratorio de Rap", 3, 30));
        playlist.añadirCancion(new Playlist.Cancion("Ritmo", 4, 15));
        playlist.añadirCancion(new Playlist.Cancion("Flow", 2, 50));

        System.out.println("Canciones en la playlist: ");
        playlist.imprimirCanciones();

        System.out.println("\n¿Contiene la playlist la canción 'Stairway to Heaven'?");
        playlist.comprobarCancion("Stairway to Heaven");
        if (playlist.comprobarCancion("Stairway to Heaven") == true) {
            System.out.println("La canción está en la playlist.");
        } else {
            System.out.println("La canción no se encuentra en la playlist.");
        }

        System.out.println("\nCanción más larga: " + playlist.devolverCancionMasLarga());
        System.out.println("\nDuración total: " + playlist.mostrarTotalDuración());

        playlist.quitarCancion("Flow");
        System.out.println("\nCanciones en la playlist después de eliminar la canción:");
        playlist.imprimirCanciones();

    }

    public static class Playlist {

        private String nombre;
        private Cancion[] canciones;
        private int cantidadCanciones;

        public Playlist(String nombre, int cantidadCanciones) {
            this.nombre = nombre;
            canciones = new Cancion[cantidadCanciones];
            this.cantidadCanciones = cantidadCanciones;
        }

        // Metodo para agregar una nueva canción a la playlist
        public void añadirCancion(Cancion cancion) {
            for (int i = 0; i < canciones.length; i++) {
                if (canciones[i] == null) {
                    canciones[i] = cancion;
                    break;
                } else {
                    if (i == canciones.length - 1) {
                        System.out.println("La lista está llena.");
                        break;
                    }
                }
            }
        }

        // Método para eliminar una cancion de la playlist
        public void quitarCancion(String nombre) {
            for (int i = 0; i < canciones.length; i++) {
                if (canciones[i] != null && canciones[i].nombre.equalsIgnoreCase(nombre)) {
                    canciones[i] = null;
                }
            }
        }

        // Método para imprimir todas las canciones de la playlist
        public void imprimirCanciones() {
            for (Cancion cancion : canciones) {
                if (cancion != null) {
                    System.out.println(cancion.toString());
                }
            }
        }

        // Método para comprobar si la canción está en la playlist
        public boolean comprobarCancion(String nombre) {
            for (Cancion cancion : canciones) {
                if (cancion != null && cancion.nombre.equalsIgnoreCase(nombre)) {
                    return true;
                }
            }
            return false;
        }

        // Método que devuelva la canción más larga de la playlist
        public Cancion devolverCancionMasLarga() {
            Cancion cancionMasLarga = null;
            int duracionMasLarga = 0;
            for (Cancion cancion : canciones) {
                if (cancion != null && cancion.getDuracionTotal() > duracionMasLarga) {
                    cancionMasLarga = cancion;
                    duracionMasLarga = cancion.getDuracionTotal();
                }
            }
            return cancionMasLarga;
        }

        // Método que devuelva el total de duración de todas las canciones de la
        // playlist
        public String mostrarTotalDuración() {
            int duracionTotal = 0;
            for (Cancion cancion : canciones) {
                if (cancion != null) {
                    duracionTotal += cancion.getDuracionTotal();
                }
            }
            int minutos = duracionTotal / 60;
            int segundos = duracionTotal % 60;

            DecimalFormat formato = new DecimalFormat("00");
            String duracionFormateada = formato.format(minutos) + ":" + formato.format(segundos);

            return duracionFormateada;
        }

        // Clase Cancion
        public static class Cancion {
            private String nombre;
            private int minutos;
            private int segundos;

            public Cancion(String nombre, int minutos, int segundos) {
                this.nombre = nombre;
                this.minutos = minutos;
                this.segundos = segundos;
            }

            public int getDuracionTotal() {
                return minutos * 60 + segundos;
            }

            @Override
            public String toString() {
                DecimalFormat formato = new DecimalFormat("00");
                String duracionFormateada = formato.format(minutos) + ":" + formato.format(segundos);
                return nombre + " - " + duracionFormateada;
            }
        }
    }
}