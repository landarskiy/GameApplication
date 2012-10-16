package by.vsu.mf.model.managers;

import java.util.PriorityQueue;
import java.util.Stack;

import by.vsu.mf.model.serviceobjects.Task;

/**
 * Планировщик задач. Отвечает за выполнение долгосрочных задач в срок. 
 * TODO: реализовать как сингелтон
 * 
 * @author Landarski Yauhen
 * 
 */
public class TaskScheduler implements Runnable {

	private PriorityQueue<Task> tasks;	
	private Stack<Task> executableTasks;
	private boolean running;
	private long interval;

	public TaskScheduler() {
		this.tasks = new PriorityQueue<Task>();
		this.executableTasks = new Stack<Task>();
		this.running = true;
		this.interval = 100;
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public void removeTask(Task task) {
		tasks.remove(task);
	}

	private void executeFinishedTasks() {
		long currentTime = System.currentTimeMillis();
		while (!tasks.isEmpty()
				&& tasks.peek().getPerformanceTime() <= currentTime) {
			executableTasks.push(tasks.poll());
		}
		Task executeTask;
		while (!executableTasks.isEmpty()) {
			executeTask = executableTasks.pop();
			executeTask.execute();
			executeTask.getTaskCreator().notifyAboutPerformance(executeTask);
		}
	}

	public void run() {
		while (running) {
			try {
				Thread.sleep(interval);
				executeFinishedTasks();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public void terminate() {
		this.running = false;
	}
}
