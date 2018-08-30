/**
    * Author : Khyathi.
    * Date : 29/08/2018
*/
// Given an String, Write a java method that returns the decimal value for the given binary string.
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++){
            String s = sc.nextLine();
            long res = binaryToDecimal(s);//Write binaryToDecimal function
            System.out.println(res);
        }
    }
    /**
     * { function_description }
     *
     * @param      str   The string
     *
     * @return int {sum }
     */
    public static long binaryToDecimal(final String str) {
        int len = str.length();
        int sum = 0;
        int j = 0;
        for (int i = len - 1; i >= 0; i--) {
            sum += Character.getNumericValue(str.charAt(i)) * (Math.pow(2, j));
            j++;
        }
        return sum;
    }
}
