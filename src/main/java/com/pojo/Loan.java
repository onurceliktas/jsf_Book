package com.pojo;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Loan implements java.io.Serializable {

	private Integer loanId;
	private Book book;
	private Member member;
	@Temporal(TemporalType.DATE)
	private Date loanFrom;
	@Temporal(TemporalType.DATE)
	private Date loanUntil;

	public Loan() {
	}

	public Loan(Book book, Member member) {
		this.book = book;
		this.member = member;
	}

	public Loan(Book book, Member member, Date loanFrom, Date loanUntil) {
		this.book = book;
		this.member = member;
		this.loanFrom = loanFrom;
		this.loanUntil = loanUntil;
	}

	public Integer getLoanId() {
		return this.loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Date getLoanFrom() {
		return this.loanFrom;
	}

	public void setLoanFrom(Date loanFrom) {
		this.loanFrom = loanFrom;
	}

	public Date getLoanUntil() {
		return this.loanUntil;
	}

	public void setLoanUntil(Date loanUntil) {
		this.loanUntil = loanUntil;
	}

}
