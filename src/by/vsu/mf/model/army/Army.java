/**
 * 
 */
package by.vsu.mf.model.army;

import java.util.HashMap;
import java.util.Map;

import by.vsu.mf.model.player.Player;

/**
 * @author Landarski Yauhen
 *
 */
public class Army {
	private Map<Warrior, Integer> warriors;
	private Player owner;
	
	public Army(Player owner) {
		this.owner = owner;
		this.warriors = new HashMap<Warrior, Integer>();
	}
}
