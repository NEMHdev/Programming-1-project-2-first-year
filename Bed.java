public class Bed extends Quantity {

	// Bed class with constructer to set the properties of beds

	public Bed(String name, int bedQuantity /* , boolean hasVacancies */) {
		super(name, bedQuantity /* , hasVacancies */);
	}

	public String toString() {
		return String.format("Bed Type:[%s]", getName());
	}

}