package teoria.ej142;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;


/**
 * Trabaja con FileReader y FileWriter
 */
public class GestorFichero {


    /**
     * Metodo que escribe la frase "Hola Mundo" en un fichero. Incluye el \n
     *
     * @param fichero
     * @param append
     * @throws IOException
     */
    public static void write(String fichero, boolean append) {
        File f = new File(fichero);
        try (
                FileWriter fw = new FileWriter(f, append);) {
            fw.write("Hola mundo\n");
        } catch (IOException e) {
            System.err.println( e.getMessage());

        }
    }

    /**
     * Metodo que escribe la frase "Hola Mundo" en un fichero
     *
     * @param fichero
     * @param append
     * @throws IOException
     */
    public static void printWrite(String fichero, boolean append)  {
        //throw new UnsupportedOperationException("A implementar por el alumno");
        File f = new File(fichero);
        try (
                FileWriter fw = new FileWriter(f, append);
                FileReader fr = new FileReader(f);
                BufferedReader bfr = new BufferedReader(fr)) {
            fw.write("Hola mundo\n");
            bfr.lines().forEach(System.out::println);
        } catch (IOException e) {
            System.err.println(e.getMessage());

        }
    }

    /**
     * Metodo que sirve para devolver un String con el contenido del fichero
     *
     * @param fichero ruta relativa o absoluta del fichero
     * @return String con el contenido del fichero
     * @throws IOException
     */
    public static String read(String fichero)  {
       // throw new UnsupportedOperationException("A implementar por el alumno");
        File f = new File(fichero);
        StringBuilder sb= new StringBuilder();
        try (
                FileReader fr = new FileReader(f);
                BufferedReader bfr = new BufferedReader(fr)) {
            List<String> listaTexto= bfr.lines().toList();
            listaTexto.forEach(
                   elemento->{
                       sb.append(elemento);
                       System.out.println(elemento);}
            );
            return sb.toString();//añadir el ªN ??
        } catch (IOException e) {
           return e.getMessage();

        }
    }

    /**
     * Metodo que sirve para escribir una serie de lineas en fichero
     * <p>
     * Podemos anadirlas o sobreescribir el fichero.
     * Es necesario agregar el /n para hacer salto de linea
     *
     * @param fichero ruta relativa o absoluta del fichero
     * @param append  true anhade mas filas al final, false sobreescribe el fichero
     * @param lines   lista de lineas que quiero escribir en el fichero
     * @throws IOException
     */
    public static void write(String fichero, boolean append, List<String> lines) {
        File f = new File(fichero);
        try (
                FileWriter fw = new FileWriter(f, append);
                BufferedWriter bf = new BufferedWriter(fw)) {
           for(String elemento: lines){
               bf.write(elemento+"\n");
           }
        }
         catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public static void writeBeforeJava8(String fichero, boolean append, List<String> lines) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fichero, append);
            for (String line : lines) {
                fileWriter.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error consultando el fichero: " + e);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Error cerrando el fichero: " + e);
                }
            }
        }
    }

    /**
     * Metodo que sirve para escribir una serie de lineas en fichero
     * <p>
     * Podemos anadirlas o sobreescribir el fichero.
     *
     * @param fichero ruta relativa o absoluta del fichero
     * @param append  true anhade mas filas al final, false sobreescribe el fichero
     * @param lines   lista de lineas que quiero escribir en el fichero
     * @throws IOException
     */
    public static void printWrite(String fichero, boolean append, List<String> lines)  {
        //throw new UnsupportedOperationException("A implementar por el alumno");
       write( fichero,  append,  lines);
       read(fichero);


    }

}
