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
        float result;
        Scanner scan = new Scanner(System.in);
        float base = scan.nextInt();
        float height = scan.nextInt();
        result = areaOfTriangle(base, height);
        System.out.println(result);
    }
    /**.
    Need to find the areaOfTriangle function
    *@return float
    * @param b **this is the height of the triangle**
    * @param h **this is the base**
    */
    public static float areaOfTriangle(final float b, final float h) {
        return (b * h) / 2;
    }
}
