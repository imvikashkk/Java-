/* 

Strings are the type of objects that can store the character of values. A string acts the same 
as an array of characters in Java.

A String represents group of characters Strings are represented as String objects in
java 

A String is an Array of Characters terminated by a null character.

*/


/* 
Ways of Creating a String

There are two ways to create a string in Java: 

    01. String Literal
        To make Java more memory efficient (because no new objects are created if it 
        exists already in the string constant pool). 
        String s0 = "Vikash";

    02. Using new Keyword
        In such a case, JVM will create a new string object in normal (non-pool) heap memory 
        and the literal "Welcome" will be placed in the string constant pool. The variable s 
        will refer to the object in the heap (non-pool)

        String s1 = new String("Vikash"); 

    03. Using char Array
        We can create a String by using character array
        also 
        char arr[] = {'p','r','o','g','r','a','m'};

*/


public class _00_Description {
    public static void main(String arg[]){
        
    }
}



/* In Java, string objects are immutable. Immutable simply means unmodifiable or unchangeable. 
Once a string object is created its data or state can’t be changed but a new string object is 
created.  */

/* CharSequence Interface

CharSequence Interface is used for representing the sequence of Characters in Java. 
Classes that are implemented using the CharSequence interface are mentioned below: 

    01. String Buffer
    02. String Builder
    03. String Tokenizer

*/

/* 
StringBuffer	                                          StringBuilder
-------------------------------------------------------------------------------------------
1)	StringBuffer is synchronized i.e.    ||    StringBuilder is non-synchronized  i.e. not
thread safe. It means two threads        ||    thread safe. It means two threads can call
can't call the methods of StringBuffer   ||    the methods of StringBuilder  simultaneously.
simultaneously.	                         ||
                                         ||
2)	StringBuffer is less efficient than  ||    StringBuilder is more efficient than StringBuffer.
   StringBuilder.	                     ||
                                         ||
3)	StringBuffer was introduced in Java  ||    StringBuilder was introduced in Java 1.5 
    1.0	                                 ||

*/