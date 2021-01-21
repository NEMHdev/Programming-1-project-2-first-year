public class Quantity extends HotelName {

	/*
	 * some comments in this class are where i tried to perform the HasVacancies
	 * property
	 */

	private int bedQuantity;

	/* private boolean hasVacancies; */

	public Quantity(String name, int bedQuantity /* , boolean hasVacancies */) {
		super(name);
		/* this.hasVacancies = hasVacancies; */
		this.bedQuantity = bedQuantity;
	}

	public int getBedQuantity() {
		return bedQuantity;
	}

	/*
	 * public boolean hasVacancies(){ return hasVacancies; }
	 */
}
