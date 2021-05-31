package car;

import factory.Door;

public class CarDoor implements Door {

	@Override
	public void getPartName() {
		System.out.println("[Car] Door");
	}

}
