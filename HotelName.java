public abstract class HotelName implements Bookable {

	private String name;

	public HotelName(String name) {
		this.name = name;
	}

	// Class to set the names of Rooms and beds

	public String getName() {
		return name;
	}

}
