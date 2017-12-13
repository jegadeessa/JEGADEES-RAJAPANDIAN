package org.web.model;
import javax.persistance.Column;
import javax.persistance.Embeddable;
@Embeddable

public class BankDetails {

	private String accountNo;
	private String accountName;
	private String bankName;
	private String branchCode;
	private String contactNo;
	private String accountType;
	private String balance;
	private String debitCardNumber;
	
	@Column(name="Acount_no",nullable=false,length=100)
	public String getAccountNo() {
		return accountNo;
	}
	
	@Column(name="Account_name",nullable=false,length=100)
	public String getAccountName() {
		return accountName;
	}
	
	
	@Column(name="Bank_name",nullable=false,length=100)
	public String getBankName() {
		return bankName;
	}
	
	@Column(name="Branch_code",nullable=false,length=100)
	public String getBranchCode() {
		return branchCode;
	}
	
	@Column(name="Contact_no",nullable=false,length=100)
	public String getContactNo() {
		return contactNo;
	}
	
	
	@Column(name="Account_type",nullable=false,length=100)
	public String getAccountType() {
		return accountType;
	}
	
	
	@Column(name="Balance",nullable=false,length=100)
	public String getBalance() {
		return balance;
	}
	
	@Column(name="Debitcard_Number",nullable=false,length=100)
	public String getDebitCardNumber() {
		return debitCardNumber;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}
	
}
