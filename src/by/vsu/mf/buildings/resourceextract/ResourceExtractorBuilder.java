/**
 * 
 */
package by.vsu.mf.buildings.resourceextract;

import by.vsu.mf.player.ResourceStorage.Resource;

/**
 * @author Landarski Yauhen
 *
 */
public class ResourceExtractorBuilder {
	public static ResourceExtractor build (Resource mineType) {
		switch (mineType) {
			case GOLD : return null;
			case HUMAN : return null;
		}
		return null;
	}
}
