package ejercicioVideoClase.matriculacionAlumnos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edgar
 */
public class Curso {

    private String nombre;
    private List<Alumno> alumnos;
    private Docente profesor;
    private Aula aula;

    public Curso(String nombre, Docente profesor, Aula aula) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.profesor = profesor;
        this.aula = aula;
    }

    public void añadirAlumno(Alumno Alumno) {
        this.alumnos.add(Alumno);
    }

    public boolean quitarAlumno(Alumno alumno) {
        return alumnos.remove(alumno);
    }

    public void añadirDocente(Docente profesor) {
        this.profesor = profesor;
    }

    public boolean quitarDocente() {
        if (profesor != null) {
            this.profesor = null;
            System.out.println("Profesor eliminado.");
            return true;
        } else {
            System.out.println("No se pudo eliminar el profesor.");
            return false;
        }
    }

    public void añadirAula(Aula aula) {
        this.aula = aula;
    }

    public boolean quitarAula() {
        if (aula != null) {
            this.aula = null;
            System.out.println("Aula eliminada.");
            return true;
        } else {
            System.out.println("No se pudo eliminar el aula.");
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public Docente getProfesor() {
        return profesor;
    }

    public Aula getAula() {
        return aula;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", alumnos=" + alumnos + ", profesor=" + profesor + ", aula=" + aula + '}';
    }

}
