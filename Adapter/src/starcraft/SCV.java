package starcraft;

public class SCV implements WorkerUnit {

	@Override
	public void move() {
		System.out.println("[SCV] Move!");
	}

	@Override
	public void gather() {
		System.out.println("[SCV] Gather!");
	}

	@Override
	public void repair() {
		System.out.println("[SCV] Repair!");
	}

}
