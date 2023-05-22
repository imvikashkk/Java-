/* 
HashSet is a class presents in java.util package which extends(inherits) from
AbstractSet class and implements from Set, Cloneable and Serializable interfaces.

i) Properties:
00. The underlying DS is Hash table.
00. Duplicate objects are not allowed, Insertion order is not preserved and it is based on
    hash code of objects.
00. Heterogeneous elements are allowed and null insertion is possible (only once).
00. If our frequent operation is search, then HashSet is the best choice.

Note: In HashSet duplicates are not allowed if we are trying to insert duplicates then we
won’t get any compile time or run time errors and add() method simply returns false. */

/* 
HashSet h = new HashSet();
SOP(h.add("A")); // true
SOP(h.add("A")); // false 
*/

/* public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable */

/* 
(a) HashSet h = new HashSet(); 
            Creates an empty HashSet object with default initial capacity 16 and default fill 
            ratio 0.75.

(b) HashSet h = new HashSet(int initial_capacity); 
            Creates an empty HashSet object with specified initial capacity and default fill 
            ratio 0.75

(c) HashSet h = new HashSet (int initial_capacity, float fill_ratio);
            Fill Ratio (or) Load Factor: After filling how much ratio a new HashSet object will 
            be created, this ratio is called Fill Ratio. For example fill ratio 0.75 means after 
            filling 75% ratio a new HashSet object will be created automatically.

(d) HashSet h = new HashSet(Collection c);
            Creates an equivalent HashSet object for the given Collection. This constructor
            meant for inter conversion between collection objects.
 */




/* OPERATIONS IN SET */ 
/* Let set1 = [1, 3, 2, 4, 8, 9, 0] and set2 = [1, 3, 7, 5, 4, 0, 7, 5].

1. Intersection: This operation returns all the common elements from the given two sets. For the above two sets, 
                 the intersection would be: Intersection = [0, 1, 3, 4] 

2. Union: This operation adds all the elements in one set with the other. For the above two sets, the union would be: 
                 Union = [0, 1, 2, 3, 4, 5, 7, 8, 9] 

3. Difference: This operation removes all the values present in one set from the other set. For the above two sets, 
                 the difference would be: Difference = [2, 8, 9]
*/

import java.util.*;
public class _01_HashSet{

    public static void _hashset(){
        Set<String> h = new HashSet<String>();
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");
        System.out.println(h);
  
        h.remove("Australia");
        System.out.println("Set after removing " + "Australia:" + h);
  
        System.out.println("Iterating over set:");
        Iterator<String> i = h.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }

    }



    public static void operations(){

        HashSet<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));

        HashSet<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));


        System.out.println("Set A : "+ a);
        System.out.println("Set B : "+ b);

        // To find union
        HashSet<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("\nUnion: ");
        System.out.println(union);
  
        // To find intersection
        HashSet<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection: ");
        System.out.println(intersection);
  
        // To find the symmetric difference
        HashSet<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference: ");
        System.out.println(difference);

    }

    public static void main(String arg[]){
        _hashset();

        System.out.println("\n\n\n");

        operations();
    }
}

