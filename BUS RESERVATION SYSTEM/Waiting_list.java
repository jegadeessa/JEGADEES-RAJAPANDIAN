package night;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Waiting_list {
			private String id;
			private String reference_no;
			public String getId() {
				return id;
			}
			public void setId(String id) {
				this.id = id;
			}
			public String getReference_no() {
				return reference_no;
			}
			public void setReference_no(String reference_no) {
				this.reference_no = reference_no;
			}
		
	}



