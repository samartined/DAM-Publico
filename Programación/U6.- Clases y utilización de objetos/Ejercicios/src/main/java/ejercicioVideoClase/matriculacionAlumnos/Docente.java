package ejercicioVideoClase.matriculacionAlumnos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edgar
 */
public class Docente {

    private String nombreCompleto;
    private String dni;
    private List<Curso> cursos;

    public Docente(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cursos = new ArrayList<>();
    }

    public void asignarCurso(Curso curso) {
        cursos.add(curso);
    }

    public boolean eliminarCurso(Curso curso) {
        if (cursos != null) {
            boolean cursoEliminado = cursos.remove(curso);
            if (cursoEliminado) {
                System.out.println("Curso eliminado.");
            } else {
                System.out.println("El curso no estaba en la lista.");
            }
            return cursoEliminado;
        } else {
            System.out.println("No se pudo eliminar el curso.");
            return false;
        }
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombre(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Docente{" + "nombre completo=" + nombreCompleto + ", dni=" + dni + ", cursos=" + cursos + '}';
    }

}
