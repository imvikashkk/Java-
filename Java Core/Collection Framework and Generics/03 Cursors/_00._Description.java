/*
 A Java Cursor is an Iterator, which is used to iterate or traverse or retrieve a Collection or 
Stream object’s elements one by one. There are three cursors in Java.

    01. Iterator
    02. Enumeration
    03. ListIterator


    Note: SplitIterator can also be considered as a cursor as it is a type of Iterator only.

*/



// GO AND LEARN 01 02 03 THEN COME 


/* Enumeration, Iterator and ListIterator are the interfaces. How you get objects of interfaces?
We are not creating objects of interfaces, we are getting its internal implemented class objects.
Ex: Internal Implementation of cursors

Vector v = new Vector();
Enumeration e = v.elements();
Iterator itr = v.iterator();
ListIterator ltr = v.listIterator();
System.out.println(e.getClass().getName()); // java.util.Vector$1
System.out.println(itr.getClass().getName()); // java.util.Vector$Itr
System.out.println(ltr.getClass().getName());// java.util.Vector$ListItr

That is, anonymous inner class(1) present in java.util.Vector, Itr inner class present in
java.util.Vector and ListItr inner class present in java.util.Vector. 
*/


/*
 * Important Points

    Please note that initially, any iterator reference will point to the index just before the 
    index of the first element in a collection.We don’t create objects of Enumeration, Iterator,
    ListIterator because they are interfaces. We use methods like elements(), iterator(), 
    listIterator() to create objects. These methods have an anonymous Inner Class that extends 
    respective interfaces and return this class object.

    Note: The $ symbol in reference class name is a proof that concept of inner classes is used 
    and these class objects are created. 
 */