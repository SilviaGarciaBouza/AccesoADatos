package teoria.ej17_xml_jaxb.book;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement (name="bookstore")
@XmlType(propOrder = {"name", "books"})
public class Bookstore {
private String name;
private List<Book> books;

	@XmlElement(name="name")
    public void setName(String name){
        this.name=name;
    }
    @XmlElement(name= "books")
    public void setBooks(List<Book>books){
        this.books=books;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Bookstore{" +
                "name='" + name + '\'' +
                ", books=" + books.toString() +
                '}';
    }
}
