package by.vsu.mf.managers;

import java.util.PriorityQueue;
import java.util.Stack;

import by.vsu.mf.serviceobjects.Task;

/**
 * Планировщик задач. Отвечает за выполнение задач в срок.
 * TODO: реализовать как сингелтон
 * 
 * @author Landarski Yauhen
 * 
 */
public class TaskScheduler implements Runnable {
	
	private PriorityQueue<Task> tasks;
	private boolean isRunned;
	private Stack<Task> executableTasks;
	
	public TaskScheduler() {
		this.tasks = new PriorityQueue<Task>();
		this.executableTasks = new Stack<Task>();
		this.isRunned = true;
	}
	
	public void addTask(Task task) {
		tasks.add(task);
	}

	public void removeTask(Task task) {
		tasks.remove(task);
	}
	
	private void executeFinishedTasks() {
		long currentTime = System.currentTimeMillis();
		while(!tasks.isEmpty() && tasks.peek().getPerformanceTime()<=currentTime) {
			executableTasks.push(tasks.poll());
		}
		Task executeTask;
		while(!executableTasks.isEmpty()) {
			executeTask = executableTasks.pop();
			executeTask.execute();
			executeTask.getTaskCreator().notifyAboutPerformance();
		}
	}		

	public void run() {
		while(isRunned) {
			//Thread.sleep(100);
			executeFinishedTasks();
		}		
	}
	
	public void terminate() {
		this.isRunned = false;
	}
}
