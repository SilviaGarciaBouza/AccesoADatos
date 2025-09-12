package teoria.ej1423_csv;

import java.util.ArrayList;
import java.util.List;

public class Utilidades {

    /**
     * Transforma alumnos en lineas
     * @param alumnos
     * @return Juan, 28, juan@example.com
     *         María,32,maria@example.com
     */
    public List<String> getLineasAlumnos(List<Alumno> alumnos) {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    /**
     * Transforma un alumno en una linea
     * @param alumno
     * @return Juan,28,juan@example.com
     */
    public String getLineaAlumno(Alumno alumno) {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    /**
     * Transforma lineas en alumnos
     *
     * @param lineas Nombre,Edad,Correo
     *               Juan,28,juan@example.com
     *               María,32,maria@example.com
     * @return
     */
    public List<Alumno> getAlumnosFromLineas(List<String> lineas) {
        //Quitamos la cabecera
        throw new UnsupportedOperationException("A implementar por el alumno");
    }

    /**
     * Transforma una linea en alumno
     *
     * @param lineaAlumno María,32,maria@example.com
     * @return
     */
    private Alumno getAlumnoFromLine(String lineaAlumno) {
        throw new UnsupportedOperationException("A implementar por el alumno");
    }
}
