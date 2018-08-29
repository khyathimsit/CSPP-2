/**
    * Author : Khyathi.
    * Date : 29/08/2018
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
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int x = gcd(n1, n2);
        System.out.println(x);
    }
    /*
    Need to write the gcd function and print the output.
    */
    /**
    * @return int
    * @param a **number 1**
    * @param b **number 2**
    */
    public static int gcd(final int a, final int b) {
       int gcdval = 0;
       for (int i = 1; i <= a && i <= b; i++) {
        if (a % i == 0 && b % i == 0) {
            gcdval = i;
        }
       }
       return gcdval;
    }
}

