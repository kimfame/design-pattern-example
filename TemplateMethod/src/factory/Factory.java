package factory;

public abstract class Factory {
	public abstract boolean makeParts();
	public abstract boolean assembleParts();
	public abstract boolean testProduct();
	
	public void operateFactory() {
		System.out.println("Start factory operation...");
		
		if(makeParts()) {
			if(assembleParts()) {
				if(testProduct()) {
					
				} else {
					System.out.println("[Job 3] Fail testing this product.");
				}
			} else {
				System.out.println("[Job 2] Fail assembling parts.");
			}
		} else {
			System.out.println("[Job 1] Fail making parts.");
		}
		
		System.out.println("End factory operation.");
	}
}
