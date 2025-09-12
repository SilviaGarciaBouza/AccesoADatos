package teoria.ej122a_currentfile;

import java.io.File;
import java.util.stream.Stream;

public class RecursividadFile3 {
    public static void main(String[] args) {
        File f = new File("src/main");
        imprimirArchivos(f);
    }
    public static void imprimirArchivos(File f){
        if(f.isDirectory()){
            Stream.of(f.listFiles())
                    .forEach(element -> {
                        System.out.println(element.getAbsolutePath());
                        if(element.isDirectory())imprimirArchivos(element);
                    });
        }
    }

}
