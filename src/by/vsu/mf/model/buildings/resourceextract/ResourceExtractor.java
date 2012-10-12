/**
 * 
 */
package by.vsu.mf.model.buildings.resourceextract;

/**
 * Извлекатель ресурсов. 
 * В зависимости от типа ресурса можно реализовывать разные
 * формулы добычи материалов, зависящих от количества 
 * трудящихся рабочих.
 * 
 * @author Landarski Yauhen
 *
 */
public interface ResourceExtractor {
	public int extract (int workerCount);
}
