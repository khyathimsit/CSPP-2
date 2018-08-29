
import java.util.Scanner;
/*
    Do not modify this main function.
    */
public class Solution {

    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int x = gcd(n1,n2);
        System.out.println(x);
    }
    /*
    Need to write the gcd function and print the output.
    */
    public static int gcd(final int a, final int b) {
        int c, d;
       while (b != 0) {
        if (a > b) {
            c = a - b;
        } else {
            d = b - a;
        }
       }
       return a;
    }
}
