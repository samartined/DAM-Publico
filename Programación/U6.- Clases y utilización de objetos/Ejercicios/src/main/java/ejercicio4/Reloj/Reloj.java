package ejercicio4.Reloj;

//import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
/**
 *
 * @author Edgar
 */
public class Reloj {

//    private LocalTime time;
//    private LocalDate date;
//
//    public Reloj() {
//    }
//
//    public Reloj(LocalTime time, LocalDate date) {
//        this.time = time;
//        this.date = date;
//    }
//
//    public LocalTime showtime() {
//        return time;
//    }
//
//    public void setTime(LocalTime time) {
//
////        Scanner input = new Scanner(System.in);
////
////        System.out.println("Introduce para modificar la hora actual la nueva hora, los minutos y los segundos: ");
////
////        int newHour;
////        int newMinutes;
////        int newSeconds;
////
////        do {
////            newHour = input.nextInt();
////            newMinutes = input.nextInt();
////            newSeconds = input.nextInt();
////            if (newHour <= 59 || newMinutes <= 59 || newSeconds <= 59) {
////                this.time = time.of(newHour, newMinutes, newSeconds);
////            }
////        } while (newHour > 59 || newMinutes > 59 || newSeconds > 59);
//        this.time = time;
//    }
//
//    public LocalTime mostrarHora() {
//
//        DateTimeFormatter promptHora = DateTimeFormatter.ISO_TIME;
//        return time.;
//    }
//
//    public LocalDateTime mostrarHoraDia() {
//        return LocalDateTime.of(date, time);
//    }
    // CORREGIDO
    private Date fechaHora;
    private long inicioCronometro;
    private long paradaCronometro;

    public Reloj() {
        fechaHora = new Date();
    }

    public void establecerFechaHora(Date nuevaFechaHora) {
        fechaHora = nuevaFechaHora;
    }

    public void modificarFechaHora(int years, int meses, int dias, int horas, int minutos, int segundos) {
        long tiempoActual = fechaHora.getTime();
        long tiempoModificar = ((((years * 365L) + meses * 30L + dias) * 24L + horas) * 60L + minutos) * 60L + segundos;

        tiempoModificar *= 1000;
        fechaHora.setTime(tiempoActual + tiempoModificar);
    }

    public String obtenerFechaHora(String formato) {
        SimpleDateFormat formateador = new SimpleDateFormat(formato);
        return formateador.format(fechaHora);
    }

    public void iniciarCronometro() {
        inicioCronometro = System.currentTimeMillis();
    }

    public void pararCronometro() {
        paradaCronometro = System.currentTimeMillis();
    }

    public String obtenerTiempoCronometrado() {
        long tiempo = paradaCronometro - inicioCronometro;

        int segundos = (int) (tiempo / 1000) % 60;
        int minutos = (int) ((tiempo / 1000 * 60)) % 60;
        int horas = (int) ((tiempo / (1000 * 60 * 60)) % 24);

        return horas + "h:" + minutos + "m:" + segundos + "s";

    }

}
