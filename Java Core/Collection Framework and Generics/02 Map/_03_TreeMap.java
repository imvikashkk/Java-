/* The TreeMap in Java is used to implement the Map interface and NavigableMap along with the 
Abstract Class. The map is sorted according to the natural ordering of its keys, or by a 
Comparator provided at map creation time, depending on which constructor is used. This 
proves to be an efficient way of sorting and storing the key-value pairs. The storing order 
maintained by the treemap must be consistent with equals just like any other sorted map, 
irrespective of the explicit comparators. Let’s see how to create a map object using this class. */



import java.util.*;
public class _03_TreeMap {
	public static void main(String[] args)
	{
		Map<String, Integer> map = new TreeMap<>();
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println(e.getKey() + " "
							+ e.getValue());
	}
}
