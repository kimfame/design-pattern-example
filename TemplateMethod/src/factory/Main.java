package factory;

public class Main {

	public static void main(String[] args) {
		Factory factory1 = new CarFactory();
		Factory factory2 = new PhoneFactory();
		
		factory1.operateFactory();
		factory2.operateFactory();
	}

}
