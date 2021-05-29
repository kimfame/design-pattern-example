package factory;

public class Car implements Product {

	@Override
	public void getInfo() {
		System.out.println("Product type : Car");	
	}

}
