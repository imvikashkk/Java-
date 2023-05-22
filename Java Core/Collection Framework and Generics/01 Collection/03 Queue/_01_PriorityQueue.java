/* PriorityQueue class which is implemented in the collection framework provides us a way 
to process the objects based on the priority. It is known that a queue follows the 
First-In-First-Out algorithm, but sometimes the elements of the queue are needed to 
be processed according to the priority, that’s when the PriorityQueue comes into play. 
Let’s see how to create a queue object using this class. */

/* 
The PriorityQueue is based on the priority heap. The elements of the priority queue are 
ordered according to the natural ordering, or by a Comparator provided at queue 
construction time, depending on which constructor is used. */


/* 
1. PriorityQueue(): 
        Creates a PriorityQueue with the default initial capacity (11) that orders 
        its elements according to their natural ordering.
     // PriorityQueue<E> pq = new PriorityQueue<E>(); //

2. PriorityQueue(Collection<E> c): 
       Creates a PriorityQueue containing the elements in the specified collection.
     // PriorityQueue<E> pq = new PriorityQueue<E>(Collection<E> c); //

3. PriorityQueue(int initialCapacity): 
       Creates a PriorityQueue with the specified initial capacity that orders its elements 
       according to their natural ordering.
     // PriorityQueue<E> pq = new PriorityQueue<E>(int initialCapacity); //

4. PriorityQueue(int initialCapacity, Comparator<E> comparator): 
      Creates a PriorityQueue with the specified initial capacity that orders its elements 
      according to the specified comparator.
    // PriorityQueue<E> pq = new PriorityQueue(int initialCapacity, Comparator<E> comparator); //

5. PriorityQueue(PriorityQueue<E> c): 
      Creates a PriorityQueue containing the elements in the specified priority queue.
    // PriorityQueue<E> pq = new PriorityQueue(PriorityQueue<E> c); //

6. PriorityQueue(SortedSet<E> c): 
      Creates a PriorityQueue containing the elements in the specified sorted set.
    // PriorityQueue<E> pq = new PriorityQueue<E>(SortedSet<E> c); //

7. PriorityQueue(Comparator<E> comparator): 
      Creates a PriorityQueue with the default initial capacity and whose elements are ordered 
      according to the specified comparator.
    // PriorityQueue<E> pq = new PriorityQueue<E>(Comparator<E> c); //

*/





/* The class implements Serializable, Iterable<E>, Collection<E>, Queue<E> interfaces. */

/*
A few important points on Priority Queue are as follows: 
   00. PriorityQueue doesn’t permit null.
   00.  We can’t create a PriorityQueue of Objects that are non-comparable.
   00.  PriorityQueue are unbound queues.
   00.  The head of this queue is the least element with respect to the specified ordering. 
        If multiple elements are tied for the least value, the head is one of those elements 
        — ties are broken arbitrarily.
   00.  Since PriorityQueue is not thread-safe, java provides PriorityBlockingQueue class 
        that implements the BlockingQueue interface to use in a java multithreading 
        environment.
   00.  The queue retrieval operations poll,  remove,  peek, and element access the element 
        at the head of the queue.
   00.  It provides O(log(n)) time for add and poll methods.
   00.  It inherits methods from AbstractQueue, AbstractCollection, Collection, and Object class.
 */
import java.util.PriorityQueue;
import java.util.Queue;

public class _01_PriorityQueue {
    public static void main(String args[])
    {

        Queue<Integer> pQueue = new PriorityQueue<Integer>();
 
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
 
        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.size());
        System.out.println(pQueue.peek());
        System.out.println(pQueue.peek());
    }
}
/*            
01. add(E e)	
        Inserts the specified element into this priority queue.

02. clear()	
        Removes all of the elements from this priority queue.

03. comparator()	
        Returns the comparator used to order the elements in this queue, or null if this queue 
        is sorted according to the natural ordering of its elements.

04. contains​(Object o)	
        Returns true if this queue contains the specified element.

05. forEach​(Consumer<? super E> action)	
        Performs the given action for each element of the Iterable until all elements have been 
        processed or the action throws an exception.

06. iterator()	
        Returns an iterator over the elements in this queue.

07. offer​(E e)	
        Inserts the specified element into this priority queue.

08. remove​(Object o)	
        Removes a single instance of the specified element from this queue, if it is present.

09. removeAll​(Collection<?> c)	
        Removes all of this collection’s elements that are also contained in the specified 
        collection (optional operation).

10. removeIf​(Predicate<? super E> filter)	
        Removes all of the elements of this collection that satisfy the given predicate.

11. retainAll​(Collection<?> c)	
        Retains only the elements in this collection that are contained in the specified 
        collection (optional operation).

12. spliterator()	
        Creates a late-binding and fail-fast Spliterator over the elements in this queue.

13. toArray()	
        Returns an array containing all of the elements in this queue.

14. toArray​(T[] a)	
        Returns an array containing all of the elements in this queue; the runtime type of the 
        returned array is that of the specified array. */


/*   Methods Declared in class java.util.AbstractQueue

                                          	
01. addAll(Collection<? extends E> c)	    
        Adds all of the elements in the specified collection to this queue.

02. element()	
        Retrieves, but does not remove, the head of this queue.

03. remove()	
        Retrieves and removes the head of this queue. 
*/