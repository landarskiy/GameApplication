package by.vsu.mf.model.buildings;

import by.vsu.mf.model.player.Player;

/**
 * Базовый класс для строений, которые можно разрушить
 * @author Landarski Yauhen
 *
 */
public class DestroyedBuilding extends Building {
	private int currentHealth;
	private int totalHealth;
	private int protection;

	public DestroyedBuilding(Player owner) {
		this(owner, 0, 0);
	}

	
	public DestroyedBuilding(Player owner, int protection, int health) {
		this(owner, protection, health, health);
	}
	
	public DestroyedBuilding(Player owner, int protection, int currentHealth, int totalHealth) {
		super(owner);
		this.protection = protection;
		this.currentHealth = currentHealth;
		this.totalHealth = totalHealth;
	}

	/**
	 * Нанесение ущерба строению
	 * 
	 * @param attack
	 *            сила атаки
	 */
	public void causeDamage(int attack) {
		//TODO: реализовать
	}

	/**
	 * Ремонт строения. Восстанавливает все здоровье
	 */
	public void repair() {
		currentHealth = totalHealth;
	}

	public boolean isDestroy() {
		return currentHealth == 0;
	}
}
