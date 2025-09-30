package teoria.ej17_xml_jaxb.book;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BookConverter {

    /**
     * Escribe un libro en un fichero
     * @param book
     * @param fichero
     * @throws JAXBException
     * @throws IOException
     */
    public void marshallBook(Book book, File fichero) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(book, fichero);


    }

    /**
     * Escribe una libreria (conjunto de libros) en un fichero
     * @param bookstore
     * @param file
     * @throws JAXBException
     * @throws IOException
     */
    public void marshallBookStore(Bookstore bookstore, File file) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Bookstore.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(bookstore, file);

    }

    /**
     * Obtiene un libro de un fichero XML
     * @param file
     * @return
     * @throws JAXBException
     * @throws IOException
     */
    public Book unmarshallBook(File file) throws JAXBException, IOException {
        JAXBContext context = JAXBContext.newInstance(Book.class);
        return (Book) context.createUnmarshaller()
                .unmarshal(file);

    }

    public Bookstore unmarshallBookStore(File file)throws JAXBException, IOException{
        JAXBContext context = JAXBContext.newInstance(Bookstore.class);
        return (Bookstore) context.createUnmarshaller()
                .unmarshal(new FileReader(file));
    }
}
