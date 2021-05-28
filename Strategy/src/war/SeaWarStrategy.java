package war;

public class SeaWarStrategy implements WarStrategy {

	@Override
	public void attack() {
		System.out.println("[Sea] Shark Attack!");
	}

	@Override
	public void defense() {
		System.out.println("[Sea] Hide in a turtle shell!");
	}

}
