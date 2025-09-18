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
            return alumnos.stream().map(e-> getLineaAlumno(e)).toList();

    }

    /**
     * Transforma un alumno en una linea
     * @param alumno
     * @return Juan,28,juan@example.com
     */
    public String getLineaAlumno(Alumno alumno) {
        return alumno.toString();
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
        return  lineas.stream().map(this::getAlumnoFromLine).toList();
    }

    /**
     * Transforma una linea en alumno
     *
     * @param lineaAlumno María,32,maria@example.com
     * @return
     */
    private Alumno getAlumnoFromLine(String lineaAlumno) {
      return   Alumno.alumnoDesdeString(lineaAlumno);

    }
}
