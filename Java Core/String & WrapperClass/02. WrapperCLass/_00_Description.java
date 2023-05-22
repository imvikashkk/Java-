/* A Wrapper class in Java is a class whose object wraps or contains primitive data types. 
When we create an object to a wrapper class, it contains a field and in this field, we can 
store primitive data types. In other words, we can wrap a primitive value into a wrapper 
class object.  */

/* A Wrapper class in Java is a class whose object wraps or contains primitive data types.

The wrapper class in Java is used to convert primitive data types into objects. Objects are 
needed if we wish to modify the arguments passed into a method.

There are 8 Wrapper classes in Java these are char, byte, short, int, long, float, double and 
boolean. */

/* Need of Wrapper Classes
There are certain needs for using the Wrapper class in Java as mentioned below:

   01. They convert primitive data types into objects. Objects are needed if we wish to modify 
       the arguments passed into a method (because primitive types are passed by value).

   02. The classes in java.util package handles only objects and hence wrapper classes help in 
       this case also.

   03. Data structures in the Collection framework, such as ArrayList and Vector, store only 
       objects (reference types) and not primitive types.

   04. An object is needed to support synchronization in multithreading. */


 /*   Advantages of Wrapper Classes:
   01. Collections allowed only object data.
   02. On object data we can call multiple methods compareTo(), equals(), toString()
   03. Cloning process only objects
   04. Object data allowed null values.
   05. Serialization can allow only object data. 
*/



/* Wrapper class corresponding to its primitive data type: 

Primitive Data type                                 Wrapper class
---------------------------------------------------------------------------
    char                                                Character
    byte                                                Byte
    short                                               Short
    int                                                 Integer
    long                                                Long
    float                                               Float
    double                                              Double
    boolean                                             Boolean 

*/

/* 
    To create wrapper object, we use the wrapper class instead of the primitive type. To get the
    value , we can just print the object.

    Integer myInt = 10;
    Double mydouble = 13.87;
    Character myChar = 'A';
    System.out.println(myInt);
    System.out.println(mydouble);
    System.out.println(myChar);
    
 */

/* The following methods are used to get tha value associated with the corresponding wrapper
   object: intValue(), doubleValue(), byteValue(),  shortValue(), longValue(), floatValue(),
   charValue(), boloeanValue().

    Integer myInt = 8;
    Double myDouble = 13.45;
    Character myChar = 'A';
    System.out.println(myInt.intValue()); //8
    System.out.println(myDouble.doubleValue()); //13.45
    System.out.println(myChar.charValue()); // A

 
 */

public class _00_Description{
    public static void main(String arg[]){
    }

}


