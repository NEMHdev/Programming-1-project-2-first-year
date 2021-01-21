import java.util.Scanner;

public class HotelConfigure {

	public static void main(String[] args) {

		RoomChoice rc = new RoomChoice();

		Scanner s = new Scanner(System.in);

		// implemented a scanner for user input of rooms and beds

		System.out.println("Paradise Hotel");

		// this is the first choice given to the user

		System.out.println("Please choose a bed type:");
		for (Bed bedType : rc.getBedType().values()) {
			System.out.println(bedType.getName());
		}

		Bed choosenBedType = rc.getBedType().get(s.next());
		System.out.println("You choose:" + choosenBedType.getName());

		Hotel hotel = new Hotel(choosenBedType);

		// Second choice where the user can choose whether to add a room or
		// finish

		System.out.println("Please choose a Room Type, or Done:");

		for (Room r : rc.getRoomType().values()) {
			System.out.println(r.getName());
		}
		boolean cont = true;
		while (cont) {
			String next = s.next();
			if (next.equals("Done")) {
				cont = false;
				continue;
			}
			Room roomType = rc.getRoomType().get(next);
			hotel.addRoomType(roomType);
			System.out.println("You choose:" + roomType.getName());
		}

		new HotelReport().report(hotel);
	}

}