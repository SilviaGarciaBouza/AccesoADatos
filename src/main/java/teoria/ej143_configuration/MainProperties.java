package teoria.ej143_configuration;

import java.io.IOException;

public class MainProperties {

	public static void main(String[] args) throws IOException {
		propertiesSimple();
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
