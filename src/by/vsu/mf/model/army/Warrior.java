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
	public enum WarriorType {
		FIRST_TYPE, 
		SECOND_TYPE
	}

	private WarriorType warriorType;
	private int health;
	private int protection;
	private int attack;

	public Warrior(WarriorType warriorType, int health, int protection, int attack) {
		this.warriorType = warriorType;
		this.health = health;
	}	

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public WarriorType getWarriorType() {
		return warriorType;
	}

	public void setWarriorType(WarriorType warriorType) {
		this.warriorType = warriorType;
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
