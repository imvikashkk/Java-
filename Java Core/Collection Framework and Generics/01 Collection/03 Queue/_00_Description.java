/* The Queue interface is present in java.util package and extends the Collection interface 
is used to hold the elements about to be processed in FIFO(First In First Out) order. It 
is an ordered list of objects with its use limited to inserting elements at the end of the
list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the 
First-In-First-Out principle. */

/*

00. The Queue is used to insert elements at the end of the queue and removes from the 
    beginning of the queue. It follows FIFO concept.
    
00. The Java Queue supports all methods of Collection interface including insertion, 
    deletion, etc.

00. LinkedList,ArrayBlockingQueue and PriorityQueue are the most frequently used 
    implementations.

00. If any null operation is performed on BlockingQueues, NullPointerException is thrown.

00. The Queues which are available in java.util package are Unbounded Queues.

00. The Queues which are available in java.util.concurrent package are the Bounded Queues.

00. All Queues except the Deques supports insertion and removal at the tail and head of 
    the queue respectively. The Deques support element insertion and removal at both ends.

*/


/* The Queue interface provides several methods for adding, removing, and inspecting 
elements in the queue. Here are some of the most commonly used methods:

01. add(int index, element)	
        This method is used to add an element at a particular index in the queue. When a single 
        parameter is passed, it simply adds the element at the end of the queue.

    addAll(int index, Collection collection)	
        This method is used to add all the elements in the given collection to the queue. 
        When a single parameter is passed, it adds all the elements of the given collection at 
        the end of the queue.

    add(object)	
        This method is used to insert the specified element into a queue and return 
        true upon success.

    offer(element)
        Adds an element to the rear of the queue. If the queue is full, it returns false.

03. size()	
        This method is used to return the size of the queue.

04. poll()  
        Removes and returns the element at the front of the queue. If the queue is 
        empty, it returns null.

    clear()	
        This method is used to remove all the elements in the queue. However, the reference of the 
        queue created is still stored.

    remove()	
        This method is used to remove the element from the front of the queue.

    remove(int index)	
        This method removes an element from the specified index. It shifts subsequent 
        elements(if any) to left and decreases their indexes by 1.

    remove(element)	
        This method is used to remove and return the first occurrence of the given element in 
        the queue.

    

05. element() 
        Returns the element at the front of the queue without removing it. 
        If the queue is empty, it throws an exception.

06. peek() 
        Returns the element at the front of the queue without removing it. If 
        the queue is empty, it returns null. 

07. get(int index)	
        This method returns elements at the specified index.

08. indexOf(element)	
        This method returns the first occurrence of the given element or -1 if the element is 
        not present in the queue.

    lastIndexOf(element)	
        This method returns the last occurrence of the given element or -1 if the element is not 
        present in the queue.

09. equals(element)	
        This method is used to compare the equality of the given element with the elements of 
        the queue.

10. hashCode()	
        This method is used to return the hashcode value of the given queue.

11. isEmpty()	
        This method is used to check if the queue is empty or not. It returns true if the queue 
        is empty, else false.

12. contains(element)	   
        This method is used to check if the queue contains the given element or not. It returns 
        true if the queue contains the element.

13. containsAll(Collection collection)	
        This method is used to check if the queue contains all the collection of elements.

14. sort(Comparator comp)	
        This method is used to sort the elements of the queue on the basis of the given comparator.


*/

public class _00_Description {
    public static void main(String arg[]){

    }
}

