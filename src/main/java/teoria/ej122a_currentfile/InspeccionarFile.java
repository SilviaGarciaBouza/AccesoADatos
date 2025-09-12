package teoria.ej122a_currentfile;

import java.io.File;

/**
 * Hello world!
 *
 */
public class InspeccionarFile
{
    public static void main( String[] args )
    {

        File f = new File("src/main");
        System.out.println("AbsolutePath:" + f.getAbsolutePath());
        System.out.println("Path:" + f.getPath());
        System.out.println("Name:" + f.getName());
        System.out.println("IsDirectory:" + f.isDirectory());
        File[] listFiles = f.listFiles();
        for (File fchild: listFiles) {
            System.out.println("AbsolutePath fchild: " + fchild.getAbsolutePath());
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("La carpeta de mi usuario es " + System.getProperty("user.home"));
        System.out.println("El separador de archivos es " +  f.separator);
        System.out.println("La ruta en la que se encuentra actualmente el usuario es " +  System.getProperty("user.dir"));
        System.out.println("El caracter que separa las líneas de un fichero de texto  es " + System.getProperty("line.separator"));



    }


}
