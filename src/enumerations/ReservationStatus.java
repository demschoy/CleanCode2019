package enumerations;

public enum ReservationStatus {
	confirmed("confirmed"),
	pending("pending"),
	rejected("rejected");
	
	private final String status;
	
	ReservationStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
}
