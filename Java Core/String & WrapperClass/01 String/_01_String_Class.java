/* 

01. String(byte[] byte_arr) 
        – Construct a new String by decoding the byte array. It uses the platform’s default 
          character set for decoding.
    Example:
            byte[] b_arr = {86, 73, 75, 65, 83, 72};
            String s_byte =new String(b_arr); //VIKASH

02. String(byte[] byte_arr, Charset char_set) 
        – Construct a new String by decoding the byte array. It uses the char_set for decoding.
    Example:
            byte[] b_arr = {86, 73, 75, 65, 83, 72};
            Charset cs = Charset.defaultCharset();
            String s_byte_char = new String(b_arr, cs); 

03. String(byte[] byte_arr, String char_set_name) 
        – Construct a new String by decoding the byte array. It uses the char_set_name for decoding.
        It looks similar to the above constructs and they appear before similar functions but it 
        takes the String(which contains char_set_name) as parameter while the above constructor 
        takes CharSet.
    Example:
            byte[] b_arr = {86, 73, 75, 65, 83, 72};
            String s = new String(b_arr, "US-ASCII"); 

04. String(byte[] byte_arr, int start_index, int length) 
        – Construct a new string from the bytes array depending on the 
        start_index(Starting location) and length(number of characters from starting location).
    Example:
            byte[] b_arr = {86, 73, 75, 65, 83, 72};
            String s = new String(b_arr, 1, 3); 

05. String(byte[] byte_arr, int start_index, int length, Charset char_set) 
        – Construct a new string from the bytes array depending on the 
        start_index(Starting location) and length(number of characters from starting location).
        Uses char_set for decoding.
    Example:
        byte[] b_arr = {86, 73, 75, 65, 83, 72};
        Charset cs = Charset.defaultCharset();
        String s = new String(b_arr, 1, 3, cs); 

06. String(byte[] byte_arr, int start_index, int length, String char_set_name) 
        – Construct a new string from the bytes array depending on the 
        start_index(Starting location) and length(number of characters from starting location).
        Uses char_set_name for decoding.
    Example:
        byte[] b_arr = {86, 73, 75, 65, 83, 72}
        String s = new String(b_arr, 1, 4, "US-ASCII"); 

07. String(char[] char_arr) 
        – Allocates a new String from the given Character array
        Example:
            char char_arr[] = {'v','i','k', 'a', 's', 'h'};
            String s = new String(char_arr); 

08. String(char[] char_array, int start_index, int count) 
        – Allocates a String from a given character array but choose count characters from the 
        start_index.
        Example:
            char char_arr[] = {'v','i','k', 'a', 's', 'h'};
            String s = new String(char_arr , 1, 3); 

09. String(int[] uni_code_points, int offset, int count) 
       – Allocates a String from a uni_code_array but choose count characters from the 
      start_index.
      Example:
            int[] uni_code = {86, 73, 75, 65, 83, 72};
            String s = new String(uni_code, 1, 3);

10. String(StringBuffer s_buffer) 
        – Allocates a new string from the string in s_buffer
        Example:
            StringBuffer s_buffer = new StringBuffer("Vikash");
            String s = new String(s_buffer); 

11. String(StringBuilder s_builder) 
       – Allocates a new string from the string in s_builder
       Example:
            StringBuilder s_builder = new StringBuilder("Geeks");
            String s = new String(s_builder); //Geeks

 */

public class _01_String_Class {
    public static void main(String arg[]){
        byte[] arr = {86, 73, 75, 65, 83, 72};
        String arr1 = new String(arr);
        System.out.println(arr1);
    }
}


/* METHODS
 
01. int length(): 
     Returns the number of characters in the String.
       "GeeksforGeeks".length();  // returns 13

02. Char charAt(int i): 
     Returns the character at ith index.
       "GeeksforGeeks".charAt(3); // returns  ‘k’

03. String substring (int i): 
     Return the substring from the ith  index character to end.
       "GeeksforGeeks".substring(3); // returns “ksforGeeks”

04. String substring (int i, int j): 
     Returns the substring from i to j-1 index.
        "GeeksforGeeks".substring(2, 5); // returns “eks”

05. String concat( String str): 
     Concatenates specified string to the end of this string.
        String s1 = ”Geeks”;
        String s2 = ”forGeeks”;
        String output = s1.concat(s2); // returns “GeeksforGeeks”

06. int indexOf (String s): 
     Returns the index within the string of the first occurrence of the specified string.
        String s = ”Learn Share Learn”;
        int output = s.indexOf(“Share”); // returns 6

07. int indexOf (String s, int i): 
     Returns the index within the string of the first occurrence of the specified string, 
     starting at the specified index.
       String s = ”Learn Share Learn”;
       int output = s.indexOf("ea",3);// returns 13

08. Int lastIndexOf( String s): 
     Returns the index within the string of the last occurrence of the specified string.
        String s = ”Learn Share Learn”;
        int output = s.lastIndexOf("a"); // returns 14

09. boolean equals( Object otherObj): 
     Compares this string to the specified object.
        Boolean out = “Geeks”.equals(“Geeks”); // returns true
        Boolean out = “Geeks”.equals(“geeks”); // returns false

10. boolean  equalsIgnoreCase (String anotherString): 
     Compares string to another string, ignoring case considerations.
       Boolean out= “Geeks”.equalsIgnoreCase(“Geeks”); // returns true
       Boolean out = “Geeks”.equalsIgnoreCase(“geeks”); // returns true

11. int compareTo( String anotherString): 
     Compares two string lexicographically.
       int out = s1.compareTo(s2);  // where s1 and s2 are
                             // strings to be compared

           This returns difference s1-s2. If :
           out < 0  // s1 comes before s2
           out = 0  // s1 and s2 are equal.
           out > 0   // s1 comes after s2.

12. int compareToIgnoreCase( String anotherString): 
     Compares two string lexicographically, ignoring case considerations.
            int out = s1.compareToIgnoreCase(s2);  
                                       // where s1 and s2 are 
                                      // strings to be compared

            This returns difference s1-s2. If :
            out < 0  // s1 comes before s2
            out = 0   // s1 and s2 are equal.
            out > 0   // s1 comes after s2.

    Note- In this case, it will not consider case of a letter (it will ignore whether it is 
    uppercase or lowercase).

13. String toLowerCase(): 
     Converts all the characters in the String to lower case.
           String word1 = “HeLLo”;
           String word3 = word1.toLowerCase(); // returns “hello"

14. String toUpperCase(): 
     Converts all the characters in the String to upper case.
           String word1 = “HeLLo”;
           String word2 = word1.toUpperCase(); // returns “HELLO”

15. String trim(): 
      Returns the copy of the String, by removing whitespaces at both ends. It does not affect 
      whitespaces in the middle. 
           String word1 = “ Learn Share Learn “;
           String word2 = word1.trim(); // returns “Learn Share Learn”

16. String replace (char oldChar, char newChar): 
      Returns new string by replacing all occurrences of oldChar with newChar.
           String s1 = “feeksforfeeks“;
           String s2 = “feeksforfeeks”.replace(‘f’ ,’g’); // returns “geeksgorgeeks”

    Note:- s1 is still feeksforfeeks and s2 is geeksgorgeeks

 */
