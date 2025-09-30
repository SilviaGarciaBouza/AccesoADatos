package teoria.ej17_xml_jaxb.book;

import java.util.Date;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name="book")
@XmlType(propOrder = {"id","title","date"})
public class Book {
private Long id;
private String title;
private  Date date;
private String Author;

@XmlAttribute
    public void setId(Long id){
    this.id=id;
}
@XmlElement(name = "title")
    public void setTitle(String title){
    this.title=title;
}
    @XmlElement(name = "date")
    public void setDate(Date date){
        this.date=date;
    }
    @XmlTransient()
    public void setAuthor(String author){
    this.Author=author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getDate() {
        return date;
    }

    public String getAuthor() {
        return Author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", Author='" + Author + '\'' +
                '}';
    }
}
