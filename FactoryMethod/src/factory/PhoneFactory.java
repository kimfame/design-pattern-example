package factory;

public class PhoneFactory extends Factory {

	@Override
	public Product init() {
		System.out.println("[Phone Factory][Job 0] init() Success!");
		Phone phone = new Phone();
		return phone;
	}
	
	@Override
	public void makeParts() {
		System.out.println("[Phone Factory][Job 1] makeParts() Success!");
	}

	@Override
	public void assembleParts() {
		System.out.println("[Phone Factory][Job 2] assembleParts() Success!");
	}

	@Override
	public void testProduct() {
		System.out.println("[Phone Factory][Job 3] testProduct() Success!");
	}
}
