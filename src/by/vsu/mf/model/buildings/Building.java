package by.vsu.mf.model.buildings;

import by.vsu.mf.model.player.Player;

/**
 * Базовый предок для всех объектов-сооружений
 * 
 * @author Landarski Yauhen
 *
 */
public abstract class Building {
	protected Player owner;

	public Building(Player owner) {
		this.owner = owner;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

}
