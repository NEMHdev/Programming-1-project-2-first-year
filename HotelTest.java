public class HotelTest {

	// This method tests the aspects of the RoomChoice class

	public void testRoomType() {
		Room r = new RoomChoice().getRoomType().get("Single");

		System.out.println("testRoomType:");
		System.out.println("\t:getBedQuantity(1):" + r.getBedQuantity() + "\n"
				+ "\t:getName(Single):" + r.getName());
	}

	// this method tests to see if room type works

	public void testBedType() {
		Bed b = new RoomChoice().getBedType().get("Single");

		System.out.println("testBedType:");
		System.out.println("\t:getBedQuantity(1):" + b.getBedQuantity() + "\n"
				+ "\t:getName(Single):" + b.getName());
	}

	// this method tests to see if bed type works

	public void testGetBedType() {
		RoomChoice rc = new RoomChoice();
		Hotel h = new Hotel(rc.getBedType().get("double"));

		System.out.println("testGetBedType:");
		System.out.println("\ttestGetBedType (double):" + h.getBedType());
	}

	// this method tests to see if get bed type works

	public void testAddRoomType() {
		RoomChoice rc = new RoomChoice();
		Hotel h = new Hotel(rc.getBedType().get("Single"));
		System.out.println("testAddRoomType:");

		System.out.println("\t:RoomTypeBefore( 0 ):" + h.getRoomType());
		h.addRoomType(rc.getRoomType().get("Family"));
		System.out.println("\t:RoomTypeTypeAfter( 1 ):" + h.getRoomType());
	}

	// this method tests to see if get room type works

	public void testGetBedQuantity() {
		RoomChoice rc = new RoomChoice();
		Hotel h = new Hotel(rc.getBedType().get("Double"));
		h.addRoomType(rc.getRoomType().get("Suite"));

		System.out.println("testGetBedQuantity:");
		System.out.println("\t:testGetBedQuantity (8):" + h.getBedQuantity());
	}

	// this method tests to see if get bed quantity works

	public static void main(String[] args) {

		// this main method implements the above methods

		HotelTest ht = new HotelTest();

		ht.testRoomType();
		ht.testBedType();
		ht.testGetBedType();
		ht.testGetBedQuantity();
		ht.testAddRoomType();
	}
}