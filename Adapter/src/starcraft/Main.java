package starcraft;

public class Main {

	public static void main(String[] args) {
		Adapter combatUnitAdapter = new Adapter(new SCV());
		combatUnitAdapter.move();
		combatUnitAdapter.shoot();
	}
}
