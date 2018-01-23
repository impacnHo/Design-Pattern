package character;

import weapon.Dagger;

public class Troll extends Character {

	public Troll() {
		// 设置默认武器-匕首
		weapon = new Dagger();
	}

	@Override
	public void display() {
		System.out.println("我是妖怪");

	}
}
