package factory;

public abstract class Factory {
	public abstract void makeParts();
	public abstract void assembleParts();
	public abstract void testProduct();
	
	public void operateFactory() {
		System.out.println("Start factory operation...");
		
		makeParts();
		assembleParts();
		testProduct();
				
		System.out.println("End factory operation.");
	}
}
