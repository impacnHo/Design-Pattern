package character;

import weapon.Weapon;

public abstract class Character {

	protected Weapon weapon; // ��ɫ����������

	public Character() {
		// ��ɫ���޲ι��췽��
	}

	public abstract void display();// ��ɫ����ʾ��ݷ��������󷽷���Ҫ����д

	public void setWeapon(Weapon weapon) {
		// ��ɫ�ĸ�����������
		System.out.println("��ɫ�Ѹ�������...");
		this.weapon = weapon;
	}

	public void useWeapon() {
		// ��ɫ��ʹ����������
		weapon.doWeapon();
	}
}
