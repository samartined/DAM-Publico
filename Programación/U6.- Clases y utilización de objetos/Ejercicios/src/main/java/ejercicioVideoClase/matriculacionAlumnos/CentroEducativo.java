package ejercicioVideoClase.matriculacionAlumnos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edgar
 */
public class CentroEducativo {

    private String nombre;
    private List<Alumno> alumnos;
    private List<Aula> aulas;
    private List<Curso> cursos;
    private List<Docente> docentes;

    // Constructor
    public CentroEducativo(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.aulas = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.docentes = new ArrayList<>();
    }

    // Métodos
    public void añadirAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void añadirAula(Aula aula) {
        aulas.add(aula);
    }

    public void añadirCurso(Curso curso) {
        cursos.add(curso);
    }

    public void añadirDocente(Docente docente) {
        docentes.add(docente);
    }

    public boolean quitarAlumno(Alumno alumno) {
        if (alumnos != null) {
            boolean alumnoEliminado = alumnos.remove(alumno);
            if (alumnoEliminado) {
                System.out.println("Alumno eliminado.");

            } else {
                System.out.println("El alumno no estaba en la lista.");
            }
            return alumnoEliminado;
        } else {
            System.out.println("No se ha podido eliminar el elumno");
        }
        return false;
    }

    public boolean quitarAula(Aula aula) {
        if (aulas != null) {
            boolean aulaEliminada = aulas.remove(aula);
            if (aulaEliminada) {
                System.out.println("Aula eliminada.");

            } else {
                System.out.println("El aula no estaba en la lista.");
            }
            return aulaEliminada;
        } else {
            System.out.println("No se ha podido eliminar el aula.");
        }
        return false;
    }

    public boolean quitarDocente(Docente docente) {
        if (docentes != null) {
            boolean docenteEliminado = docentes.remove(docente);
            if (docenteEliminado) {
                System.out.println("Docente eliminado.");

            } else {
                System.out.println("El docente no estaba en la lista.");
            }
            return docenteEliminado;
        } else {
            System.out.println("No se ha podido eliminar el docente.");
        }
        return false;
    }

    public boolean quitarCurso(Curso curso) {
        if (cursos != null) {
            boolean cursoEliminado = cursos.remove(curso);
            if (cursoEliminado) {
                System.out.println("Curso eliminado.");

            } else {
                System.out.println("El curso no estaba en la lista.");
            }
            return cursoEliminado;
        } else {
            System.out.println("No se ha podido eliminar el curso");
        }
        return false;
    }

    // Setters
    public String getNombre() {
        return nombre;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

}
