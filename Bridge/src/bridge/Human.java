package bridge;

public abstract class Human {
	
	protected Phone phone; // bridge role

	public Human(Phone phone) {
		this.phone = phone;
	}
	
	public abstract void callfriend();
	
}