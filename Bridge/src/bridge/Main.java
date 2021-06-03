package bridge;

public class Main {
	public static void main(String[] args) {
		
		Human human1 = new Adult(new SmartPhone());
		Human human2 = new Child(new BasicPhone());
		human1.callfriend();
		human2.callfriend();
		
		Adult adult = new Adult(new SmartPhone());
		Child child = new Child(new SmartPhone());
		adult.watchNetflix();
		child.watchYouTube();
		
	}
}