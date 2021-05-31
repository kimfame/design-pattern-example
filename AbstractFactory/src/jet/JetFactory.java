package jet;

import factory.Door;
import factory.Factory;
import factory.Frame;
import factory.Steering;
import factory.Wheel;

public class JetFactory implements Factory {

	@Override
	public Door produceDoor() {
		return new JetDoor();
	}

	@Override
	public Frame produceFrame() {
		return new JetFrame();
	}

	@Override
	public Wheel produceWheel() {
		return new JetWheel();
	}

	@Override
	public Steering produceSteering() {
		return new JetSteering();
	}

}
