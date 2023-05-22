/* 
We create a new class which implements java.lang.Runnable 
interface and override run() method. Then we instantiate a 
Thread object and call start() method on this object.  
*/


/* ************************************************ Program 01 **************************************************** */

// class MyThread1 implements Runnable{
//     public void run(){
//         int i = 0 ;
//         while(i<100){
//           System.out.println("MyThread_01 is running");
//           i++;
//         }
//     }
// }

// class MyThread2 implements Runnable{
//     public void run(){
//         int i = 0 ;
//         while(i<100){
//           System.out.println("MyThread_02 is running");
//           i++;
//         }
//     }
// }

// public class _02_runnable_interface_thread {
//     public static void main(String arg[]){
//         MyThread1 bullet1 = new MyThread1();
//         Thread gun1 = new Thread(bullet1);

//         MyThread2 bullet2 = new MyThread2();
//         Thread gun2 = new Thread(bullet2);

//         gun1.start();
//         gun2.start();

//     }
// }


/* *********************************************** Program 02 ************************************************* */
// // Java code for thread creation by implementing
// // the Runnable Interface
// class MultithreadingDemo implements Runnable {
//     public void run()
//     {
//         try {
//             // Displaying the thread that is running
//             System.out.println(
//                 "Thread " + Thread.currentThread().getId()
//                 + " is running");
//         }
//         catch (Exception e) {
//             // Throwing an exception
//             System.out.println("Exception is caught");
//         }
//     }
// }
 
// // Main Class
// class _02_runnable_interface_thread {
//     public static void main(String[] args)
//     {
//         int n = 8; // Number of threads
//         for (int i = 0; i < n; i++) {
//             Thread object
//                 = new Thread(new MultithreadingDemo());
//             object.start();
//         }
//     }
// }
