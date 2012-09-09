package by.vsu.mf.player;

/**
 * Объект для хранения ресурсов игрока
 * 
 * @author special
 * 
 */
public interface Resources {
	public int getGold();

	public int getHumans();
	
	public void setGold(int gold);
	
	public void setHumans(int humans);
}
