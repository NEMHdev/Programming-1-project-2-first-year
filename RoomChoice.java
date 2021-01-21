import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class RoomChoice {

	private Map<String, Room> roomType;
	private Map<String, Bed> bedType;
	private Map<String, Hotel> namedRooms;

	// first making the list of Rooms the converting that into a map

	public Map<String, Room> getRoomType() {
		if (roomType == null) {
			List<Room> roomTypeList = new ArrayList<Room>();
			roomTypeList.add(new Room("Single", 1));
			roomTypeList.add(new Room("double", 2));
			roomTypeList.add(new Room("Family", 5));
			roomTypeList.add(new Room("Suite", 7));
			roomType = nameToObjectMap(roomTypeList);
		}
		return roomType;
	}

	// making an array list of beds

	public Map<String, Bed> getBedType() {
		if (bedType == null) {
			List<Bed> bedTypeList = new ArrayList<Bed>();
			bedTypeList.add(new Bed("Single", 1));
			bedTypeList.add(new Bed("Double", 1));
			bedTypeList.add(new Bed("King", 1));
			bedType = nameToObjectMap(bedTypeList);
		}
		return bedType;
	}

	// this formulates the array lists into maps

	public static <H extends Bookable> Map<String, H> nameToObjectMap(
			List<H> list) {
		Map<String, H> map = new HashMap<String, H>();
		for (H h : list) {
			map.put(((HotelName) h).getName(), h);
		}
		return Collections.unmodifiableMap(map);
	}

	// if run from this class the lists will be displayed

	public static void main(String[] Args) {
		RoomChoice h = new RoomChoice();

		System.out.println(h.getRoomType());
		System.out.println(h.getBedType());
	}
}
