package hotel;

import java.util.Date;
import enumerations.RoomType;
import enumerations.ReservationStatus;

public class Reservation {
	Date arrivalDate;
	Date departureDate;
	RoomType type;
	ReservationStatus status;
	
	public Reservation(Date arrivalDate, Date departureDate, String roomType) {
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;		
		this.type = RoomType.valueOf(roomType);
		this.status = ReservationStatus.pending;
	}

	public void changeStatus(ReservationStatus newStatus) {
		this.status = newStatus;
	}
	
	public void changeArrivalDate(Date newDate) {
		this.arrivalDate = newDate;
	}
	
	public void changeDepartureDate(Date newDate) {
		this.departureDate = newDate;
	}
	
	public void changeRoom(String newRoomType) {
		this.type = RoomType.valueOf(newRoomType);
	}
	
	public Date getArrivalDate() {
		return arrivalDate;
	}
	
	public Date getDepartureDate() {
		return departureDate;
	}
	
	public String getStatus() {
		return status.getStatus();
	}
	
	public String getRoomType() {
		return type.getType();
	}
	
	public void cancel() {
		status = ReservationStatus.canceled;
		
	}
	
	public void confirm() {
		status = ReservationStatus.confirmed;
	}
}
