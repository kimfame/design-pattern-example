package factory;

public interface Factory {
	public abstract Door produceDoor();
	public abstract Frame produceFrame();
	public abstract Wheel produceWheel();
	public abstract Steering produceSteering();
}
