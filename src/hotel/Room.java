package hotel;

import enumerations.RoomType;

public class Room {
	private int number;
	private int floor;
	private RoomType type;
	private String description;
	private double price;
	
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
