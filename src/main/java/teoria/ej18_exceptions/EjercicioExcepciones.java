package teoria.ej18_exceptions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioExcepciones {

    // Método que lanza una checked exception
    public static void metodoChecked() throws IOException {
        File fichero = new File("ficheropath");

        List<String>lineas= new ArrayList<>();


    }

    // Método que lanza una unchecked exception
    public static void metodoUnchecked() {
        throw new ArithmeticException("Error aritmético (unchecked exception)");
    }

    public static void main(String[] args) {
        // 1. Intenta llamar a ambos métodos sin capturar las excepciones
        // metodoChecked();
        // metodoUnchecked();
        
        // 2. Ahora envuelve las llamadas en bloques try-catch
        try {
            metodoChecked();
        } catch (IOException e) {
            System.out.println("Capturada excepción checked: " + e.getMessage());
        }

        try {
            metodoUnchecked();
        } catch (ArithmeticException e) {
            System.out.println("Capturada excepción unchecked: " + e.getMessage());
        }
    }
}
