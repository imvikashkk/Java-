/* 
EnumSet class which is implemented in the collections framework is one of the specialized 
implementations of the Set interface for use with the enumeration type. It is a high-performance 
set implementation, much faster than HashSet. All of the elements in an enum set must come from 
a single enumeration type that is specified when the set is created either explicitly or 
implicitly. Let’s see how to create a set object using this class.  
*/


import java.util.*;
enum Vikash { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }
public class _02_EnumSet {
    public static void main(String[] args)
    {
        // Creating a set
        Set<Vikash> set1;
  
        // Adding the elements
        set1 = EnumSet.of(Vikash.QUIZ, Vikash.CONTRIBUTE,
                          Vikash.LEARN, Vikash.CODE);
  
        System.out.println("Set 1: " + set1);
    }
}
