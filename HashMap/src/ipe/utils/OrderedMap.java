package ipe.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OrderedMap {
	/***
	 * Este método recibe un mapa a ordenar de forma descendente
	 * @param <T>
	 * @param unsortedMap
	 *            mapa a ordenar, se utilza Map para hacerlo genérico y no
	 *            depender del tipo de dato
	 * @return
	 */
	public static <K extends Comparable<K>, V extends Comparable<V>> LinkedHashMap<K, V> sortMapByValue(Map<K, V> unsortedMap, OrderMode orderMode) {
		Set<Entry<K, V>> entries = unsortedMap.entrySet();

		List<Entry<K, V>> listOfEntries = new ArrayList<Entry<K, V>>(entries);
		// sorting HashMap by values using comparator
		if (orderMode == OrderMode.ASCENDING)
			Collections.sort(listOfEntries, new EntryValueComparator());
		else
			Collections.sort(listOfEntries, new EntryValueDescendingComparator());
		
		LinkedHashMap<K, V> sortedByValue = new LinkedHashMap<K, V>(listOfEntries.size());
		// copying entries from List to Map
		for (Entry<K, V> entry : listOfEntries) {
			sortedByValue.put(entry.getKey(), entry.getValue());
		}
		
		return sortedByValue;
	}
}
