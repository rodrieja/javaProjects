package ipe.utils;
import java.util.Comparator;
import java.util.Map;

// a comparator that compares Strings
public class HashMapValueComparator implements Comparator {
	Map map;
 
	public HashMapValueComparator(Map map) {
		this.map = map;
	}
 
	public int compare(Object keyA, Object keyB) {
		Comparable valueA = (Comparable) map.get(keyA);
		Comparable valueB = (Comparable) map.get(keyB);
		return valueB.compareTo(valueA);
	}
}
