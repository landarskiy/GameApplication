package by.vsu.mf.model.managers;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

import by.vsu.mf.model.serviceobjects.Task;

/**
 * Планировщик задач. Отвечает за выполнение долгосрочных задач в срок. 
 * 
 * @author Landarski Yauhen
 * 
 */
public class TaskScheduler implements Runnable {

	private static volatile TaskScheduler instance;
	
	private PriorityQueue<Task> tasks;	
	private TaskPerformer taskPerformer;
	private boolean running;
	private long interval;

	private TaskScheduler() {
		this.tasks = new PriorityQueue<Task>();
		this.running = true;
		this.interval = 100;
		runTaskPerfomer();
	}

	/**
	 * Запуск исполнителя задач
	 */
	private void runTaskPerfomer() {
		taskPerformer = new TaskPerformer();
		Thread th = new Thread(taskPerformer);
		th.start();
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
			taskPerformer.addTask(tasks.poll());
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
		taskPerformer.terminate();
		this.running = false;
	}
	
	public static TaskScheduler getInstance() {
		if(instance == null) {
			synchronized (TaskScheduler.class) {
				if(instance == null) {
					instance = new TaskScheduler();
				}
			}			
		}
		return instance;
	}	
}
