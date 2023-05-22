/* LinkedHashSet is a class presents in java.util package which extends (inherits) from 
HashSet class and implements from Set, Cloneable and Serializable interfaces.

Note: In general, we can use LinkedHashSet to develop cache based applications where
duplicates are not allowed and insertion order preserved. */

/* 
LinkedHashSet class which is implemented in the collections framework is an ordered 
version of HashSet that maintains a doubly-linked List across all elements. When the 
iteration order is needed to be maintained this class is used. When iterating through 
a HashSet the order is unpredictable, while a LinkedHashSet lets us iterate through the 
elements in the order in which they were inserted. Let’s see how to create a set object 
using this class.  
*/

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class _03_LinkedHashSet {
    public static void main(String[] args)
    {
        Set<String> lh = new LinkedHashSet<String>();

        lh.add("India");
        lh.add("Australia");
        lh.add("South Africa");
  
        lh.add("India");

        System.out.println(lh);
  
        lh.remove("Australia");
        System.out.println("Set after removing " + "Australia:" + lh);
  
        System.out.println("Iterating over set:");
        Iterator<String> i = lh.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
