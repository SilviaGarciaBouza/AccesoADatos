package teoria.ej122a_currentfile;

import java.io.File;
import java.io.IOException;

public class RecursividadFile {
    public static void main(String[] args) throws IOException {
        File fichero = new File("src/main");
        mostrarCarpeta(fichero);
    }
    // una funcion recursiva que se llame a si misma
    public static void mostrarCarpeta(File fichero) {
        if (fichero.isDirectory()) {
            File[] lista = fichero.listFiles();
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i].getAbsolutePath());
                if (lista[i].isDirectory()) {
         mostrarCarpeta(lista[i]);
                }
            }
        }
    }
}


