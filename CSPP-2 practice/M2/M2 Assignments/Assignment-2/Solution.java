import java.util.Scanner;
import java.lang.Math;

public class Solution {
    /*
    Do not modify this main function.
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // float res;
        rootsOfQuadraticEquation(a, b, c);
        //System.out.println(res);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
    public static float rootsOfQuadraticEquation(int a, int b, int c)
    {
        double determinant;
        determinant = (b * b) - (4 * a * c);
        double r1;
        double r2;
        r1 = (-b+Math.sqrt(determinant))/(2*a);
        r2 = (-b-Math.sqrt(determinant))/(2*a);
        System.out.println(+r1+" "+r2);
        return 0;
    }
}
