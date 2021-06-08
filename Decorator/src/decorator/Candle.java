package decorator;

import cake.Cake;

public class Candle extends Decorator {

	Cake cake;
	
	public Candle(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public String getName() {
		return "Candle " + cake.getName();
	}

	@Override
	public int getPrice() {
		return cake.getPrice() + 300;
	}
	
	

}
