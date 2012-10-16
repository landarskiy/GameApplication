/**
 * 
 */
package by.vsu.mf.model.buildings.resourceextract;

/**
 * @author Landarski Yauhen
 * 
 */
public class CustomResourceExtractor implements ResourceExtractor {
	/*
	 * Буфер накопленных ресурсов, если текущего числа рабочих недостаточно для
	 * извлечения 1 единицы материала или после извлечения остается некоторый
	 * процент
	 */
	private int buffer;
	/* К-во затраченых человекоединиц для добычи 1 единицы ресурсов */
	private int resourcePrice;

	/**
	 * @param resourcePrice
	 */
	public CustomResourceExtractor(int resourcePrice) {
		super();
		this.resourcePrice = resourcePrice;
	}

	public int extract(int workerCount) {
		buffer += workerCount;
		int extractingResource = buffer / resourcePrice;
		buffer -= extractingResource * resourcePrice;
		return extractingResource;
	}

}
