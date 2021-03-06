package info.petProject.springLibrary.dao.impl;

import info.petProject.springLibrary.dao.interfaces.BookDAO;
import info.petProject.springLibrary.entities.Author;
import info.petProject.springLibrary.entities.Book;
import info.petProject.springLibrary.entities.Genre;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private List<Book> books;

    @Transactional
    public List<Book> getBooks() {

        books = (List<Book>) sessionFactory.getCurrentSession()
                .createCriteria(Book.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

        return books;
    }

    public List<Book> getBooks(Author author) {
        return null;
    }

    public List<Book> getBooks(String bookName) {
        return null;
    }

    public List<Book> getBooks(Genre genre) {
        return null;
    }

    public List<Book> getBooks(Character letter) {
        return null;
    }
}
