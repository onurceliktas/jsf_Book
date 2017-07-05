
package com.DAO;

/**
*
* @author onur
*/

import com.pojo.Member;
import java.util.List;
import java.util.ArrayList;
import com.util.HibernateUtil;
import org.hibernate.Query;
import com.bean.memberBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class memberDAOImpl implements memberDAO {

	private Integer memberId;
	private memberBean mb;
	private Member member;

	public memberDAOImpl() {
		mb = new memberBean();
		member = new Member();
	}

	@Override
	public List<Member> readMember() {
		List<Member> list = new ArrayList<>();
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		Query qu = ses.createQuery("from Member");
		list = qu.list();
		ses.getTransaction().commit();
		ses.close();
		return list;
	}

	@Override
	public void save(Member member) {
		SessionFactory sessionFactory;
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();

		session.save(member);
		ts.commit();

		member.setMemberAge(0);
		member.setMemberEmail("");
		member.setMemberId(null);
		member.setMemberName("");

	}

	@Override
	public void delete(Member member) {
		SessionFactory sessionFactory;
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();

		session.delete(member);
		ts.commit();

		member.setMemberAge(0);
		member.setMemberEmail("");
		member.setMemberId(null);
		member.setMemberName("");
	}

	@Override
	public void update(Member member) {
		SessionFactory sessionFactory;
		sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();

		session.update(member);
		ts.commit();

		member.setMemberAge(0);
		member.setMemberEmail("");
		member.setMemberId(null);
		member.setMemberName("");
	}

	public List<Member> getAllMember() {
		List<Member> list = new ArrayList<>();
		Session ses = HibernateUtil.getSessionFactory().openSession();
		ses.beginTransaction();
		Query qu = ses.createQuery("select memberName from Member");
		list = qu.list();
		ses.getTransaction().commit();
		ses.close();
		return list;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public memberBean getMb() {
		return mb;
	}

	public void setMb(memberBean mb) {
		this.mb = mb;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
