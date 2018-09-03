/**
    * Author : Khyathi.
    * Date : 3/09/2018
*/
import java.util.Scanner;
/**.
    * scanner function for taking inputs
*/
class InputValidator {
    /*Write the atrributes and methods for InputValidator*/
    /**.
     * Input validator class
     */
    private String data;
    /**.
     * here data given is string
     */
    /**
     * Constructs the object.
     *
     * @param      name  The data
     */
    InputValidator(final String name) {
    this.data = name;
    }
    private static final int NUM = 6;
    /**.
     * conversion value
     */
    /**.
     * to check the length of the input
     *
     * @param      input  The length
     *
     * @return     true or false
     */
    public static boolean validateData(final String input) {
        return input.length() >= NUM;
    }
}
/**.
 * class
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
        Scanner s = new Scanner(System.in);
        String input = s.next();
        //int length = input.length();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData(input));
    }
}
