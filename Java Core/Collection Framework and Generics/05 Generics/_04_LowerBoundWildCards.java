/* The purpose of lower bounded wildcards is to restrict the unknown type to be a specific
type or a supertype of that type. It is used by declaring wildcard character ("?") followed
by the super keyword, followed by its lower bound. */
/* 
Syntax
     >> List<? super Integer>
     >> Here,
     >> ? is a wildcard character.
     >> super, is a keyword.
     >> Integer, is a wrapper class.

Suppose, we want to write the method for the list of Integer and its supertype (like
Number, Object). Using List<? super Integer> is suitable for a list of type Integer or any
of its superclasses whereas List<Integer> works with the list of type Integer only.
So, List<? super Integer> is less restrictive than List<Integer>.

Example of Lower Bound Wildcard
In this example, we are using the lower bound wildcards to write the method for
List<Integer> and List<Number>. */

import java.util.Arrays;
import java.util.List;

public class _04_LowerBoundWildCards {
    public static void addNumbers(List <? super Integer> list){
        for(Object n : list){
            System.out.print(n + " ");
        }System.out.println("\n\n");
    }

    public static void main(String args[]){
        List<Integer> l1 = Arrays.asList(1,2,3);
        System.out.print("Displayng the Integer values: ");
        addNumbers(l1);

        List<Number> l2 = Arrays.asList(1.0, 2.0, 3.0);
        System.out.print("Displaying The number values: ");
        addNumbers(l2);
    }
}
