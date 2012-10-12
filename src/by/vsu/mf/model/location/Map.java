package by.vsu.mf.model.location;

import java.util.LinkedList;
import java.util.List;

import by.vsu.mf.model.army.Army;
import by.vsu.mf.model.buildings.Building;
import by.vsu.mf.model.player.Player;

/**
 * Объект-часть карты
 * 
 * @author Landarski Yauhen
 * 
 */
public class Map {
	private Player owner;
	private List<Building> buildings;
	private List<Army> armys;

	public Map(Player owner) {
		this(owner, new LinkedList<Building>());
	}

	public Map(Player owner, List<Building> buildings) {
		this.owner = owner;
		this.buildings = buildings;
	}

	public Player getOwner() {
		return owner;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}		

}
