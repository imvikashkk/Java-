/* It is just the reverse process of autoboxing. Automatically converting an object of a wrapper 
class to its corresponding primitive type is known as unboxing. For example – conversion of 
Integer to int, Long to long, Double to double, etc. */

import java.util.ArrayList;

public class _03_UnBoxing {
    public static void main(String[] args)
    {
        Character ch = 'a';
 
        // unboxing - Character object to primitive
        // conversion
        char a = ch;
        System.out.println(a);
 
        ArrayList<Integer> arrayList  = new ArrayList<Integer>();
        arrayList.add(24);
 
        // unboxing because get method returns an Integer
        // object
        int num = arrayList.get(0);
 
        // printing the values from primitive data types
        System.out.println(num);
    }
}
