package war;

public class CityWarStrategy implements WarStrategy {

	@Override
	public void attack() {
		System.out.println("[City] Snipers on the roof");
	}

	@Override
	public void defense() {
		System.out.println("[City] Let's go inside the building!");
	}

}
