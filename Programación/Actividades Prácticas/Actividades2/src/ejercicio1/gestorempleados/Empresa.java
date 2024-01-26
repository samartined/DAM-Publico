package ejercicio1.gestorempleados;

public class Empresa {
    private String nombre;
    private String cif;

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", cif=" + cif + '}';
    }
}