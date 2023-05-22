/* StringBuffer is a class in Java that represents a mutable sequence of characters. 
It provides an alternative to the immutable String class, allowing you to modify 
the contents of a string without creating a new object every time.


There are several advantages of using StringBuffer over regular String objects in Java:

    00. Mutable: 
            StringBuffer objects are mutable, which means that you can modify the contents 
        of the object after it has been created. In contrast, String objects are immutable,  
        which means that you cannot change the contents of a String once it has been created.

    00. Efficient: 
            Because StringBuffer objects are mutable, they are more efficient than creating new 
        String objects each time you need to modify a string. This is especially true if you 
        need to modify a string multiple times, as each modification to a String object creates 
        a new object and discards the old one.

    00. Thread-safe: 
            StringBuffer objects are thread-safe, which means multiple threads cannot access it 
        simultaneously. In contrast, String objects are not thread-safe, which means that you 
        need to use synchronization if you want to access a String object from multiple threads. */

/*  Constructos

        00. StringBuffer(): 
                creates an empty string buffer with an initial capacity of 16.
        00. StringBuffer(String str): 
                creates a string buffer with the specified string.
        00. StringBuffer(int capacity): 
                creates an empty string buffer with the specified capacity as length.
 */


 /*METHODS ex. StringBuffer sb = new StringBuffer("Hello"); // initial capacity 16
        01. append("Vikash")// HelloVikash
        02. insert(1, "Vishal") //HVishalello
        03. replace(1,3,"Java") //HJavalo
        04. delete(1,3)//Hlo
        05. reverse()//olleH
        06. capacity() // (oldcapacity*2)+2
        07. length()
        08. deleteCharAt()
        09. ensureCapacity()
                        // It is used to increase the capacity of 
                        // a StringBuffer object. The new capacity will be set to 
                        // either the value we specify or twice the current capacity 
                        // plus two (i.e. capacity+2), whichever is larger. Here, capacity 
                        // specifies the size of the buffer.

  */
public class _02_StringBuffer {
    
}
