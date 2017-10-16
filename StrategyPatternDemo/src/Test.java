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
	// ����
	public static void main(String[] args) {

		// ʵ������ɫ
		Character king = new King();
		Character knight = new Knight();
		Character queen = new Queen();
		Character troll = new Troll();
		// ����
		king.display();
		king.useWeapon();
		king.setWeapon(new Arrow());
		king.useWeapon();
		System.out.println();
		// ��ʿ
		knight.display();
		knight.useWeapon();
		knight.setWeapon(new Sword());
		knight.useWeapon();
		System.out.println();
		// �ʺ�
		queen.display();
		queen.useWeapon();
		queen.setWeapon(new Dagger());
		queen.useWeapon();
		System.out.println();
		// ����
		troll.display();
		troll.useWeapon();
		troll.setWeapon(new Axe());
		troll.useWeapon();

	}
}
