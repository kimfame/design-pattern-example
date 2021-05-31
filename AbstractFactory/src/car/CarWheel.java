package car;

import factory.Wheel;

public class CarWheel implements Wheel {

	@Override
	public void getPartName() {
		System.out.println("[Car] Wheel");
	}

}
