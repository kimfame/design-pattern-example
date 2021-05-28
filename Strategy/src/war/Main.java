package war;

public class Main {

	public static void main(String[] args) {
		Commander commander = new Commander();
		WarStrategy warStrategy1 = new CityWarStrategy();
		WarStrategy warStrategy2 = new SeaWarStrategy();
		WarStrategy warStrategy3 = new SkyWarStrategy();
		
		commander.setWarStrategy(warStrategy1);
		commander.sendAttackOrder();
		commander.sendDefendOrder();
		
		commander.setWarStrategy(warStrategy2);
		commander.sendAttackOrder();
		commander.sendDefendOrder();
		
		commander.setWarStrategy(warStrategy3);
		commander.sendAttackOrder();
		commander.sendDefendOrder();
	}

}
