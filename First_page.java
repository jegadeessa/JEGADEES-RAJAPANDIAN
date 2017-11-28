package night;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LOGIN")

public class First_page {
	private String customer_id;
	private String password;
	

	public static void main(String[] args) {
		

	}


	public String getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
