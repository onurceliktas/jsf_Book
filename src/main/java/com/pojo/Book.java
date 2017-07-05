package com.pojo;

import java.util.HashSet;
import java.util.Set;

public class Book implements java.io.Serializable {

	private Integer bookId;
	private String bookIsbn;
	private String bookName;
	private String bookAuthor;
	private Set<Loan> loans = new HashSet<Loan>(0);

	public Book() {
	}

	public Book(String bookIsbn, String bookName, String bookAuthor) {
		this.bookIsbn = bookIsbn;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public Book(String bookIsbn, String bookName, String bookAuthor, Set<Loan> loans) {
		this.bookIsbn = bookIsbn;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.loans = loans;
	}

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookIsbn() {
		return this.bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return this.bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Set<Loan> getLoans() {
		return this.loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}

}
