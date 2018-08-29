
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
       int gcd_val = 0;
       for(int i=1;i<=a&&i<=b;i++)
       {
        if(a%i==0&&b%i==0)
        {
            gcd_val=i;
        }
       }
       return gcd_val;
    }
}
