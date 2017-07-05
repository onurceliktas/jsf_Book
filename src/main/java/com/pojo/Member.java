package com.pojo;

import java.util.HashSet;
import java.util.Set;

public class Member implements java.io.Serializable {

	private Integer memberId;
	private String memberName;
	private String memberEmail;
	private int memberAge;
	private Set<Loan> loans = new HashSet<Loan>(0);

	public Member() {
	}

	public Member(String memberName, String memberEmail, int memberAge) {
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberAge = memberAge;
	}

	public Member(String memberName, String memberEmail, int memberAge, Set<Loan> loans) {
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberAge = memberAge;
		this.loans = loans;
	}

	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return this.memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public int getMemberAge() {
		return this.memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public Set<Loan> getLoans() {
		return this.loans;
	}

	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}

}
