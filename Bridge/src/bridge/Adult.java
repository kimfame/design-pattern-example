package bridge;

public class Adult extends Human {

	public Adult(Phone phone) {
		super(phone);
	}
	
	@Override
	public void callfriend() {
		phone.call();
	}
	
	public void watchNetflix() {
		System.out.println("Start Netflix ... ");
		phone.runVideoPlayer();
	}


}
