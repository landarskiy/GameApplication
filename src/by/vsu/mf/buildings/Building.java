package by.vsu.mf.buildings;

/**
 * Базовый предок для всех объектов-сооружений
 * 
 * @author special
 * 
 */
public interface Building {

	public int getCurrentHealth();

	public void setCurrentHealth(int health);

	public int getTotalHealth();

	public int getProtection();

	/**
	 * Нанесение ущерба строению
	 * 
	 * @param attack
	 *            сила атаки
	 */
	public void causeDamage(int attack);

	/**
	 * Ремонт строения. Восстанавливает все здоровье
	 */
	public void repair();

	public boolean isDestroy();
}
