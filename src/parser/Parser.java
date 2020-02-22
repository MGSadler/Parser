/* Use methods to:
1. Get a comma-delimited String of integers (e.g. "4, 8, 16, 32") from the user
at the command line and then convert the String to an ArrayList of integers 
(using the wrapper class) with each element containing one of the input integers
in sequence

2. Print the integers to the command line, using a for loop, so that each 
integer is on a separate line
 */
package parser;

import java.util.ArrayList;
import java.util.Scanner;

public class Parser {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter string of numbers separated by comma and space: ");
       String value = input.nextLine();
      
       String tokens[] = value.split(",");
       ArrayList<Integer> list = new ArrayList<Integer>();
      
       for(int i=0;i<tokens.length;++i)
           list.add(Integer.parseInt(tokens[i].trim()));
      
       System.out.println("The values are:");
      
       for(int i=0;i<list.size();++i)
           System.out.println(list.get(i));
      

   }

}

