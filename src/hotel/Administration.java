package hotel;

import hotel.Room;
import hotel.Reservation;

import java.util.Dictionary;
import java.util.List;

import enumerations.RoomType;

import java.util.Date;

public class Administration {
	private Room[] allRooms;
	private Dictionary<String, Integer> numberOfRoomsPerType;
	private Dictionary<String, List<Room>> roomsPerType;
	private Dictionary<Room, Reservation> reservedRooms;
	private Dictionary<Room, Reservation> takenRooms;
	
	Administration() {
		 //TODO	
	}
	
	public void addReservation(Reservation reservation) {
		Room room = findVacantRoom(reservation);
		if(room.getType().equals("EMPTY")) {
			reservation.cancel();
			return;
		}
		reservedRooms.put(room, reservation);
		reservation.confirm();
	}
	
	private Room findVacantRoom(Reservation forReservation) {
		String type = forReservation.getRoomType();
		List<Room> rooms = roomsPerType.get(type);
		int numberOfRooms = rooms.size();
		for(int current = 0; current < numberOfRooms; current++) {
			Room currentRoom = rooms.get(current);
			Date arrivalDate = forReservation.arrivalDate;
			Date departureDate = forReservation.departureDate;
			Date reservedFrom = reservedRooms.get(currentRoom).arrivalDate;
			Date reservedTo = reservedRooms.get(currentRoom).departureDate;
			if(reservedTo.before(arrivalDate) ||  reservedFrom.after(departureDate)) {
				return currentRoom;
			}
		}
		
		return new Room();
	}	
}
