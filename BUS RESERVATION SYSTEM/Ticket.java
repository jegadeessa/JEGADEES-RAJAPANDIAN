package night;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

public class Ticket {
	private String source;
	private String destination;
	private String date_of_journey;
	private String time;
	private String bus_no;
	private String seat_no;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate_of_journey() {
		return date_of_journey;
	}
	public void setDate_of_journey(String date_of_journey) {
		this.date_of_journey = date_of_journey;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getBus_no() {
		return bus_no;
	}
	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}
	public String getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(String seat_no) {
		this.seat_no = seat_no;
	}
	
	

}
