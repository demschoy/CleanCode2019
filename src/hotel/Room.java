package hotel;

import enumerations.RoomType;

public class Room {
	private final int NONE = 0;
	private int number;
	private int floor;
	private RoomType type;
	private String description;
	private double price;
	
	public Room() {
		this.number = NONE;
		this.floor = NONE;
		this.description = "no description";
		this.price = NONE;
		this.type = RoomType.EMPTY;
	}
	
	public Room(int number, int floor, RoomType type, String description, double price) {
		this.number = number;
		this.floor = floor;
		this.type = type;
		this.description = description;
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public String getType() {
		return type.getType();
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
}
