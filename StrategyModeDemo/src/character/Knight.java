package character;

import weapon.Axe;

public class Knight extends Character {

	public Knight() {
		// 设置默认武器-斧头
		weapon = new Axe();
	}

	@Override
	public void display() {
		System.out.println("我是骑士");

	}
}
