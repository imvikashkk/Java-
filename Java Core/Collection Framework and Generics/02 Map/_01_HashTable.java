/* The Hashtable class implements a hash table, which maps keys to values. Any non-null object can be 
used as a key or as a value. To successfully store and retrieve objects from a hashtable, the 
objects used as keys must implement the hashCode method and the equals method.  

The java.util.Hashtable class is a class in Java that provides a key-value data structure, similar
to the Map interface. It was part of the original Java Collections framework and was introduced in 
Java 1.0.

However, the Hashtable class has since been considered obsolete and its use is generally discouraged. 
This is because it was designed prior to the introduction of the Collections framework and does not 
implement the Map interface, which makes it difficult to use in conjunction with other parts of the 
framework. In addition, the Hashtable class is synchronized, which can result in slower performance 
compared to other implementations of the Map interface.

In general, it’s recommended to use the Map interface or one of its implementations (such as 
HashMap or ConcurrentHashMap) instead of the Hashtable class. */

/* public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, Serializable */

import java.util.Enumeration;
import java.util.Hashtable;

public class _01_HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
 
        // Adding elements to the hashtable
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
 
        // Getting values from the hashtable
        int valueA = hashtable.get("A");
        System.out.println("Value of A: " + valueA);
 
        // Removing elements from the hashtable
        hashtable.remove("B");
 
        // Enumerating the elements of the hashtable
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }
}

/* 
Features of Hashtable

    00. It is similar to HashMap, but is synchronized.
    00. Hashtable stores key/value pair in hash table.
    00. In Hashtable we specify an object that is used as a key, and the value we want to 
         associate to that key. The key is then hashed, and the resulting hash code is used 
         as the index at which the value is stored within the table.
    00. The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
    00. HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast 
        Enumeration 
*/


/* Hashtable(): 
      This creates an empty hashtable with the default load factor of 0.75 and an initial 
      capacity is 11. 

    Hashtable<K, V> ht = new Hashtable<K, V>();


Hashtable(int initialCapacity): 
      This creates a hash table that has an initial size specified by initialCapacity and the 
      default load factor is 0.75.

    Hashtable<K, V> ht = new Hashtable<K, V>(int initialCapacity)

Hashtable(int size, float fillRatio): 
      This version creates a hash table that has an initial size specified by size and fill ratio 
      specified by fillRatio. fill ratio: Basically, it determines how full a hash table can be 
      before it is resized upward and its Value lies between 0.0 to 1.0.

      Hashtable<K, V> ht = new Hashtable<K, V>(int size, float fillRatio);

Hashtable(Map<? extends K,? extends V> m): 
      This creates a hash table that is initialized with the elements in m.

      Hashtable<K, V> ht = new Hashtable<K, V>(Map m);
     */