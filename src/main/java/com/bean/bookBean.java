
package com.bean;

/**
*
* @author onur
*/

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import java.util.List;
import com.pojo.Book;
import com.DAO.bookDAO;
import com.util.HibernateUtil;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import org.hibernate.Query;
import org.hibernate.Session;


@ManagedBean(name = "bookBean")
@SessionScoped
public class bookBean implements Serializable {
	
	private Book book;
	private Book selectedBook;
	private Integer BookId;
	private List<Book> filteredBook;

	public bookBean() {
		book = new Book();
	}

	public void onRowSelectBook() {
		book = selectedBook;
	}

	public List<Book> readBook() {
		bookDAO bookd = new bookDAO();
		return bookd.readBook();

	}

	public void save() {
		bookDAO bookDAO = new bookDAO();
		bookDAO.save(book);
	}

	public void update() {
		bookDAO bookDAO = new bookDAO();
		bookDAO.update(book);
	}

	public void delete() {
		bookDAO bookDAO = new bookDAO();
		bookDAO.delete(book);
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Book getSelectedBook() {
		return selectedBook;
	}

	public void setSelectedBook(Book selectedBook) {
		this.selectedBook = selectedBook;
	}

	public Integer getBookId() {
		return BookId;
	}

	public void setBookId(Integer BookId) {
		this.BookId = BookId;
	}

	public List<Book> getFilteredBook() {
		return filteredBook;
	}

	public void setFilteredBook(List<Book> filteredBook) {
		this.filteredBook = filteredBook;
	}

}
