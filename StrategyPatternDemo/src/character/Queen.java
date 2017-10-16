package character;

import weapon.Arrow;

public class Queen extends Character {

	public Queen() {
		// 设置默认武器-弓箭
		weapon = new Arrow();
	}

	@Override
	public void display() {
		System.out.println("我是皇后");

	}
}
