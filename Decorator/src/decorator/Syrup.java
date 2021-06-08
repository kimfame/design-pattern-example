package decorator;

import cake.Cake;

public class Syrup extends Decorator {

	Cake cake;
	
	public Syrup(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public String getName() {
		return "Syrup " + cake.getName();
	}

	@Override
	public int getPrice() {
		return cake.getPrice() + 200;
	}

	
}
