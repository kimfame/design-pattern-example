package war;

public class SkyWarStrategy implements WarStrategy {

	@Override
	public void attack() {
		System.out.println("[Sky] Go! Go! Jet fighter!");
	}

	@Override
	public void defense() {
		System.out.println("[Sky] Hide in the cloud!");
	}

}
