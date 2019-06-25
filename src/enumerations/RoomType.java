package enumerations;

public enum RoomType {
	single("single"),
	doubled("double"),
	doubleDouble("double-double"),
	triple("triple"),
	suite("suite"),
	family("family"),
	twin("twin"),
	hollywoodTwin("hollywod twin"),
	studio("studio"),
	apartment("aparment"),
	deluxeApartment("deluxe apartment");
	
	private final String type;
	
	RoomType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}