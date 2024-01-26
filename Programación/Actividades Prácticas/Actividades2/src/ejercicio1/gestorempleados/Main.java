package ejercicio1.gestorempleados;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa A", "12345678A");

        Empleado empleado1 = new Empleado("11111111A", "Juan", 25, 30000, "Programador", empresa);
        Empleado empleado2 = new Empleado("22222222B", "Maria", 30, 40000, "Analista", empresa);
        Empleado empleado3 = new Empleado("33333333C", "Pedro", 28, 35000, "Diseñador", empresa);

        System.out.println("Empresa: " + empresa);
        System.out.println("Empleado 1: " + empleado1);
        System.out.println("Contrato Empleado 1: " + empleado1.getContrato());
        System.out.println("Empleado 2: " + empleado2);
        System.out.println("Contrato Empleado 2: " + empleado2.getContrato());
        System.out.println("Empleado 3: " + empleado3);
        System.out.println("Contrato Empleado 3: " + empleado3.getContrato());
    }
}
