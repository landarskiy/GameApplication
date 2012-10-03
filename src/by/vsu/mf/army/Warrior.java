/**
 * 
 */
package by.vsu.mf.army;

import by.vsu.mf.player.ResourceStorage.Resource;

/**
 * @author Landarski Yauhen
 * 
 */
public class Warrior {
	private Resource weapon;
	private int health;
	private int protection;
	private int attack;

	public Warrior(Resource weapon, int health, int protection, int attack) {
		this.weapon = weapon;
		this.health = health;
		this.protection = protection;
		this.attack = attack;
	}

	public Resource getWeapon() {
		return weapon;
	}

	public void setWeapon(Resource weapon) {
		this.weapon = weapon;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getProtection() {
		return protection;
	}

	public void setProtection(int protection) {
		this.protection = protection;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	

}
