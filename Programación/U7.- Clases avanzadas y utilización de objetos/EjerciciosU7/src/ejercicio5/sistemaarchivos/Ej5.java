package ejercicio5.sistemaarchivos;

/**
 *
 * @author Edgar
 */
public class Ej5 {
    public static void main(String[] args) {

        Archivo archivo1 = new Archivo("archivo1", 1000);
        Archivo archivo2 = new Archivo("archivo2", 2000);

        Directorio directorio1 = new Directorio("directorio1");
        directorio1.añadir(archivo1);
        directorio1.añadir(archivo2);

        Directorio directorioRaiz = new Directorio("/");
        directorioRaiz.añadir(directorio1);

        Archivo archivo3 = new Archivo("archivo3", 3000);
        directorioRaiz.añadir(archivo3);

        System.out.println(
                "El tamaño total de " + directorioRaiz.getNombre() + " es " + directorioRaiz.getTamaño() + " bytes");

    }
}
