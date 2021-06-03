package bridge;

public class Child extends Human{

	public Child(Phone phone) {
		super(phone);
	}

	@Override
	public void callfriend() {
		phone.text();
	}

	public void watchYouTube() {
		System.out.println("Start YouTube ... ");
		phone.runVideoPlayer();
	}
	
}
