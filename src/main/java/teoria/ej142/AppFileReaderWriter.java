package teoria.ej142;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppFileReaderWriter {

    public static void main(String[] args) {
       // ejercicioA();
       // System.out.println("***************************************************");
      //  ejercicioB();
        // System.out.println("***************************************************");

        ejercicioC();
    }

    private static void ejercicioA() {
        String rutaFichero= "nuevo.txt";
        List<String> lista= List.of("limon", "fresa", "naranja");
        System.out.println("------------------------------------");
        GestorFichero.write(rutaFichero, true);
        System.out.println("------------------------------------");
        GestorFichero.write(rutaFichero, true,lista);
        System.out.println("------------------------------------");
        GestorFichero.read(rutaFichero);
        System.out.println("------------------------------------");
        GestorFichero.printWrite(rutaFichero,true);
        System.out.println("------------------------------------");
        GestorFichero.printWrite(rutaFichero,true, lista);
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        GestorFichero.write(rutaFichero, false);
        System.out.println("------------------------------------");
        GestorFichero.write(rutaFichero, false,lista);
        System.out.println("------------------------------------");
        GestorFichero.read(rutaFichero);
        System.out.println("------------------------------------");
        GestorFichero.printWrite(rutaFichero,false);
        System.out.println("------------------------------------");
        GestorFichero.printWrite(rutaFichero,false, lista);

        //throw new UnsupportedOperationException("A implementar por el alumno");
    }

    /**
     * Escribir los impares del 1 al 10 en un fichero
     *
     * Leer el fichero y mostrar por consola
     *
     */
    private static void ejercicioB() {
        //throw new UnsupportedOperationException("A implementar por el alumno");
        String rutaFichero= "nuevo2.txt";

        List<Integer>lista= List.of(1,3,5,7,9);
        GestorFichero.write(rutaFichero, false,lista.stream().map(e->e.toString()).toList());
        System.out.println("------------------------------------");
        GestorFichero.write(rutaFichero, true,lista.stream().map(e->e.toString()).toList());
        System.out.println("------------------------------------");
        GestorFichero.printWrite(rutaFichero, true,lista.stream().map(e->e.toString()).toList());
        System.out.println("------------------------------------");
        GestorFichero.printWrite(rutaFichero, false,lista.stream().map(e->e.toString()).toList());
        System.out.println("------------------------------------");

    }

    /**
     * Escribir una lista de animales en fichero
     *
     */
    private static void ejercicioC() {
        List<Animal> listaAnimales= new ArrayList<>();
        List<String> listaCadenaAnimales;
        String rutaFichero= "nuevo3.txt";
        listaAnimales.add(new Animal("vaca", 15, 4, false));
        listaAnimales.add(new Animal("garza", 50, 2, true));
        listaAnimales.add(new Animal("erizo", 7, 4, false));
        listaAnimales.add(new Animal("pingüino", 20, 2, false));

        listaCadenaAnimales= getLinesFromAnimals(listaAnimales);
        GestorFichero.printWrite(rutaFichero, true, listaCadenaAnimales);
    }

    /**
     * Transforma una lista de animales en una lista de lineas (String)
     * @param animales
     * @return
     */
    private static List<String> getLinesFromAnimals(List<Animal> animales) {
        return animales.stream().map(e->getLineFromAnimal(e)).toList();

    }

    /**
     * Transforma un animal en una linea (String)
     * @param animal
     * @return
     */
    private static String getLineFromAnimal(Animal animal) {
        return animal.getNombre()+", "+animal.getVelocidad()+", "+animal.getCantidadPatas()+", "+animal.isPuedeVolar();
    }
}
