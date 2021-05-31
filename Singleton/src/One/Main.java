package One;

public class Main {

	public static void main(String[] args) {
		//Life life = new Life();
		Life life1 = Life.getLife();
		Life life2 = Life.getLife();
		
		if(life1 == life2) {
			System.out.println("Same instance");
		} else {
			System.out.println("Not same");
		}
	}

}
