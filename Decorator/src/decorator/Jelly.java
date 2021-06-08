package decorator;

import cake.Cake;

public class Jelly extends Decorator {

	Cake cake;
	
	public Jelly(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public String getName() {
		return "Jelly " + cake.getName();
	}

	@Override
	public int getPrice() {
		return cake.getPrice() + 100;
	}

}
