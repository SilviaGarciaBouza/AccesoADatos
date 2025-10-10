package teoria.ej207_test_unitarios;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books=new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> findBooksByAuthor(String author) {
        return books.stream().filter(e->e.getAuthor().equalsIgnoreCase(author)).toList();

    }

    public boolean removeBook(String title) {
     boolean isRemove=false;
        for(Book element: books){
            if(element.getTitle().equals(title)){
                isRemove=true;
               break;

            }
        }
       books = books.stream().filter(e->!e.getTitle().equals(title)).toList();
        return isRemove;


    }

    public int getTotalBooks() {
        return books.size();
    }

    // Otros métodos relevantes para la gestión de libros en la biblioteca
}