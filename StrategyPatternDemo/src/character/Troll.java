package character;

import weapon.Dagger;

public class Troll extends Character {

	public Troll() {
		// ����Ĭ������-ذ��
		weapon = new Dagger();
	}

	@Override
	public void display() {
		System.out.println("��������");

	}
}
