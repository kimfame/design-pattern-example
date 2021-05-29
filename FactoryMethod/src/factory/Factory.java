package factory;

public abstract class Factory {
	
	public abstract Product init();
	public abstract void makeParts();
	public abstract void assembleParts();
	public abstract void testProduct();
	
	public Product operateFactory() {
		System.out.println("Start factory operation...");
		
		Product product = init();
		
		makeParts();
		assembleParts();
		testProduct();
		
		System.out.println("End factory operation.");
		
		return product;
	}
}
