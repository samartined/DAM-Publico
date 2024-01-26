
public class Ejercicio2 {

    public static void main(String[] args) {

        int a, b;
        a = 5;
        b = 5;

        if (a > b) {
            var mayor = a;
            System.out.println(mayor + " es mayor que " + b);
        } else if (a < b) {
            var mayor = b;
            System.out.println(mayor + " es mayor que " + a);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }

}
