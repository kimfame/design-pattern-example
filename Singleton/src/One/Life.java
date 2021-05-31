package One;

public class Life {
	
	private static Life life;
	
	private Life() {}
	
	public static Life getLife() {
		if(life == null) {
			life = new Life();
		}
		
		return life;
	}
	
	public void print() {
		System.out.println("You live only once");
	}
	
}
