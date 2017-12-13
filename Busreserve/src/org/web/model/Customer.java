package org.web.model;

import javax.persistance.Column;
import javax.persistance.Embedded;
import javax.persistance.Entity;
import javax.persistance.FetchType;
import javax.persistance.GeneratedValue;
import javax.persistance.GenerationType;
import javax.persistance.Id;
import javax.persistance.JoinColumn;
import javax.persistance.OneToOne;
import javax.persistance.Table;
import javax.persistance.TableGenerator;
import javax.persistance.UniqueConstraints;

@Entity
@Table(name="Brs_CustomerDetails",Catalog="Bus",UniqueConstraints={@UniqueConstraint(ColumnNames="mobile_no",name="Brs_Customer_Unq")})
public class Customer {

	private Integer Id;
	private String firstName;
	private String lastName;
	private String mobileNo;
	private BankDetails bankDetails;
	private Address address;
	
	@Embedded
	public BankDetails getBankDetails() {
		return bankDetails;
	}

	@Embedded
	public Address getAddress() {
		return address;
	}

	@Id
	@Column(name="Cus_id")
	@GeneratedValue(generator="Brs_CustomerDetails",Strategy=GenerationType.Table)
	public Integer getId() {
		return Id;
	}
	
	@Column(name="First_name",nullable=False,length=100)
	public String getFirstName() {
		return firstName;
	}
	
	@Column(name="Last_name",nullable=False,length=100)
	public String getLastName() {
		return LastName;
	}
	
	@Column(name="Mobile_No",nullable=false,length=100)
	public String getMobileNo() {
		return MobileNo;
	}
	
	
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="email_id")
	
	public UserCredential getcredential(){
		return credential;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	
	
	
}
