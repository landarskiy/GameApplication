package by.vsu.mf.model.buildings;

import by.vsu.mf.model.player.Player;

/**
 * Базовый предок для всех атакующих сооружений
 * 
 * @author Landarski Yauhen
 *
 */
public class AttackBuilding extends Building {

	private int strength;

	public AttackBuilding(Player owner) {
		super(owner);
	}

	public AttackBuilding(Player owner, int strength) {
		this(owner);
		this.strength = strength;
	}

	public int getAttackStrength() {
		return strength;
	}
}
