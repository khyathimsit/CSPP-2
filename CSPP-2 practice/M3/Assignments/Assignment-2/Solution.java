/**
    * Author : Khyathi.
    * Date : 29/08/2018
*/
import java.util.Scanner;
/**.
    * scanner function for taking inputs
*/
public final class Solution {
    /**.
        *constructor
    */
    private static final int N1 = 7;
    /**.
        Conversion value
    */
    private static final int N2 = 10;
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
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        int cnt = 0;
        for (i = 1; i <= n; i++) {
            int j = i;
            while (j != 0) {
                if (j % N2 == N1) {
                    cnt = cnt + 1;
                }
                j = j / N2;
            }
        }
        System.out.println(cnt);
    }
}
