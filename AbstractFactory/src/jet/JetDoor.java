package jet;

import factory.Door;

public class JetDoor implements Door {

	@Override
	public void getPartName() {
		System.out.println("[Jet] Door");
	}

}
