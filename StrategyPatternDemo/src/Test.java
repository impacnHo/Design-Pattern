import weapon.Arrow;
import weapon.Axe;
import weapon.Dagger;
import weapon.Sword;
import character.Character;
import character.King;
import character.Knight;
import character.Queen;
import character.Troll;

public class Test {
	// 测试
	public static void main(String[] args) {

		// 实例化角色
		Character king = new King();
		Character knight = new Knight();
		Character queen = new Queen();
		Character troll = new Troll();
		// 国王
		king.display();
		king.useWeapon();
		king.setWeapon(new Arrow());
		king.useWeapon();
		System.out.println();
		// 骑士
		knight.display();
		knight.useWeapon();
		knight.setWeapon(new Sword());
		knight.useWeapon();
		System.out.println();
		// 皇后
		queen.display();
		queen.useWeapon();
		queen.setWeapon(new Dagger());
		queen.useWeapon();
		System.out.println();
		// 妖怪
		troll.display();
		troll.useWeapon();
		troll.setWeapon(new Axe());
		troll.useWeapon();

	}
}
