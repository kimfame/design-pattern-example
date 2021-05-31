package jet;

import factory.Steering;

public class JetSteering implements Steering {

	@Override
	public void getPartName() {
		System.out.println("[Jet] Steering");
	}

}
