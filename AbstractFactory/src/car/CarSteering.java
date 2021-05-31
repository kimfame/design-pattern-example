package car;

import factory.Steering;

public class CarSteering implements Steering {

	@Override
	public void getPartName() {
		System.out.println("[Car] Steering");
	}

}
