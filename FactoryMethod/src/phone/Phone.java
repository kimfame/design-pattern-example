package phone;

import factory.Product;

public class Phone implements Product {

	@Override
	public void getInfo() {
		System.out.println("Product type : Phone");
	}

}
