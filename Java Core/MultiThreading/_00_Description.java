/* Multithreading is a Java feature that allows concurrent execution of two 
or more parts of a program for maximum utilization of CPU. Each part of s
uch program is called a thread. So, threads are light-weight processes 
within a process. */

/* 
00. Threads allows a program to operate more efficiency by doing multiple
    things at the same time.
00. Threads can be used to perform complicated tasks in the background 
    without interruping the main program.
*/

/* 

00. Java Threads are objects like any other jaba objects. Threads are instances 
    of java class java.lang.Threads, or instances of subclasses of this class.
 
00. The start() methods calls the run() method which should contain the code the
    thread should execute.

00. Threads execute the code inside the run() method.

00. Prototyep declarations of start() and run() methods :
        public void start()
        public void run()

 */



/* 
     Flow Of Control in java
    00. Without Threading

          main() --> func1() --> funct2()  -->END


    00. With threading

          main()-------
                      |
             func1()------------------> END
                              |       
                  funct2()-----
 */



/* Threads can be created by using two mechanisms : 

   01. Extending the Thread class 
   02. Implementing the Runnable Interface 
   
*/

/* 
Thread Class vs Runnable Interface 

    00. If we extend the Thread class, our class cannot extend any other class because 
    Java doesn’t support multiple inheritance. But, if we implement the Runnable interface,
    our class can still extend other base classes.

    00. We can achieve basic functionality of a thread by extending Thread class because 
    it provides some inbuilt methods like yield(), interrupt() etc. that are not available 
    in Runnable interface.

    00. Using runnable will give you an object that can be shared amongst multiple threads.
     
 */
public class _00_Description{
    public static void main(String arg[]){

    }
}