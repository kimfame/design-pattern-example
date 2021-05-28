package war;

public class Commander {
	private WarStrategy warStrategy;
	
	void setWarStrategy(WarStrategy warStrategy) {
		this.warStrategy = warStrategy;
	}
	
	void sendAttackOrder() {
		if(warStrategy == null) {
			System.out.println("Attack strategy is empty!");
		} else {
			warStrategy.attack();
		}
	}
	
	void sendDefendOrder() {
		if(warStrategy == null) {
			System.out.println("Defense strategy is empty!");
		} else {
			warStrategy.defense();
		}
	}
}
