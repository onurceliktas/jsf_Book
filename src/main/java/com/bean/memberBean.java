
package com.bean;

/**
 *
 * @author onur
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import java.util.List;
import com.pojo.Member;
import com.DAO.memberDAOImpl;
import com.util.HibernateUtil;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import org.hibernate.Query;
import org.hibernate.Session;


@Named(value = "memberBean")
@SessionScoped
public class memberBean implements Serializable {

    /**
     * Creates a new instance of memberBean
     */
    private Member member;
    private Member selectedMember;
    private Integer MemberId;
    private List<Member> filteredMember;

    public memberBean() {
        member = new Member();
    }

    public void onRowSelectMember() {
        member = selectedMember;
    }

    public List<Member> readMember() {
        memberDAOImpl memberDAOImpl = new memberDAOImpl();
        return memberDAOImpl.readMember();

    }

    public void save() {
        memberDAOImpl memberDAOImpl = new memberDAOImpl();
        memberDAOImpl.save(member);
    }

    public void update() {
        memberDAOImpl memberDAOImpl = new memberDAOImpl();
        memberDAOImpl.update(member);
    }

    public void delete() {
        memberDAOImpl memberDAOImpl = new memberDAOImpl();
        memberDAOImpl.delete(member);
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Member getSelectedMember() {
        return selectedMember;
    }

    public void setSelectedMember(Member selectedMember) {
        this.selectedMember = selectedMember;
    }

    public Integer getMemberId() {
        return MemberId;
    }

    public void setMemberId(Integer MemberId) {
        this.MemberId = MemberId;
    }

    public List<Member> getFilteredMember() {
        return filteredMember;
    }

    public void setFilteredMember(List<Member> filteredMember) {
        this.filteredMember = filteredMember;
    }

}
