package by.vsu.mf.model.util;

import by.vsu.mf.model.serviceobjects.Task;

/**
 * Интерфейс создателя задачи
 * 
 * @author Landarski Yauhen
 * 
 */
public interface TaskCreator {
	public void notifyAboutPerformance(Task task);
}
