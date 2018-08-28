/**
    * Author : Khyathi.
    * Date : 27/08/2018
*/
import java.util.Scanner;
/**.
    * scanner function for taking inputs
*/
import java.lang.Math.*;
/**.
    * Math function for calculations
*/

public class Solution {
	/**.
        *constructor
    */
    private Solution() {
        // zero argument constructor
    }
    /**.
        * @param args of type string : command line arguments
    */
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base,exponent);
        System.out.println(result);
	}

	/*
	Need to write the power function and print the output.
	*/
	public static long power(int base, int exponent) {
        if (exponent != 0) {
            return (base * power(base, exponent - 1));
        }
        else {
            return 1;
        }
    }
}
