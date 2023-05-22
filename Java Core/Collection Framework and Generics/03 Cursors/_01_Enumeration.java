/* 
We can use Enumeration to get objects one by one from legacy collection(Vector, Hashtable)
object. We can create Enumeration object by using elements() method of Vector class. 
*/

/*  
Here "v" is an Vector class object. e is of
type Enumeration interface and refers to "v
"
Enumeration e = v.elements(); 

*/


/*
  There are two methods in the Enumeration interface namely : 
1. public boolean hasMoreElements(): This method tests if this enumeration contains more elements or not.
2. public Object nextElement(): This method returns the next element of this enumeration. 
   It throws NoSuchElementException if no more element is present
*/

import java.util.*;
public class _01_Enumeration {
    public static void main(String[] arg){
        Vector<Integer> vc = new Vector<>(10);
        for(int i=1; i<=10; i++){
            vc.addElement(i);
        }

        Enumeration<Integer> e = vc.elements();

        while(e.hasMoreElements()){
            int i = e.nextElement();
            System.out.println(i);
            
        }
    }
}


/* 
There are certain limitations of enumeration which are as follows: 
    Enumeration is for legacy classes(Vector, Hashtable) only. Hence it is not a universal iterator.
    Remove operations can’t be performed using Enumeration.
    Only forward direction iterating is possible. 
*/