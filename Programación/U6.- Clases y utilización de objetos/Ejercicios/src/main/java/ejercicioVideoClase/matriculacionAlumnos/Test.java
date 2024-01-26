package ejercicioVideoClase.matriculacionAlumnos;

/**
 *
 * @author Edgar
 */
public class Test {

    public static void main(String[] args) {

        // Creamos Alumnos
        Alumno alumno1 = new Alumno("Juan Pérez", "12345678A");
        Alumno alumno2 = new Alumno("Ana Sánchez", "12345671B");
        Aula aula1 = new Aula("Aula 100", 30);
        Docente docente1 = new Docente("Carlos García", "34567890C");

        CentroEducativo centroEducativo = new CentroEducativo("Instituto de Enseñanza");

        Curso curso1 = new Curso("Matemáticas", docente1, aula1);

        curso1.añadirAlumno(alumno1);
        curso1.añadirAlumno(alumno2);

        docente1.asignarCurso(curso1);

        centroEducativo.añadirAula(aula1);
        centroEducativo.añadirAlumno(alumno1);
        centroEducativo.añadirAlumno(alumno2);
        centroEducativo.añadirDocente(docente1);
        centroEducativo.añadirCurso(curso1);

        System.out.println(centroEducativo.getAlumnos());

    }

}
