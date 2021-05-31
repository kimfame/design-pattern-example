package starcraft;

public class Marine implements CombatUnit {

	@Override
	public void move() {
		System.out.println("[Marine] Move!");
	}

	@Override
	public void shoot() {
		System.out.println("[Marine] Shoot!");
	}

}
