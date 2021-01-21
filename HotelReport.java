public class HotelReport {

	public static void report(Hotel hotel) {
		System.out.printf("Hotel is:%s\n", hotel.getName());
		System.out.println("Breakdown");
		for (Room t : hotel.getRoomType()) {
			System.out.printf("\t%s:%s\n", t.getName(), t.getBedQuantity());
		}

		Bed b = hotel.getBedType();
		System.out.printf("\tBed: %s %s\n", b.getName(), b.getBedQuantity());
		/*
		 * System.out.printf("\tHotel %s Vacancy\n", (hotel.hasVacancies()) ?
		 * "is" : "is not");
		 */
		System.out.println("Summary:" + hotel.getBedQuantity());

	}
}
