package factory;

public class Main {

	public static void main(String[] args) {
		Factory factory1 = new CarFactory();
		Factory factory2 = new PhoneFactory();
		
		Product product1 = factory1.operateFactory();
		Product product2 = factory2.operateFactory();
		
		product1.getInfo();
		product2.getInfo();
		
	}

}
