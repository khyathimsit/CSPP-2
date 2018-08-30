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
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
           array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < n; i++) {
         if (max < array[i]) {
            max = array[i];
         }
        }
        System.out.println(max);
    }
}
