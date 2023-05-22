public class _00_Description {
    
}

/* Property             HashSet             LinkedHashSet               TreeSet
1.Underlying DS   || Hash table         LinkedList + Hash table       Balanced Tree
2.Duplicates Not  || allowed                 Not allowed               Not allowed
3.Insertion Order || Not preserved            Preserved                Not Preserved
4.Sorting Order   ||      NA                     NA                      Applicable
5.Heterogeneous   || Allowed                  Not allowed               Not allowed
    Objects
6.null acceptance || Allowed                    Allowed               For empty TreeSet  
                                                                          as 1st
                                                                   element null is allowed 
                                                                   
*/


 /* 
          Method	                                                Description
-------------------------------------------------------------------------------------------------
01. add(element)	
        This method is used to add a specific element to the set. The function adds the element 
        only if the specified element is not already present in the set else the function returns 
        False if the element is already present in the Set.

02. addAll(collection)	
        This method is used to append all of the elements from the mentioned collection to the 
        existing set. The elements are added randomly without following any specific order.

03. clear()	
        This method is used to remove all the elements from the set but not delete the set. 
        The reference for the set still exists.

04. contains(element)	
        This method is used to check whether a specific element is present in the Set or not.

05. containsAll(collection)	
        This method is used to check whether the set contains all the elements present in the 
        given collection or not. This method returns true if the set contains all the elements 
        and returns false if any of the elements are missing.

06. hashCode()	
        This method is used to get the hashCode value for this instance of the Set. It returns 
        an integer value which is the hashCode value for this instance of the Set.

07. isEmpty()	
        This method is used to check whether the set is empty or not.

08. iterator()	
        This method is used to return the iterator of the set. The elements from the set are 
        returned in a random order.

09. remove(element)	
        This method is used to remove the given element from the set. This method returns True 
        if the specified element is present in the Set otherwise it returns False.

10. removeAll(collection)	
        This method is used to remove all the elements from the collection which are present 
        in the set. This method returns true if this set changed as a result of the call.

11. retainAll(collection)	
        This method is used to retain all the elements from the set which are mentioned in the 
        given collection. This method returns true if this set changed as a result of the call.

12. size()	
        This method is used to get the size of the set. This returns an integer value which 
        signifies the number of elements.

13. toArray()	
        This method is used to form an array of the same elements as that of the Set. 
        
*/

