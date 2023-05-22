/* Stack is a class presents in java.util package which extends from Vector class. So, it
is the child class of Vector and it is a specially designed for last-in-first-out (LIFO) order. */


/* public class Stack<E> extends Vector<E> */



import java.util.*;
public class _04_Stack {
    public static void main(String arg[]){
        Stack<Integer> stk = new Stack<>();
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        stk.push(60);
        stk.push(70);

        System.out.println(stk);
    }
}


/* java.util.Stack

01. empty()
        It returns true if nothing is on the top of the stack. Else, returns false.

02. peek()
	    Returns the element on the top of the stack, but does not remove it.

03. pop()
	    Removes and returns the top element of the stack. An ‘EmptyStackException’ 
        An exception is thrown if we call pop() when the invoking stack is empty.

04. push(Object element)
	    Pushes an element on the top of the stack.

05. search(Object element)
	    It determines whether an object exists in the stack. If the element is found,
        It returns the position of the element from the top of the stack. Else, it returns -1.

 */


 /* java.util.vector

01. add(E e)	
        Appends the specified element to the end of this Vector.

02. add(int index, E element)	
        Inserts the specified element at the specified position in this Vector.

03. addAll(Collection<?extends E> c)
	    Appends all of the elements in the specified Collection to the end of this Vector, 
        in the order that they are returned by the specified Collection’s Iterator.

04. addAll(int index,Collection<? extends E> c)
	    Insert all of the elements in the specified Collection into this Vector at the specified position.

05. addElement(E obj)	
        Adds the specified component to the end of this vector, increasing its size by one.

06. capacity()	
        Returns the current capacity of this vector.

07. clear()	
        Removes all of the elements from this Vector.

08. clone()	
        Returns a clone of this vector.

09. contains(Object o)	
        Returns true if this vector contains the specified element.

10. containsAll(Collection<?> c)	
        Returns true if this Vector contains all of the elements in the specified Collection.

11. copyInto(Object[] anArray)	
        Copies the components of this vector into the specified array.

12. elementAt(int index)	
        Returns the component at the specified index.

13. elements()	
        Returns an enumeration of the components of this vector.

14. ensureCapacity(int minCapacity)	
        Increases the capacity of this vector, if necessary, to ensure that it can hold at least the number 
        of components specified by the minimum capacity argument.

15. equals(Object o)	
        Compares the specified Object with this Vector for equality.

16. firstElement()	
        Returns the first component (the item at index 0) of this vector.

17. forEach(Consumer<?super E> action)
	    Performs the given action for each element of the Iterable until all elements have been processed or 
        the action throws an exception.

18. get(int index)	
        Returns the element at the specified position in this Vector.

19. hashCode()	
        Returns the hash code value for this Vector.

20. indexOf(Object o)	
        Returns the index of the first occurrence of the specified element in this vector, or -1 if this vector 
        does not contain the element.

21. indexOf(Object o, int index)	
        Returns the index of the first occurrence of the specified element in this vector, searching forwards from 
        the index, or returns -1 if the element is not found.

22. insertElementAt(E obj, int index)	
        Inserts the specified object as a component in this vector at the specified index.

23. isEmpty()	
        Tests if this vector has no components.

24. iterator()	
        Returns an iterator over the elements in this list in a proper sequence.

25. lastElement()	
        Returns the last component of the vector.

26. lastIndexOf(Object o)	
        Returns the index of the last occurrence of the specified element in this vector,
        or -1 if this vector does not contain the element.

27. lastIndexOf(Object o, int index)	
        Returns the index of the last occurrence of the specified element in this vector, searching backward 
        from the index, or returns -1 if the element is not found.

28. listIterator()	
        Returns a list iterator over the elements in this list (in proper sequence).

29. listIterator(int index)	
        Returns a list iterator over the elements in this list (in proper sequence), 
        starting at the specified position in the list.

30. remove(int index)	
        Removes the element at the specified position in this Vector.

31. remove(Object o)	
        Removes the first occurrence of the specified element in this Vector. 
        If the Vector does not contain the element, it is unchanged.

32. removeAll(Collection<?> c)	
        Removes from this Vector all of its elements contained in the specified Collection.

34. removeAllElements()	
        Removes all components from this vector and sets its size to zero.

35. removeElement(Object obj)	
        Removes the first (lowest-indexed) occurrence of the argument from this vector.

36. removeElementAt(int index)	
        Deletes the component at the specified index.

38. removeIf(Predicate<? super E> filter)	
        Removes all of the elements of this collection that satisfy the given predicate.

39. removeRange(int fromIndex,int toIndex)
	    Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.

40. replaceAll(UnaryOperator<E> operator)	
        Replaces each element of this list with the result of applying the operator to that element.

41. retainAll(Collection<?> c)	    
        Retains only the elements in this Vector contained in the specified Collection.
        
42. set(int index, E element)	
        Replaces the element at the specified position in this Vector with the specified element.

43. setElementAt(E obj, int index)	
        Sets the component at the specified index of this vector to be the specified object.

44. setSize(int newSize)	
        Sets the size of this vector.

45. size()	
        Returns the number of components in this vector.

46. sort(Comparator<? super E> c)	
        Sorts this list according to the order induced by the specified Comparator.

47. spliterator()	
        Creates a late-binding and fail-fast Spliterator over the elements in this list.

48. subList(int fromIndex, int toIndex)	
        Returns a view of the portion of this List between fromIndex, inclusive, and toIndex, exclusive.

49. toArray()	
        Returns an array containing all of the elements in this Vector in the correct order.

50. toArray(T[] a)	
        Returns an array containing all of the elements in this Vector in the correct order; the 
        runtime type of the returned array is that of the specified array.

51. toString()	
        Returns a string representation of this Vector, containing the String representation of each element.

52. trimToSize()	
        Trims the capacity of this vector to be the vector’s current size.
 */