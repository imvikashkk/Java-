/* HashMap is a part of Java’s collection since Java 1.2. It provides the basic 
implementation of the Map interface of Java. It stores the data in (Key, Value) 
pairs. To access a value one must know its key. This class uses a technique called Hashing. 
Hashing is a technique of converting a large String to a small String that represents the same 
String. A shorter value helps in indexing and faster searches. Let’s see how to create a map object 
using this class. */



import java.util.*;
public class _01_HashMap {
	public static void main(String[] args)
	{
		Map<String, Integer> map = new HashMap<>();

		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println(e.getKey() + " "
							+ e.getValue());
	}
}



