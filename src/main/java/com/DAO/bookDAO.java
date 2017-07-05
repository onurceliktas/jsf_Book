
package com.DAO;

/**
 *
 * @author onur
 */

import java.util.ArrayList;
import java.util.List;
import com.pojo.Book;
import com.util.HibernateUtil;
import org.hibernate.Query;
import com.bean.bookBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class bookDAO {

    private Integer bookId;
    private bookBean dm;
    private Book book;

    public bookDAO() {
        dm = new bookBean();
        book = new Book();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public bookBean getDm() {
        return dm;
    }

    public void setDm(bookBean dm) {
        this.dm = dm;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> readBook() {
        List<Book> list = new ArrayList<>();
        Session ses = HibernateUtil.getSessionFactory().openSession();
        ses.beginTransaction();
        Query qu = ses.createQuery("from Book");
        list = qu.list();
        ses.getTransaction().commit();
        ses.close();
        return list;
    }

    public void save(Book book) {
        SessionFactory sessionFactory;
        sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction ts = session.beginTransaction();
        session.save(book);
        ts.commit();
        book.setBookAuthor("");
        book.setBookId(null);
        book.setBookIsbn("");
        book.setBookName("");
    }

    public void update(Book book) {
        SessionFactory sessionFactory;
        sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction ts = session.beginTransaction();
        session.update(book);
        ts.commit();
        book.setBookAuthor("");
        book.setBookId(null);
        book.setBookIsbn("");
        book.setBookName("");
    }

    public void delete(Book book) {
        SessionFactory sessionFactory;
        sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction ts = session.beginTransaction();
        session.delete(book);
        ts.commit();
        book.setBookAuthor("");
        book.setBookId(null);
        book.setBookIsbn("");
        book.setBookName("");

    }
    
}
