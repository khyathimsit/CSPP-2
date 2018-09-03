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
    private String data;
    /**.
     * here data given is string
     */
    private final int length;
    /**.
     * length of the data
     */
    InputValidator(String data, int len) {
    
    this.data = data;
    this.length = len;
    }
    /**.
     * to check the length of the input
     *
     * @param      length  The length
     *
     * @return     true or false
     */
    public static boolean validateData(int length) {
        if (length >= 6) {
            return true;
        } else {
            return false;
        }
    }
}
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
        int length = input.length();
        InputValidator i = new InputValidator(input, length);
        System.out.println(i.validateData(length));
    }
}
