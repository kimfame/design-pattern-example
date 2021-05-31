package car;

import factory.Frame;

public class CarFrame implements Frame {

	@Override
	public void getPartName() {
		System.out.println("[Car] Frame");
	}

}
