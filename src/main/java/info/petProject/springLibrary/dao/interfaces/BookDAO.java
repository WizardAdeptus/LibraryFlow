package info.petProject.springLibrary.dao.interfaces;

import info.petProject.springLibrary.entities.Author;
import info.petProject.springLibrary.entities.Book;
import info.petProject.springLibrary.entities.Genre;

import java.util.List;

public interface BookDAO {
    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(String bookName);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Character letter);
}
