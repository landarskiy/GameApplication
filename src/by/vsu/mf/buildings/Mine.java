package by.vsu.mf.buildings;

/**
 * Объект-шахта добычи материалов
 * 
 * @author special
 * 
 */
public interface Mine {	

	public int getCurrentResourceCount();

	public int getMineType();

	public int getResource(int ammount);	

	public boolean isEmpty();
}
