package character;

import weapon.Axe;

public class Knight extends Character {

	public Knight() {
		// ����Ĭ������-��ͷ
		weapon = new Axe();
	}

	@Override
	public void display() {
		System.out.println("������ʿ");

	}
}
