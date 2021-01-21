import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hotel extends HotelName {

	// Extends HotelName to enable me to use inheritance to avoid too much code
	// duplication

	private List<Room> room = new ArrayList<Room>();
	private Bed bedType;

	// Created private variable for bedType and a private list for roomType

	public Hotel(Bed bedType) {
		this(null, bedType);
	}

	public Hotel(String name, Bed bedType) {
		super(name);
		this.bedType = bedType;
	}

	public Hotel(String name, Bed bedType, Room[] roomType) {
		this(name, bedType);
		room.addAll(Arrays.asList(roomType));
	}

	public void addRoomType(Room roomType) {
		room.add(roomType);
	}

	// this is to enable me to create a list of rooms

	public List<Room> getRoomType() {
		return Collections.unmodifiableList(room);
	}

	public Bed getBedType() {
		return bedType;
	}

	// Bed Quantity shows how many beds are in each room

	public int getBedQuantity() {
		int bedQuantity = 0;

		for (Room t : room) {
			bedQuantity += t.getBedQuantity();
		}
		return bedQuantity + bedType.getBedQuantity();
	}

	// tried to implement the hasVacancies property

	/*
	 * public boolean hasVacancies(){ for(Room r: room){ if(!r.hasVacancies()){
	 * return false; } } return bedType.hasVacancies(); }
	 */
}
