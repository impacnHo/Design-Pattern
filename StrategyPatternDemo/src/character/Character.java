package character;

import weapon.Weapon;

public abstract class Character {

	protected Weapon weapon; // 角色的武器属性

	public Character() {
		// 角色的无参构造方法
	}

	public abstract void display();// 角色的显示身份方法，抽象方法需要被重写

	public void setWeapon(Weapon weapon) {
		// 角色的更换武器方法
		System.out.println("角色已更换武器...");
		this.weapon = weapon;
	}

	public void useWeapon() {
		// 角色的使用武器方法
		weapon.doWeapon();
	}
}
