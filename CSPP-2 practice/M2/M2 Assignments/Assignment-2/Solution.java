/**
    * Author : Khyathi.
    * Date : 28/08/2018
*/
import java.util.Scanner;
/**.
    * scanner function for taking inputs
*/
import java.lang.Math;
/**.
    * mathematical calculations
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
    public static void main(String[] args) {
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
    * @param base **this is base number**
    * @param exponent **this is exponent value**
    */
    public static float roots(int a, int b, int c)
    {
        double determinant;
        determinant = (b * b) - (4 * a * c);
        double r1;
        double r2;
        r1 = (-b + Math.sqrt(determinant)) / (2*a);
        r2 = (-b - Math.sqrt(determinant)) / (2*a);
        System.out.println(+r1+" "+r2);
        return 0;
    }
}
