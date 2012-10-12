/**
 * 
 */
package by.vsu.mf.model.util;

import by.vsu.mf.model.buildings.resourceextract.ResourceExtractor;
import by.vsu.mf.model.player.ResourceStorage.Resource;

/**
 * @author Landarski Yauhen
 *
 */
public class ResourceExtractorCreator {
	public static ResourceExtractor build (Resource mineType) {
		switch (mineType) {
			case GOLD : return null;
			case HUMAN : return null;
		}
		return null;
	}
}
