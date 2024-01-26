package ejercicioVideoClase.matriculacionAlumnos;

/**
 *
 * @author Edgar
 */
public class Alumno {

    private String nombreCompleto;
    private String dni;
    private Curso curso;

    // Constructores
    public Alumno() {
    }

    public Alumno(String nombre, String dni) {

        this.nombreCompleto = nombre;
        this.dni = dni;
        this.curso = null;
    }

    public Alumno(String dni, Curso curso) {
        this.dni = dni;
        this.curso = curso;
    }

    // Getters and Setters
    public String getNombre() {
        return nombreCompleto;
    }

    public void setNombre(String nombre) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", curso=" + curso + '}';
    }

}
