package ejercicio1.gestorempleados;

import java.util.Date;

public class Empleado extends Persona {
    private double sueldo;
    private String categoria;
    private Contrato contrato;

    public Empleado(String nombre, String dni, int edad, double sueldo, String categoria, Empresa empresa) {
        super(nombre, dni, edad);
        this.sueldo = sueldo;
        this.categoria = categoria;
        this.contrato = crearContrato(empresa); // Con el fin de crear el contrato automáticamente
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override // from Persona
    public String toString() {
        return super.toString() + "\nSueldo: " + sueldo + "\nCategoria: " + categoria;
    }

    public Contrato crearContrato(Empresa empresa) {
        Contrato nuevoContrato = new Contrato(new Date(), TipoContrato.INDEFINIDO, this);
        nuevoContrato.setEmpresa(empresa); // Asignar empresa al contrato
        return nuevoContrato;
    }

    public Contrato getContrato() {
        return contrato;
    }
}