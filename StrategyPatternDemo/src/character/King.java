package character;

import weapon.Sword;

public class King extends Character {

	public King() {
		// Ĭ����������-����
		weapon = new Sword();
	}

	@Override
	public void display() {
		System.out.println("���ǹ���");

	}

}
