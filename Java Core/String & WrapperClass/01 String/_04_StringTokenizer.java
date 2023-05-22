/* 
StringTokenizer class in Java is used to break a string into tokens. A StringTokenizer object 
internally maintains a current position within the string to be tokenized. Some operations 
advance this current position past the characters processed. A token is returned by taking a 
substring of the string that was used to create the StringTokenizer object. It provides the 
first step in the parsing process often called lexer or scanner. The String Tokenizer class 
allows an application to break strings into tokens. It implements the Enumeration interface. 
This class is used for parsing data. To use String Tokenizer class we have to specify an input 
string and a string that contains delimiters. Delimiters are the characters that separate tokens. 
Each character in the delimiter string is considered a valid delimiter. Default delimiters are 
whitespaces, new line, space, and tab.  
*/


/* CONSTRUCTOR:- 
01. StringTokenizer(String str): 
        default delimiters like newline, space, tab, carriage return, and form feed.
02. tringTokenizer(String str, String delim):  
        delim is a set of delimiters that are used to tokenize the given string.
03. StringTokenizer(String str, String delim, boolean flag): 
        The first two parameters have the same meaning wherein The flag serves the 
        following purpose.
 */

/*  Methods Of StringTokenizer Class
     00. countTokens()	
            Returns the total number of tokens present

     00. hasMoreToken()	
            Tests if tokens are present for the StringTokenizer’s string

     00. nextElement()	
            Returns an Object rather than String

     00. hasMoreElements()	
            Returns the same value as hasMoreToken

     00. nextToken()	
            Returns the next token from the given StringTokenizer. 
 */

import java.util.StringTokenizer;

public class _04_StringTokenizer {
    // Main driver method
    public static void main(String args[])
    {
 
        // Constructor 1
        System.out.println("Using Constructor 1 - ");
 
        // Creating object of class inside main() method
        StringTokenizer st1 = new StringTokenizer(
            "Hello Geeks How are you", " ");
 
        // Condition holds true till there is single token
        // remaining using hasMoreTokens() method
        while (st1.hasMoreTokens())
 
            // Getting next tokens
            System.out.println(st1.nextToken());
 
        // Constructor 2
        System.out.println("Using Constructor 2 - ");
 
        // Again creating object of class inside main()
        // method
        StringTokenizer st2 = new StringTokenizer(
            "JAVA : Code : String", " :");
 
        // If tokens are present
        while (st2.hasMoreTokens())
 
            // Print all tokens
            System.out.println(st2.nextToken());
 
        // Constructor 3
        System.out.println("Using Constructor 3 - ");
 
        // Again creating object of class inside main()
        // method
        StringTokenizer st3 = new StringTokenizer(
            "JAVA : Code : String", " :", true);
 
        while (st3.hasMoreTokens())
            System.out.println(st3.nextToken());
    }
}
