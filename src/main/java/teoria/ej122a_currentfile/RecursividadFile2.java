package teoria.ej122a_currentfile;

import java.io.File;

public class RecursividadFile2 {
    public static void main(String[] args) {
        File f = new File("src/main");
        imprimirRuta(f);
    }
    public static void imprimirRuta(File f){
        if(f.isDirectory()){
            File[] lista = f.listFiles();
            for(File element:lista) {
                System.out.println(element.getAbsolutePath());
                if(element.isDirectory()){
                    imprimirRuta(element);
                }
            }
        }
    }

}
