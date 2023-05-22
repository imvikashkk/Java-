/* 
Iterators in Java are used in the Collection framework to retrieve elements one by one. 
It is a universal iterator as we can apply it to any Collection object. By using Iterator, 
we can perform both read and remove operations. It is an improved version of Enumeration with 
the additional functionality of removing an element. 
*/

/* 
Iterator must be used whenever we want to enumerate elements in all Collection framework 
implemented interfaces like Set, List, Queue, Deque, and all implemented classes of Map 
interface. Iterator is the only cursor available for the entire collection framework.
Iterator object can be created by calling iterator() method present in Collection interface. 
*/

/*
 Iterator itr = c.iterator(); 
        Here c is any Collection object. itr is of type Iterator interface and refers to c.
 */



/* Methods
1. hasNext(): 
        Returns true if the iteration has more elements.
2. next(): 
        Returns the next element in the iteration. It throws NoSuchElementException if no more element is present.
3. remove(): 
        Removes the next element in the iteration. This method can be called only once per call to next(). 

*/

import java.util.ArrayList;
import java.util.Iterator;

public class _02_Iterator {

	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++)
			al.add(i);

		System.out.println(al);

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
	
			int i = itr.next();
			System.out.print(i + " ");

			if (i % 2 != 0)
				itr.remove();
		}

		System.out.println();
		System.out.println(al);
	}
}


/* Advantages of Java Iterator

   00. We can use it for any Collection class.
   00. It supports both READ and REMOVE operations.
   00. It is a Universal Cursor for Collection API.
   00. Method names are simple and easy to use them. 
   
*/


/* Limitations of Java Iterator

    00. In CRUD Operations, it does NOT support CREATE and UPDATE operations.
    00. It supports only Forward direction iteration that is a Uni-Directional Iterator.
    00. Compare to Spliterator, it does NOT support iterating elements parallel which means 
        it supports only Sequential iteration.
    00. Compare to Spliterator, it does NOT support better performance to iterate large volume of data. 
*/