package teoria.ej17_xml_jaxb.book;

import jakarta.xml.bind.JAXBException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookApp {

	BookConverter bookConverter = new BookConverter();

	public static void main(String[] args) throws JAXBException, IOException {
		BookApp app = new BookApp();
		app.marshallBook();

		Book book2 = app.unmarshallBook();
		System.out.println(book2.toString());

		app.marshallBookStore();
		System.out.println("Done!");

        Bookstore bs= app.unmarshallBookStore();
        System.out.println(bs.toString());
	}

	public void marshallBook() throws JAXBException, IOException {
		Book book1 = new Book();
		book1.setId(1L);
		book1.setTitle("Book1");
//		book1.setAuthor("Author1");
		book1.setDate(new Date());
		bookConverter.marshallBook(book1,new File("src\\main\\resources\\1_7_xml_jaxb\\book_wrote.xml"));
	}

	public Book unmarshallBook() throws JAXBException, IOException {
		Book book = bookConverter.unmarshallBook(new File("src\\main\\resources\\1_7_xml_jaxb\\book.xml"));
		return book;
	}

	public void marshallBookStore() throws JAXBException, IOException {

		Book book1 = new Book();
		book1.setId(1L);
		book1.setTitle("Book1");
		book1.setAuthor("Author1");
		book1.setDate(new Date());

		Book book2 = new Book();
		book2.setId(2L);
		book2.setTitle("Book2");
		book2.setAuthor("Author2");
		book2.setDate(new Date());

		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);

		Bookstore bookstore = new Bookstore();
		bookstore.setName("Couceiro");
		bookstore.setBooks(books);
		bookConverter.marshallBookStore(bookstore,new File("src\\main\\resources\\1_7_xml_jaxb\\bookstore.xml"));
	}
	public Bookstore unmarshallBookStore() throws JAXBException, IOException{
        Bookstore bookstore= bookConverter.unmarshallBookStore(new File("src\\main\\resources\\1_7_xml_jaxb\\bookstore.xml"));
    return bookstore;
    }


}
