package teoria.ej143_configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandler {
    Properties config;
    File file= new File("src/main/java/resources/configuracion.properties");

    public PropertiesHandler() throws IOException {
        this(new Properties(),new File("src/main/java/resources/configuracion.properties"));
    }

    public PropertiesHandler(Properties config, File file) throws IOException {
        this.config = config;
        this.file = file;
        config.load(new FileInputStream(file));
    }
    //    Crear una clase PropertiesHandler que nos permita leer una propiedad de este fichero.
//    Verifica que funcione correctamente.
//    Asegúrate que tenga un método getPropertyString,
//     que reciba como argumento la clave del String y devuelva el valor asociado
    public String getPropertyString(String key){
        return config.getProperty(key);
    }
































































//	private Properties configuracion;
//
//	// Constructor por defecto que usa una ruta predefinida
//	public PropertiesHandler() {
//		this("src/main/resources/mi.properties");
//	}
//
//	// Constructor que recibe una ruta de archivo de propiedades
//	public PropertiesHandler(String propertiesFilePath) {
//		loadProperties(propertiesFilePath);
//	}
//
//	private void loadProperties(String propertiesFilePath) {
//		configuracion = new Properties();
//		try (FileInputStream fis = new FileInputStream(propertiesFilePath)) {
//			configuracion.load(fis);
//		} catch (IOException e) {
//			throw new RuntimeException("Error al cargar el archivo de propiedades: " + propertiesFilePath, e);
//		}
//	}
//
//	public String getPropertyString(String prop) {
//		return configuracion.getProperty(prop);
//	}
//
//	public String getPropertyStringCipher(String prop) {
//		String propertyCifrada = configuracion.getProperty(prop);
//		Encriptador encriptador = new Encriptador();
//		String propertyDescifrada = encriptador.descifrar(propertyCifrada);
//		return propertyDescifrada;
//	}
//
//
//	// Método opcional para cambiar las propiedades después de la creación del objeto
//	public void reloadProperties(String propertiesFilePath) {
//		loadProperties(propertiesFilePath);
//	}
}
