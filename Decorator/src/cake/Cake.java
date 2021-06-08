package cake;

public abstract class Cake {
	String name = "";
	
	public String getName() {
		return name;
	}
	
	public abstract int getPrice();
	
	@Override
	public String toString() {
		return "Cake Name : " + getName() + ", Price : " + getPrice();
		
	}
}
