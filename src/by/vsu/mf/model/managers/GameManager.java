package by.vsu.mf.model.managers;

import by.vsu.mf.MainActivity;
import by.vsu.mf.model.player.ResourceStorage;
import by.vsu.mf.model.player.ResourceStorage.Resource;
import by.vsu.mf.model.serviceobjects.Task;
import by.vsu.mf.model.util.TaskCreator;
import android.widget.TextView;


/**
 * Основной класс, отвечающий за бизнес логику игры.
 * TODO: реализовать создание сервисов, работающих в других потоках в этом классе
 * 
 * @author Landarski Yauhen
 *
 */
//TODO: почистить класс. он полон тестового дерьма
public class GameManager implements Runnable{

	private boolean isRunnung;
	
	private MainActivity activity;
	
	public GameManager(MainActivity activity) {
		this.activity = activity;
		this.isRunnung = true;
		runServiceObjects();
	}
	
	private void runServiceObjects() {
		TaskScheduler sheduler = TaskScheduler.getInstance();
		Thread th = new Thread(sheduler);
		th.start();
	}
	
	private class TextTask extends Task {
		private MainActivity activity;
		public TextTask(long performanceTime, TaskCreator taskCreator) {
			super(performanceTime, taskCreator);
			// TODO Auto-generated constructor stub
		}
		public void setActivity(MainActivity activity) {
			this.activity = activity;
		}
		@Override
		public void execute() {
			activity.setText(Long.toString(System.currentTimeMillis()));			
		}
		
	}
	//TODO: почистить метод. Текущая реализация для тестирования работы
	public void run() {
		try {
			int iteration = 0;
			ResourceStorage storage = new ResourceStorage();
									
			TextTask tt = new TextTask(System.currentTimeMillis() + 10000, null);
			tt.setActivity(activity);
			
			TaskScheduler.getInstance().addTask(tt);						
			
			while(isRunnung) {				
				Thread.sleep(100);
				storage.setResource(Resource.GOLD, iteration);
				storage.setResource(Resource.HUMAN, iteration/2);
				String txt = Integer.toString(storage.getResource(Resource.GOLD));
				txt += ":" + Integer.toString(storage.getResource(Resource.HUMAN));
				//activity.setText(txt);
				if(iteration == Integer.MAX_VALUE) {
					iteration = 0;
				}
				iteration++;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void terminate() {
		isRunnung = false;
	}

}
