package character;

import weapon.Arrow;

public class Queen extends Character {

	public Queen() {
		// ����Ĭ������-����
		weapon = new Arrow();
	}

	@Override
	public void display() {
		System.out.println("���ǻʺ�");

	}
}
