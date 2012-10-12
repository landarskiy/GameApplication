package by.vsu.mf.model.player;

/**
 * Объект для хранения ресурсов игрока
 * 
 * @author Landarski Yauhen
 * 
 */

public class ResourceStorage {
	public enum Resource {
		GOLD,
		HUMAN
	}	

	private int resources[];

	public ResourceStorage() {
		this(new int[Resource.values().length]);
	}

	public ResourceStorage(int[] resources) {
		this.resources = resources;
	}

	public int[] getResources() {
		return this.resources;
	}

	public int getResource(Resource resourceType) {
		return resources[resourceType.ordinal()];
	}

	public void setResource(Resource resourceType, int count) {
		resources[resourceType.ordinal()] = count;
	}
}
