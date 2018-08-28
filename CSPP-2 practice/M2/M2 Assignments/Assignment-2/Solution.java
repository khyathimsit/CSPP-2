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
    private static final int NUMBER = 4;
    /**.
        Conversion value
    */
    private Solution() {
        // zero argument constructor
    }
    /**.
        * @param args of type string : command line arguments
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
    /**
    * @return float
    * @param a **value 1**
    * @param b **value 2**
    * @param c **value 3**
    */
    public static float roots(final int a, final int b, final int c) {
        double determinant;
        determinant = (b * b) - (NUMBER * a * c);
        double r1;
        double r2;
        r1 = (- b + java.lang.Math.sqrt(determinant)) / (2 * a);
        r2 = (- b - java.lang.Math.sqrt(determinant)) / (2 * a);
        System.out.println(+ r1 + " " + r2);
        return 0;
    }
}
