package ipe.utils;
import java.util.Comparator;
import java.util.Map.Entry;

// a comparator that compares Strings
public class EntryValueDescendingComparator<K extends Comparable<K>, V extends Comparable<V>> implements Comparator<Entry<K, V>> {
	@Override
	public int compare(Entry<K, V> e1, Entry<K, V> e2) {
		V v1 = e1.getValue();
		V v2 = e2.getValue();
		
		if (v2.compareTo(v1) < 0)
			return -1;
		else if (v2.compareTo(v1) > 0)
			return 1;
		else
			return 0;
	}
}
