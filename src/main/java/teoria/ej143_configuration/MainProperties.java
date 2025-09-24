package teoria.ej143_configuration;

import java.io.IOException;

public class MainProperties {

	public static void main(String[] args) throws IOException {

			// RUTA DEL A´RCHIVO DE PROPIlñEDADES RELATIVA AL DIRECTORIO RAÍZ DEL PROYECTO PARA ENCONTRAR EL ARCHIVO.
			String rutaArchivo = "src/main/resources/configuracion.properties";

			//  CARGAND.O EL ARCHIVO.
			PropertiesHandler handler = new PropertiesHandler(rutaArchivo);

			// RECUPERAR LOS VALORES DE LAS PROPIEDADES
			String usuario = handler.getPropertyString("user");
			String contrasena = handler.getPropertyString("password");

			// MOSTRAR LOS VALORES POR CONSOLA PARA VERIFICAR QUE  FUNCIONA.
			System.out.println("----------------------------------------");
			System.out.println("LEYENDO PROPIEDADES DESDE EL ARCHIVO:");
			System.out.println("Usuario: " + usuario);
			System.out.println("Contraseña: " + contrasena);
			System.out.println("----------------------------------------");
		}
	}



























		/*propertiesSimple();
		//propertiesJasypt();
	}

	private static void propertiesSimple() throws IOException {
		PropertiesHandler propsHandler = new PropertiesHandler();
		String user = propsHandler.getPropertyString("user");
		System.out.println("user: " + user);
	}

	private static void propertiesJasypt() {
	//	PropertiesHandler propsHandler = new PropertiesHandler("src/main/resources/cifrado.properties");
//		String numTarjeta = propsHandler.getPropertyStringCipher("NUM_TARJETA");
//		String pin = propsHandler.getPropertyStringCipher("PIN");
//		System.out.println("numTarjeta: " + numTarjeta);
//		System.out.println("pin: " + pin);
	}
}
*/