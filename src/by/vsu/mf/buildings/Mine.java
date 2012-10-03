package by.vsu.mf.buildings;

import by.vsu.mf.buildings.resourceextract.ResourceExtractor;
import by.vsu.mf.buildings.resourceextract.ResourceExtractorBuilder;
import by.vsu.mf.player.Player;
import by.vsu.mf.player.ResourceStorage.Resource;

/**
 * Объект-шахта добычи материалов
 * 
 * @author Landarski Yauhen
 * 
 */
public class Mine extends NotDestriyedBuilding{

	private Resource mineType;

	private int currentResourceCount;
	
	private int workerCount;
	
	private ResourceExtractor extractor;

	public Mine (Player owner) {
		super(owner);
	}
	
	public Mine (Player owner, Resource mineType, int resourceCount) {
		this(owner);
		this.mineType = mineType;
		this.currentResourceCount = resourceCount;
		this.workerCount = 0;
		this.extractor = ResourceExtractorBuilder.build(mineType);
	}	

	public int extractResource() {
		int ammount = extractor.extract(workerCount);
		if (currentResourceCount < ammount) {
			ammount = currentResourceCount;
			currentResourceCount = 0;
		} else {
			currentResourceCount -= ammount;
		}
		return ammount;
	}

	public boolean isEmpty() {
		return currentResourceCount == 0;
	}

	public Resource getMineType() {
		return mineType;
	}

	public void setMineType(Resource mineType) {
		this.mineType = mineType;
	}

	public int getCurrentResourceCount() {
		return currentResourceCount;
	}

	public void setCurrentResourceCount(int currentResourceCount) {
		this.currentResourceCount = currentResourceCount;
	}

	public int getWorkerCount() {
		return workerCount;
	}

	public void setWorkerCount(int workerCount) {
		this.workerCount = workerCount;
	}		
		
}
