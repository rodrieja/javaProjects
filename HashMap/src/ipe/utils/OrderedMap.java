package ipe.utils;

import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {
	public static Map sortMapByValue(Map unsortedMap) {
		Map sortedMap = new TreeMap(new HashMapValueComparator(unsortedMap));
		sortedMap.putAll(unsortedMap);
		return sortedMap;
	}
}
