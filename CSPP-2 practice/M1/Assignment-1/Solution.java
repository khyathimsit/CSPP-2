/**
    * Author : Khyathi.
    * Date : 27/08/2018
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
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int rnum = sc.nextInt();
        System.out.println("Name :" + name + " Roll Number : " + rnum);
    }
}
