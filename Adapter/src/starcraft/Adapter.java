package starcraft;

public class Adapter implements CombatUnit {

	private WorkerUnit worker;
	
	public Adapter(WorkerUnit worker) {
		this.worker = worker;
	}
	
	@Override
	public void move() {
		worker.move();
	}

	@Override
	public void shoot() {
		System.out.println("[WorkerUnit] We can't shoot!");
	}

}
