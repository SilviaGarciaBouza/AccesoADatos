package teoria.ej17_xml_dom.coche;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CocheDao {

	// src\\main\\resources\\1_7_xml_dom\\coches.xml
	/**
	 * Lee una lista de coches desde un archivo XML.
	 *
	 * @param  fichero XML desde el cual se leen los coches.
	 * @return La lista de coches leídos del archivo XML.
	 */
	public List<Coche> readFromXml(File fichero) {
        List<Coche> listaCoches= new ArrayList<>();
		try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fichero);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("coche");
            for(int i= 0; i< nList.getLength(); i++) {
                Node nNode = nList.item(i);

                if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                   String id= eElement.getAttribute("id");
                    String marca=  eElement.getElementsByTagName("marca").item(0).getTextContent();
                   String modelo= eElement.getElementsByTagName("modelo").item(0).getTextContent();
                   String cilindrada= eElement.getElementsByTagName("cilindrada").item(0).getTextContent();
                listaCoches.add(new Coche(Integer.parseInt(id), marca, modelo, Double.parseDouble(cilindrada)));

                }

            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return listaCoches;
	}
	/**
	 * Escribe una lista de coches en un archivo XML.
	 *
	 * @param fichero La ruta del archivo donde se guardará el XML.
	 * @param coches La lista de coches a escribir en el archivo XML.
	 */
	public void writeToXml(File fichero, List<Coche> coches) {
        try{
            DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
            DocumentBuilder db= dbf.newDocumentBuilder();
            Document doc = db.newDocument();
            Element eRaiz= doc.createElement("concesionario");
            doc.appendChild(eRaiz);







            for(Coche element:coches) {

                Element eCoche = doc.createElement("coche");
                eRaiz.appendChild(eCoche);

                Attr attr = doc.createAttribute("id");
                attr.setValue(String.valueOf(element.getId()));
                eCoche.setAttributeNode(attr);
                Element eMarca = doc.createElement("marca");
                eMarca.appendChild(doc.createTextNode(element.getMarca()));
                eCoche.appendChild(eMarca);

                Element eModelo = doc.createElement("modelo");
                eModelo.appendChild(doc.createTextNode(element.getModelo()));
                eCoche.appendChild(eModelo);

                Element eCilindrada = doc.createElement("cilindrada");
                eCilindrada.appendChild(doc.createTextNode(String.valueOf(element.getCilindrada())));
                eCoche.appendChild(eCilindrada);
            }


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(fichero);
            transformer.transform(source, result);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
	}

}
