package by.vsu.mf.serviceobjects;

/**
 * Объект-задача
 * 
 * @author special
 * 
 */
public interface Task extends Comparable<Task> {

	public void execute();
	
	public TaskCreator getTaskCreator();
}
