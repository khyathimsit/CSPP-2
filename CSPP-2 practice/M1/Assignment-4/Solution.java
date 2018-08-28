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
    public static final float N_U_M_B_E_R = 1.8;
    /**.
        Conversion value
    */
    public static final float N_U_M = 32;
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
        double fahrenheit;
        double degreesCelsius = scan.nextDouble();
        fahrenheit = calculateFromDegreesToFarenheit(degreesCelsius);
        System.out.println(fahrenheit);
    }
    /**
    Need to fill the calculateFromDegreesToFarenheit function and print the
    output of fahrenheit.
    *@return double
    *@param c **celsius value**
    **/
    public static double calculateFromDegreesToFarenheit(final double c) {
        return (c * N_U_M_B_E_R) + N_U_M;
    }
}
