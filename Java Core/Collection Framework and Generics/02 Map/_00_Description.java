/* In Java, Map Interface is present in java.util package represents a mapping between a key 
and a value. Java Map interface is not a subtype of the Collection interface. Therefore 
it behaves a bit differently from the rest of the collection types. A map contains unique 
keys. */

/* Characteristics of a Map Interface
   00. A Map cannot contain duplicate keys and each key can map to at most one value. 
    Some implementations allow null key and null values like the HashMap and LinkedHashMap,
    but some do not like the TreeMap.

   00.  The order of a map depends on the specific implementations. For example, TreeMap 
     and LinkedHashMap have predictable orders, while HashMap does not.
    
   00. There are two interfaces for implementing Map in Java. They are Map and SortedMap, 
     and three classes: HashMap, TreeMap, and LinkedHashMap. */

     
/*  00. clear()	
            This method is used in Java Map Interface to clear and remove all of the 
            elements or mappings from a specified Map collection.

    00. containsKey(Object)	This method is used in Map Interface in Java to check whether 
            a particular key is being mapped into the Map or not. It takes the key element 
            as a parameter and returns True if that element is mapped in the map.

    00. containsValue(Object)	
            This method is used in Map Interface to check whether a particular value is 
            being mapped by a single or more than one key in the Map. It takes the value 
            as a parameter and returns True if that value is mapped by any of the keys in 
            the map.

    00. entrySet()	
            This method is used in Map Interface in Java to create a set out of the same 
            elements contained in the map. It basically returns a set view of the map or 
            we can create a new set and store the map elements into them.

    00.  equals(Object)	
            This method is used in Java Map Interface to check for equality between two 
            maps. It verifies whether the elements of one map passed as a parameter is 
            equal to the elements of this map or not.

    00.  get(Object)	
            This method is used to retrieve or fetch the value mapped by a particular 
            key mentioned in the parameter. It returns NULL when the map contains no 
            such mapping for the key.

    00.  hashCode()	
            This method is used in Map Interface to generate a hashCode for the given 
            map containing keys and values.

    00.  isEmpty()	
            This method is used to check if a map is having any entry for key and value 
            pairs. If no mapping exists, then this returns true.

    00.  keySet()	
            This method is used in Map Interface to return a Set view of the keys 
            contained in this map. The set is backed by the map, so changes to the 
            map are reflected in the set, and vice-versa.

    00.  put(Object, Object)	
            This method is used in Java Map Interface to associate the specified 
            value with the specified key in this map.

    00.  putAll(Map)	
            This method is used in Map Interface in Java to copy all of the mappings 
            from the specified map to this map.

    00.  remove(Object)	
            This method is used in Map Interface to remove the mapping for a key from 
            this map if it is present in the map.

    00.  size()	
            This method is used to return the number of key/value pairs available in 
            the map.

    00.  values()	
            This method is used in Java Map Interface to create a collection out of 
            the values of the map. It basically returns a Collection view of the 
            values in the HashMap.

    00.  getOrDefault(Object key, V defaultValue)	
            Returns the value to which the specified key is mapped, or defaultValue 
            if this map contains no mapping for the key.

    00.  merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)	
            If the specified key is not already associated with a value or is associated with 
            null, associate it with the given non-null value.

    00. putIfAbsent(K key, V value) 
            If the specified key is not already associated with a value (or is mapped to null) 
            associates it with the given value and returns null, else returns the current 
            associate value.
            
    */



/* 
Entry(I): Entry is the sub interface of Map. We will be accessed it by Map.Entry name. A Map
is a group of key value pairs and each key value pair is called an entry. Hence, Map is considered
as a collection of entry objects. Without existing Map object, there is no chance of existing entry
object.

Methods:
(a) Object getKey() – used to obtain key
(a) Object getValue() - used to obtain value
(a) Object setValue(Object o) - used to replace the old value with new value 
*/