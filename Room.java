public class Room extends Quantity {

	// Room class with constructer to set the properties of Room

	public Room(String name, int bedQuantity /* , boolean hasVacancies */) {
		super(name, bedQuantity /* , hasVacancies */);
	}

	public String toString() {
		return String.format("Room Type:[%s]", getName());
	}

}
