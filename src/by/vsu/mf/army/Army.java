/**
 * 
 */
package by.vsu.mf.army;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Landarski Yauhen
 *
 */
public class Army {
	private Map<Warrior, Integer> warriors;
	
	public Army() {
		this.warriors = new HashMap<Warrior, Integer>();
	}
}
