package factory;

public class CarFactory extends Factory {

	@Override
	public void makeParts() {
		System.out.println("[Car Factory][Job 1] makeParts() Success!");
	}

	@Override
	public void assembleParts() {
		System.out.println("[Car Factory][Job 2] assembleParts() Success!");
	}

	@Override
	public void testProduct() {
		System.out.println("[Car Factory][Job 3] testProduct() Success!");
	}
	
	
}
