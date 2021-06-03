package bridge;

public class SmartPhone extends Phone {

	@Override
	public void call() {
		System.out.println("[SmartPhone] Call function");
	}

	@Override
	public void text() {
		System.out.println("[SmartPhone] Text function");
	}
	
	@Override
	public void receive() {
		System.out.println("[SmartPhone] Receive function");
	}
	
	@Override
	public void runVideoPlayer() {
		System.out.println("[SmartPhone] RunVideoPlayer function");
	}
	



}
