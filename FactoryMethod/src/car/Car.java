package car;

import factory.Product;

public class Car implements Product {

	@Override
	public void getInfo() {
		System.out.println("Product type : Car");	
	}

}
