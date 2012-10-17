/**
 * 
 */
package by.vsu.mf.model.managers;

import java.util.LinkedList;

import by.vsu.mf.model.serviceobjects.Task;

/**
 * Исполнитель задач
 * 
 * @author Landarski Yauhen
 * 
 */
public class TaskPerformer implements Runnable {

	private LinkedList<Task> executableTasks;
	private boolean running;
	private long interval;	

	public TaskPerformer() {
		this.executableTasks = new LinkedList<Task>();
		this.running = true;
		this.interval = 100;		
	}

	public void addTask(Task task) {
		executableTasks.addLast(task);
	}
	
	public void run() {
		while (running) {
			try {
				Thread.sleep(interval);
				executeTasks();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	private void executeTasks() {
		Task executeTask;
		while (!executableTasks.isEmpty()) {
			executeTask = executableTasks.removeFirst();
			executeTask.execute();
			//executeTask.getTaskCreator().notifyAboutPerformance(executeTask);
		}
	}

	public void terminate() {
		this.running = false;
	}

}
