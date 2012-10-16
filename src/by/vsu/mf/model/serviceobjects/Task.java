package by.vsu.mf.model.serviceobjects;

import by.vsu.mf.model.util.TaskCreator;

/**
 * Объект-задача
 * 
 * @author Landarski Yauhen
 * 
 */
public abstract class Task implements Comparable<Task> {

	private long performanceTime;
	
	private long creationTime;
	
	private TaskCreator taskCreator;
	
	public Task (long performanceTime, TaskCreator taskCreator) {
		this.performanceTime = performanceTime;
		this.taskCreator = taskCreator;
		this.creationTime = System.currentTimeMillis();
	}
	
	public abstract void execute();

	public int compareTo(Task another) {
		if(this.performanceTime > another.performanceTime) {
			return 1;
		}
		if(this.performanceTime > another.performanceTime) {
			return -1;
		}
		return 0;
	}
	
	public long getPerformanceTime() {
		return performanceTime;
	}

	public void setPerformanceTime(long performanceTime) {
		this.performanceTime = performanceTime;
	}

	public TaskCreator getTaskCreator() {
		return taskCreator;
	}

	public void setTaskCreator(TaskCreator taskCreator) {
		this.taskCreator = taskCreator;
	}

	public long getCreationTime() {
		return creationTime;
	}

}
