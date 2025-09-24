package teoria.ej15_binario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinarioHandler {

	/**
	 * Escribe la lista de productos en un archivo binario
	 * @param fichero
	 * @param productos
	 */
	public void escribirBinario(File fichero, List<Producto> productos) {
		try(ObjectOutputStream serializador= new ObjectOutputStream(new FileOutputStream(fichero))){
            serializador.writeObject(productos);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
	}

	public List<Producto> leerBinario(File fichero) {
		List<Producto> listaProducto=null;
        try(ObjectInputStream deserializador=new ObjectInputStream((new FileInputStream(fichero)))){
            listaProducto=(List<Producto>) deserializador.readObject();
        }  catch(Exception e){
        System.out.println(e.getMessage());
    }
        return listaProducto;
	}
}
