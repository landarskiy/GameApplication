package by.vsu.mf.managers;

import by.vsu.mf.MainActivity;
import by.vsu.mf.player.ResourceStorage;
import by.vsu.mf.player.ResourceStorage.Resource;
import android.widget.TextView;


/**
 * Основной класс, отвечающий за бизнес логику игры.
 * 
 * @author Landarski Yauhen
 *
 */
public class GameManager implements Runnable{

	private boolean isRunnung;
	
	private MainActivity activity;
	
	public GameManager(MainActivity activity) {
		this.activity = activity;
		this.isRunnung = true;
	}
	
	//TODO: почистить метод. Текущая реализация для тестирования работы
	public void run() {
		try {
			int iteration = 0;
			ResourceStorage storage = new ResourceStorage();
			Thread.sleep(1000);
			while(isRunnung) {				
				Thread.sleep(1000);
				storage.setResource(Resource.GOLD, iteration);
				storage.setResource(Resource.HUMAN, iteration/2);
				String txt = Integer.toString(storage.getResource(Resource.GOLD));
				txt += ":" + Integer.toString(storage.getResource(Resource.HUMAN));
				activity.setText(txt);
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
