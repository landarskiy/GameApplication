/**
 * 
 */
package by.vsu.mf.model.managers;

import java.util.HashSet;
import java.util.Set;

import by.vsu.mf.model.buildings.Mine;

/**
 * 
 * Менеджер ресурсов. Отвечает за своевременное извлечение ресурсов из шахт
 * 
 * @author Landarski Yauhen
 * 
 */
public class ResourceManager implements Runnable {

	private Set<Mine> mines;

	public ResourceManager() {
		this.mines = new HashSet<Mine>();
	}

	public void run() {
		for(Mine mine : mines) {
			mine.extractResource();
		}

	}

}
