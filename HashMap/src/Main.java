import java.util.HashMap;
import java.util.Map;

import ipe.utils.OrderedMap;

public class Main {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 10);
		map.put("b", 30);
		map.put("c", 50);
		map.put("d", 40);
		map.put("e", 20);
		System.out.println("Desordenado: " + map);

		Map sortedMap = OrderedMap.sortMapByValue(map);
		System.out.println("Ordenado: " + sortedMap);
	}

}
