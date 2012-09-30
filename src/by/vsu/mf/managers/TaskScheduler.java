package by.vsu.mf.managers;

import by.vsu.mf.serviceobjects.Task;

/**
 * Планировщик задач. Отвечает за выполнение задач в срок.
 * TODO: реализовать как сингелтон
 * 
 * @author Landarski Yauhen
 * 
 */
public interface TaskScheduler extends Runnable {
	public void addTask(Task task);

	public void removeTask(Task task);
	
	public void executeFinishedTasks();
	
	public boolean isExistFinishedTask();
}
