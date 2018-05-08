import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import ipe.utils.OrderMode;
import ipe.utils.OrderedMap;

public class Main {
	public static void main(String[] args) {
		HashMap<String, String> codenames = new HashMap<String, String>();
		
		codenames.put("JDK 1.1.4", "aasfdf");
		codenames.put("J2SE 1.2", "ddffef");
		codenames.put("J2SE 1.3", "bbasdf");
		codenames.put("Java SE 7", "ccafaf");
		codenames.put("J2SE 1.4", "fferqr");
		codenames.put("J2SE 5.0", "cccdaw");
		codenames.put("Java SE 6", "eeerqwr");
		
		System.out.println("HashMap antes del ordenamiento");
		Set<Entry<String, String>> entries = codenames.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}
		
		System.out.println("HashMap ordenado por keys");
		TreeMap<String, String> sorted = new TreeMap<>(codenames);
		Set<Entry<String, String>> mappings = sorted.entrySet();
		for (Entry<String, String> mapping : mappings) {
			System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
		}

		LinkedHashMap<String, String> sortedByValue = OrderedMap.sortMapByValue(codenames, OrderMode.DESCENDING);
		
		System.out.println("HashMap ordenado por values");
		Set<Entry<String, String>> entrySetSortedByValue = sortedByValue.entrySet();
		for (Entry<String, String> mapping : entrySetSortedByValue) {
			System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
		}
	}
}
