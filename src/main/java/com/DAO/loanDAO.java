
package com.DAO;

/**
 *
 * @author onur
 */

import java.util.ArrayList;
import java.util.List;
import com.pojo.Loan;
import com.util.HibernateUtil;
import org.hibernate.Query;
import com.bean.loanBean;
import com.pojo.Book;
import com.pojo.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class loanDAO {

	private Integer loanId;
	private loanBean lb;
	private Loan loan;

	public loanDAO() {
		lb = new loanBean();
		loan = new Loan();
	}

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public loanBean getLb() {
		return lb;
	}

	public void setLb(loanBean lb) {
		this.lb = lb;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public List<Loan> readLoan() {
		List<Loan> list = new ArrayList<>();
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		Query qu = ses.createQuery("from Loan");
		list = qu.list();
		ses.getTransaction().commit();
		for (Loan bean : list) {
			bean.setMember((Member) ses.get(Member.class, bean.getMember().getMemberId()));
			bean.setBook((Book) ses.get(Book.class, bean.getBook().getBookId()));
		}

		ses.close();
		return list;
	}

	public void save(Loan loan) {
		SessionFactory sessionFactory;
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		session.save(loan);
		ts.commit();
	}

	public void update(Loan loan) {
		SessionFactory sessionFactory;
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		session.update(loan);
		ts.commit();
	}

	public void delete(Loan loan) {
		SessionFactory sessionFactory;
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		session.delete(loan);
		ts.commit();

	}
}
