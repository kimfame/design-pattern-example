package main;

import car.CarFactory;
import factory.Door;
import factory.Factory;
import factory.Frame;
import factory.Steering;
import factory.Wheel;
import jet.JetFactory;

public class Main {

	public static void main(String[] args) {
		Factory factory1 = new CarFactory();
		
		Door door1 = factory1.produceDoor();
		Frame frame1 = factory1.produceFrame();
		Steering steering1 = factory1.produceSteering();
		Wheel wheel1 = factory1.produceWheel();
		
		door1.getPartName();
		frame1.getPartName();
		steering1.getPartName();
		wheel1.getPartName();
		
		Factory factory2 = new JetFactory();
		
		Door door2 = factory2.produceDoor();
		Frame frame2 = factory2.produceFrame();
		Steering steering2 = factory2.produceSteering();
		Wheel wheel2 = factory2.produceWheel();
		
		door2.getPartName();
		frame2.getPartName();
		steering2.getPartName();
		wheel2.getPartName();
		
	}

}
