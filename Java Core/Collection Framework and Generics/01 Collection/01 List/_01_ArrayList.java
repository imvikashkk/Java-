/*
 * Java ArrayList is a part of the Java collection framework and it is a class of java.util package.
 * It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but 
 * can be helpful in programs where lots of manipulation in the array is needed. This class is found
 * in java.util package. The main advantages of Java ArrayList are, if we declare an array then
 * it’s needed to mention the size but in ArrayList, it is not needed to mention the size of 
 * ArrayList if you want to mention the size then you can do it.
 * 
 * 
 * ArrayList is a Java class implemented using the List interface. Java ArrayList, as the name 
 * suggests, provides the functionality of a dynamic array where the size is not fixed as an array.
 * Also as a part of the Collection framework, it has many features not available with arrays.
 * 
 * ArrayList is a dynamic array and we do not have to specify the size while creating it, 
 * the size of the array automatically increases when we dynamically add and remove items.
 * 
 */

/*  Properties:
 00. The underlying DS is resizable array or growable array.
 00. Duplicates are allowed and Insertion order is preserved.
 00. Heterogeneous elements are allowed and null insertion is possible.
 00. ArrayList is the best choice if our frequent operation is retrieval operation because  ArrayList implements 
     RandomAccess interface and ArrayList is the worst choice if our frequent operation is insertion or deletion 
    in the middle because several shift operations will take huge amount of time. */

 /* 
 (a) ArrayList al = new ArrayList();
        Creates an empty ArrayList with default initial capacity 10. Once ArrayList
        reaches its maximum capacity then a new ArrayList will be created with

        new capacity = (current capacity * 3/2) + 1

        & with same reference variable(al).

(b) ArrayList al = new ArrayList(int initial_capacity);
        Creates an empty ArrayList with specified initial capacity.

(c) ArrayList al = new ArrayList(Collection c);
    Creates an equivalent ArrayList for the given Collection.
 */

/*  public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable */


import java.util.ArrayList ;
public class _01_ArrayList{
    public static void main(String arg[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Vikash");
        list.add("Vikash1");
        list.add("Vikash12");
        list.add("Vikash13");
        list.add("Vikash134");
        list.add("Vikash134");
        list.add("Vikash134");
        list.add("Vikash134");
        list.add("Vikash134");
        list.add("Vikash134");
        list.add("Vikash134");
        list.add("Vikash134");
        list.add("Vikash134");
        list.add("Vikash134");
        list.add("Vikash134");
        
        
        for(String str : list){
            System.out.println(str);
        }
    }
}



 
/* Method	                                              Description
--------------------------------------------------------------------------------------
01. add(int index, Object element):- 
           This method is used to insert a specific element at a specific position index in a list.

02. add(Object o):-	
           This method is used to append a specific element to the end of a list.

03. addAll(Collection C):-	
            This method is used to append all the elements from a specific collection to the end of the mentioned list, 
             in such an order that the values are returned by the specified collection’s iterator.

04. addAll(int index, Collection C):-
        	Used to insert all of the elements starting at the specified position from a specific collection into the 
            mentioned list.

05. clear():-
        	This method is used to remove all the elements from any list.

06. clone():-	
            This method is used to return a shallow copy of an ArrayList in Java.

07. contains? (Object o):-
        	Returns true if this list contains the specified element.

08. ensureCapacity?(int minCapacity):-
        	Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least 
            the number of elements specified by the minimum capacity argument.

09. forEach?(Consumer<? super E> action):-
        	Performs the given action for each element of the Iterable until all elements have been processed or the 
            action throws an exception.

10. get?(int index):-
        	Returns the element at the specified position in this list.

11. indexOf(Object O):- 
            The index the first occurrence of a specific element is either returned or -1 in case the element is not in 
            the list.

12. isEmpty?():-
        	Returns true if this list contains no elements.

13. lastIndexOf(Object O):-
        	The index of the last occurrence of a specific element is either returned or -1 in case the element is not 
            in the list.

14. listIterator?():-
        	Returns a list iterator over the elements in this list (in proper sequence).

15. listIterator?(int index):-
        	Returns a list iterator over the elements in this list (in proper sequence), 
            starting at the specified position in the list.

16. remove?(int index):-
        	Removes the element at the specified position in this list.

17. remove? (Object o):-
        	Removes the first occurrence of the specified element from this list, if it is present.

18. removeAll?(Collection c):-
        	Removes from this list all of its elements that are contained in the specified collection.

19. removeIf?(Predicate filter):-
        	Removes all of the elements of this collection that satisfy the given predicate.

20. removeRange?(int fromIndex, int toIndex):-
        	Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, 
            exclusive.

21. retainAll?(Collection<?> c):-
        	Retains only the elements in this list that are contained in the specified collection.

22. set?(int index, E element):-
        	Replaces the element at the specified position in this list with the specified element.

23. size?()	:- 
            Returns the number of elements in this list.

24. spliterator?() :-
        	Creates a late-binding and fail-fast Spliterator over the elements in this list.

25. subList?(int fromIndex, int toIndex):-
        	Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.

26. toArray():-
	        This method is used to return an array containing all of the elements in the list in the correct order.

27. toArray(Object[] O)	:- 
            It is also used to return an array containing all of the elements in this list in the correct order same as the 
            previous method.

28. trimToSize():-
        	This method is used to trim the capacity of the instance of the ArrayList to the list’s current size.
*/