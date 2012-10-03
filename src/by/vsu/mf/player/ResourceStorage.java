package by.vsu.mf.player;

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
	
	public final static int RESOURCE_COUNT = 2;

	private int resources[];

	public ResourceStorage() {
		this(new int[RESOURCE_COUNT]);
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
