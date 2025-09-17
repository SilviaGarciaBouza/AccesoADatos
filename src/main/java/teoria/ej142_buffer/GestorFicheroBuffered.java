package teoria.ej142_buffer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Trabaja con BufferedReader y BufferedWriter
 */
public class GestorFicheroBuffered {

	/**
	 * Lee un fichero y vuelva las lineas en una lista
	 * @param fichero
	 * @return
	 * @throws IOException
	 */
	public static List<String> readLines(File fichero) throws IOException {
		throw new UnsupportedOperationException("A implementar por el alumno");
	}

	/**
	 * Recibe una lista de lineas que desea volcar a fichero
	 * 
	 * @param fichero ruta del fichero
	 * @param append TRUE si va a añadir lineas al final, FALSE si sobreescribe el fichero
	 * @param lines lista de lineas a volcar en fichero
	 * @throws IOException
	 */
	public static void writeLines(File fichero, boolean append, List<String> lines) throws IOException {
        try(
                FileOutputStream fos= new FileOutputStream(fichero, append);
                OutputStreamWriter osw=new OutputStreamWriter(fos);
                BufferedWriter bw= new BufferedWriter(osw);


                ){
            lines.forEach(e-> {
                try {
                    bw.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


	}

	/**
	 * Leer el contenido de la lista y volcarlo a una lista
	 * Mostrar el contenido de la lista por consola
	 * @param fichero
	 * @throws IOException
	 */
	public static void printFileToConsole(File fichero) throws IOException {
		throw new UnsupportedOperationException("A implementar por el alumno");
	}
}
