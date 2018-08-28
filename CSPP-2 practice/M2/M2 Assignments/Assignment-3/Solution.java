/**
    * Author : Khyathi.
    * Date : 28/08/2018
*/
import java.util.Scanner;
/**.
    * scanner function for taking inputs
*/
public final class Solution {
    /**.
        *constructor
    */
    private Solution() {
        // zero argument constructor
    }
    /**.
        * @param args of type string : command line arguments
    */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }

    /*
    Need to write the power function and print the output.
    */
    /**
    * @return float
    * @param base **this is base number**
    * @param exponent **this is exponent value**
    */
    public static long power(final int base, final int exponent) {
        /**.
            *Power function
        */
        if (exponent != 0) {
            return (base * power(base, exponent - 1));
        } else {
            return 1;
        }
    }
}

