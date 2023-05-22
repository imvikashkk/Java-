/* PriorityBlockingQueue: It is to be noted that both the implementations, the PriorityQueue 
and LinkedList are not thread-safe. PriorityBlockingQueue is one alternative 
implementation if thread-safe implementation is needed. PriorityBlockingQueue is an 
unbounded blocking queue that uses the same ordering rules as class PriorityQueue and 
supplies blocking retrieval operations. Since it is unbounded, adding elements may 
sometimes fail due to resource exhaustion resulting in OutOfMemoryError. Let’s see how 
to create a queue object using this class. */

import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class _03_PriorityBlockingQueue {
    public static void main(String args[])
    {
        // Creating empty priority
        // blocking queue
        Queue<Integer> pbq  = new PriorityBlockingQueue<Integer>();
 
        // Adding items to the pbq
        // using add()
        pbq.add(10);
        pbq.add(20);
        pbq.add(15);
 
        // Printing the top element of
        // the PriorityBlockingQueue
        System.out.println(pbq.peek());
 
        // Printing the top element and
        // removing it from the
        // PriorityBlockingQueue
        System.out.println(pbq.poll());
 
        // Printing the top element again
        System.out.println(pbq.peek());
    }
}
