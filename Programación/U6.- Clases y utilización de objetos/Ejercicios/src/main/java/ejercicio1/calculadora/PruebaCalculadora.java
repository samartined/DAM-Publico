package ejercicio1.calculadora;

/**
 *
 * @author Edgar
 */
public class PruebaCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.setNumero1(5);
//        var num1 = calculadora.getNumero1();
        calculadora.setNumero2(5);
//        var num2 = calculadora.getNumero2();

//        var operacion = calculadora.suma(num1, num2);
        System.out.println(calculadora.suma(calculadora.getNumero1(), calculadora.getNumero2()));

    }
}
