
package com.bean;

/**
*
* @author onur
*/

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import java.util.List;
import com.pojo.Loan;
import com.DAO.loanDAO;


@Named(value = "loanBean")
@SessionScoped
public class loanBean implements Serializable {

    /**
     * Creates a new instance of loanBean
     */
    private Loan loan;
    private Loan selectedLoan;
    private Integer loanId;
    private List<Loan> filteredLoan;

    public loanBean() {
        loan=new Loan();
    }
public void onRowSelectLoan() {
        loan=selectedLoan;
    }
    
    public List<Loan> readLoan() {
        loanDAO loandao = new loanDAO();
        return loandao.readLoan();

    }
    
    public void save() {
        loanDAO loandao = new loanDAO();
        loandao.save(loan);
    }

    public void update() {
        loanDAO loandao = new loanDAO();
        loandao.update(loan);
    }

    public void delete() {
        loanDAO loandao = new loanDAO();
        loandao.delete(loan);
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    public Loan getSelectedLoan() {
        return selectedLoan;
    }

    public void setSelectedLoan(Loan selectedLoan) {
        this.selectedLoan = selectedLoan;
    }

    public Integer getLoanId() {
        return loanId;
    }

    public void setLoanId(Integer loanId) {
        this.loanId = loanId;
    }

    public List<Loan> getFilteredLoan() {
        return filteredLoan;
    }

    public void setFilteredLoan(List<Loan> filteredLoan) {
        this.filteredLoan = filteredLoan;
    }
    
}
