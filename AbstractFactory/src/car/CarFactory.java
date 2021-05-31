package car;

import factory.Door;
import factory.Factory;
import factory.Frame;
import factory.Steering;
import factory.Wheel;

public class CarFactory implements Factory {

	@Override
	public Door produceDoor() {
		return new CarDoor();
	}

	@Override
	public Frame produceFrame() {
		return new CarFrame();
	}

	@Override
	public Wheel produceWheel() {
		return new CarWheel();
	}

	@Override
	public Steering produceSteering() {		
		return new CarSteering();
	}

}
