/* 
It is only applicable for List collection implemented classes like ArrayList, LinkedList, etc. 
It provides bi-directional iteration. ListIterator must be used when we want to enumerate 
elements of List. This cursor has more functionality(methods) than iterator. ListIterator 
object can be created by calling listIterator() method present in the List interface. 
*/


/* 
ListIterator ltr = l.listIterator();

    Note: Here //l// is any List object, ltr is of type. ListIterator interface and refers to //l//. 
    ListIterator interface extends the Iterator interface. So all three methods of Iterator 
    interface are available for ListIterator. In addition, there are six more methods.
*/


/* 1. Forward direction
1.1 hasNext(): Returns true if the iteration has more elements
1.2 next(): Same as next() method of Iterator. Returns the next element in the iteration.
1.3 nextIndex(): Returns the next element index or list size if the list iterator is at the end of the list. 
*/


/* 2. Backward direction
2.1 hasPrevious(): Returns true if the iteration has more elements while traversing backward.
2.2 previous(): Returns the previous element in the iteration and can throw NoSuchElementException 
                if no more element present.
2.3 previousIndex(): Returns the previous element index or -1 if the list iterator is at the beginning of the list. 
*/


/* 3. Other Methods
3.1 remove(): Same as remove() method of Iterator. Removes the next element in the iteration.
3.2 set(Object obj): Replaces the last element returned by next() or previous() with the specified element.
3.3 add(Object obj): Inserts the specified element into the list at the position before the element that 
    would be returned by next() 
*/






import java.util.ArrayList;
import java.util.ListIterator;

public class _03_ListIterator {
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < 10; i++)
			al.add(i);
		System.out.println(al);

		ListIterator<Integer> ltr = al.listIterator();

		while (ltr.hasNext()) {
			int i = (Integer)ltr.next();
			System.out.print(i + " ");
			if (i % 2 == 0) {
				i++;
				ltr.set(i);
				ltr.add(i);
			}
		}

		System.out.println();
		System.out.println(al);
	}
}
