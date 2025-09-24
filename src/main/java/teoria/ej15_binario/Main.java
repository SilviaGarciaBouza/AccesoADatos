package teoria.ej15_binario;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	private static final String FILE_PATH = "producto.dat";
	
	public static void main(String[] args) {
        BinarioHandler handler= new BinarioHandler();
        handler.escribirBinario(new File(FILE_PATH),new ArrayList<Producto>(Arrays.asList(new Producto("nombre1",1.1f),new Producto("nombre2",2.2f))));
        System.out.println(handler.leerBinario(new File(FILE_PATH)));


	}
}
