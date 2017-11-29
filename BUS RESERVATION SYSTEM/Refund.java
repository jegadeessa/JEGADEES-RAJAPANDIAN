package night;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
public class Refund {
	private String amount;
	private String id;
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
