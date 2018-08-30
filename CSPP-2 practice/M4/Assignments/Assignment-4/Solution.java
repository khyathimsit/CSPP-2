/**
    * Author : Khyathi.
    * Date : 30/08/2018
*/
import java.util.Scanner;
/**.
    * scanner function for taking inputs
*/
public final class Solution {
    /* Fill the main function to print resultant of addition of matrices*/
    /**.
        *constructor
    */
    private Solution() {
        // zero argument constructor
    }
    /**.
        * @param args of type string : command line arguments
    */
	public static void main(final String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
		String reverse = reverseString(s);	
		System.out.println(reverse);
		
	}
	//Write reverseString function
	public static  String reverseString(String str)
	{
		//int length = str.length();
		char c[] = str.toCharArray();
		for (int f = 0, l = str.length() - 1; f < l; f++, l--)
		{
			char temp = c[f];
			c[f] = c[l];
			c[l] = temp;
		}
		return String.copyValueOf(c);
	}

}
