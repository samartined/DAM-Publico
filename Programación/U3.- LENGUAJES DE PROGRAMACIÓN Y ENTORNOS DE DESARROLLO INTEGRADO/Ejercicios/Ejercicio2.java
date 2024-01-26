import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Ejercicio2 {
public static void main(String[] args) {
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDateTime fecha = LocalDateTime.now();
System.out.println("Hoy es : " +dtf.format(fecha) + ", tenga un fantastico dia!");
System.out.println("Indicame como te llamas:");
Scanner entrada = new Scanner(System.in);
String contenido = entrada.next();
System.out.println("Un placer conocerte " + contenido);
}
}