/* The unbounded wildcard type represents the list of an unknown type such as List<?>.
This approach can be useful in the following scenarios: -

        o When the given method is implemented by using the functionality provided in
          the Object class.
        o When the generic class contains the methods that don't depend on the type
          parameter. */


import java.util.Arrays;
import java.util.List;

public class _03_UnBoundedWildCards {
    public static void display(List <?> list){
        for(Object n : list){
            System.out.print(n + " ");
        }System.out.println("\n\n");
    }

    public static void main(String[] args){


        List<Integer> l1  = Arrays.asList(1, 2, 3);
        System.out.print("Displaying The Integer Value: ");
        display(l1);

        List<String> l2 = Arrays.asList("Vikash", "Kumar", "khunte");
        System.out.print("Diplaying The String Values: ");
        display(l2);
    }
}
