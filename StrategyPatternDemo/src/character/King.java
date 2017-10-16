package character;

import weapon.Sword;

public class King extends Character {

	public King() {
		// 默认设置武器-宝剑
		weapon = new Sword();
	}

	@Override
	public void display() {
		System.out.println("我是国王");

	}

}
