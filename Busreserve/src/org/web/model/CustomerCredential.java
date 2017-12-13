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
@org.hibernate.annotations.Entity(dynamicUpdate=true)
@Table(name="Brs_CustomerCredential",catalog="Bus")
public class CustomerCredential {

	private String emaiId;
	private String password;
	private String authenticationKey;
	private Boolean activated;
	private Customer cust;
	
	
	@Id
	@Column(name="email_id",nullable=false)
	public String getEmaiId() {
		return emaiId;
	}
	
	@Column(name="password",nullable=false)
	public String getPassword() {
		return password;
	}
	

	@Column(name="authent_key",length=30,nullable=false)
	public String getAuthenticationKey() {
		return authenticationKey;
	}
	
	@Type(type="org.hibernate.type.NumericBooleanType")
	@Column(name="status",nullable=false)
	public Boolean getActivated() {
		return activated;
	}
	
	@OneToOne(cascade=CascadeType.All,fetch=FetchType.LAZY,mappedBy="credential")
	public Customer getCust() {
		return cust;
	}
	
	
	public void setEmaiId(String emaiId) {
		this.emaiId = emaiId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAuthenticationKey(String authenticationKey) {
		this.authenticationKey = authenticationKey;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

}

