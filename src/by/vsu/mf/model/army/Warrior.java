/**
 * 
 */
package by.vsu.mf.model.army;

import by.vsu.mf.model.player.ResourceStorage.Resource;

/**
 * @author Landarski Yauhen
 * 
 */
public class Warrior {
	public enum Weapon {
		SWORD(10, 0), 
		SWORD_BOARD(10, 3);

		private final int attack;
		private final int protection;

		private Weapon(int attack, int protection) {
			this.attack = attack;
			this.protection = protection;
		}

		public int getAttack() {
			return attack;
		}

		public int getProtection() {
			return protection;
		}
	}

	private Weapon weapon;
	private int health;

	public Warrior(Weapon weapon, int health, int protection, int attack) {
		this.weapon = weapon;
		this.health = health;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getProtection() {
		return weapon.getProtection();
	}

	public int getAttack() {
		return weapon.getAttack();
	}	

}
