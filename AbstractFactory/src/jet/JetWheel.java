package jet;

import factory.Wheel;

public class JetWheel implements Wheel {

	@Override
	public void getPartName() {
		System.out.println("[Jet] Wheel");
	}

}
