package bridge;

public class BasicPhone extends Phone{

	@Override
	public void call() {
		System.out.println("[BasicPhone] Call function");
	}

	@Override
	public void text() {
		System.out.println("[BasicPhone] Text function");
	}
	
	@Override
	public void receive() {
		System.out.println("[BasicPhone] Receive function");
	}

	@Override
	public void runVideoPlayer() {
		System.out.println("[BasicPhone] RunVideoPlayer function");
	}

}
