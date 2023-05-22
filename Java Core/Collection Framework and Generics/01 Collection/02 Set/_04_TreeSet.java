/* 

TreeSet class which is implemented in the collections framework and implementation of the 
SortedSet Interface and SortedSet extends Set Interface. It behaves like a simple set 
with the exception that it stores elements in a sorted format. TreeSet uses a tree data 
structure for storage. Objects are stored in sorted, ascending order. But we can iterate 
in descending order using the method TreeSet.descendingIterator(). Let’s see how to 
create a set object using this class.

            Extends         Extends            Impliments
    Set <~~~~~~ SortedSet <~~~~~~ NavigableSet <------- TreeSet





******************************* SORTEDSET INTERFACE **********************************

The SortedSet interface present in java.util package extends the Set interface present 
in the collection framework. It is an interface that implements the mathematical set. 
This interface contains the methods inherited from the Set interface and adds a feature 
that stores all the elements in this interface to be stored in a sorted manner. 

        // public interface SortedSet extends Set //

SortedSet interface defines the following specific methods.
(a)first() - 
            returns first element of the SortedSet

(b)last() - 
            returns last element of the SortedSet

(c)headSet(Object obj) – 
            returns SortedSet whose elements are < obj

(d)tailSet(Object obj) - 
            returns SortedSet whose elements are >= obj

(e)subSet(Object obj1, Object obj2) - 
            returns SortedSet whose elements are >= obj1 and < obj2

f)comparator() – 
            return Comparator object that describes underlying sorting technique like 
            ascending, descending etc. If we are using default natural sorting order, 
            then we will get null.

Ex: Consider a set as {100,101,104,106,110,115,120}
(a) first() – 100 (b) last – 120 (c) headSet(106) – {100,101,104} (d) tailSet(106) –
{106,110,115,120} (e) subSet(101,115) – {101,104,106,110} (f) comparator() – null


****************************** NAVIGABLESET INTERFACE *******************************  

NavigableSet is the child interface of SortedSet and it defines several
methods for navigation purposes.
       //  public interface NavigableSet<E>  extends SortedSet<E>  //
NavigableSet interface defines the following specific methods.

(a) floor(e) - 
                returns highest element which is <= e

(b) lower(e) - 
                returns highest element which is > e

(c) ceiling(e) - 
                returns lowest element which is >= e

(d) higher(e) - 
                returns lowest element which is > e

(e) pollFirst() –      
                remove and return first element

(f) pollLast() – 
                remove and return last element

(g) descendingSet() – 
                returns NavigableSet in reverse order

Ex: TreeSet<Integer> t = new TreeSet<Integer>();
t.add(100); t.add(200); t.add(300); t.add(400); t.add(500);
SOP(floor(300)); // 300 
SOP(lower(300)); // 200 
SOP(ceiling(200)); // 200
SOP(higher(200)); // 300 
SOP(pollFirst()); // 100 
SOP(pollLast()); // 500
SOP(descendingSet()); // [400, 300, 200] 
SOP(t); // [200, 300, 400]

    

*/


import java.util.Arrays;
import java.util.TreeSet;

public class _04_TreeSet {
    public static void main(String arg[]){
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.addAll(Arrays.asList(new Integer[] {54,32,75,14,65,24,98,75,48,12,35,46}));
        System.out.println(set);

        System.out.println();
        System.out.println(set.first());
        System.out.println(set.last());

        System.out.println();
        System.out.println(set.floor(50));
       
    }
}
