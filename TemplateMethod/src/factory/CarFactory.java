package factory;

public class CarFactory extends Factory {

	@Override
	public boolean makeParts() {
		System.out.println("[Car Factory][Job 1] makeParts() Success!");
		return true;
	}

	@Override
	public boolean assembleParts() {
		System.out.println("[Car Factory][Job 2] assembleParts() Success!");
		return true;
	}

	@Override
	public boolean testProduct() {
		System.out.println("[Car Factory][Job 3] testProduct() Success!");
		return true;
	}
	
	
}
