package factory;

public class Phone implements Product {

	@Override
	public void getInfo() {
		System.out.println("Product type : Phone");
	}

}
