package by.vsu.mf.managers;

import by.vsu.mf.serviceobjects.Task;

/**
 * Планировщик задач. Отвечает за выполнение задач в срок.
 * 
 * @author special
 * 
 */
public interface TaskScheduler extends Runnable {
	public void addTask(Task task);

	public void removeTask(Task task);
	
	public void executeFinishedTasks();
	
	public boolean isExistFinishedTask();
}
