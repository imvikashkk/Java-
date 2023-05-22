/* LinkedList is a class which is implemented in the collection framework which inherently 
implements the linked list data structure. It is a linear data structure where the 
elements are not stored in contiguous locations and every element is a separate object 
with a data part and address part. The elements are linked using pointers and addresses. 
Each element is known as a node. Due to the dynamicity and ease of insertions and 
deletions, they are preferred over the arrays or queues. Let’s see how to create a queue 
object using this class. */

import java.util.LinkedList;
import java.util.Queue;

public class _02_LinkedListQueue {
    public static void main(String args[])
    {
        Queue<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(15);
 
        System.out.println(ll.peek());
        System.out.println(ll.poll());
        System.out.println(ll.peek());
    }
}
