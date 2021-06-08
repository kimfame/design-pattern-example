package main;

import cake.Cake;
import cake.ChocolateCake;
import cake.Strawberry;
import decorator.Candle;
import decorator.Jelly;
import decorator.Syrup;

public class Main {

	public static void main(String[] args) {
		Cake cake1 = new ChocolateCake();
		System.out.println(cake1);
		
		cake1 = new Jelly(cake1);
		System.out.println(cake1);
		
		cake1 = new Syrup(cake1);
		System.out.println(cake1);
		
		cake1 = new Candle(cake1);
		System.out.println(cake1);
		
		System.out.println("");
		
		Cake cake2 = new Strawberry();
		
		cake2 = new Jelly(cake2);
		System.out.println(cake2);
		
		cake2 = new Candle(cake2);
		System.out.println(cake2);
		
	}

}
