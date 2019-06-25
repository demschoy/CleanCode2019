package hotel;

import enumerations.RoomType;

public class Room {
	int number;
	int floor;
	RoomType type;
	String description;
	double price;
	boolean isReserved; 
	
	Room(int number, int floor, RoomType type, String description, double price) {
		this.number = number;
		this.floor = floor;
		this.type = type;
		this.description = description;
		this.price = price;
		this.isReserved = false;
	}
	
	
}
