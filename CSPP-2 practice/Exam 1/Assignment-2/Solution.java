import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author :Khyathi
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private static final int NUM1 = 50;
    /**.
        Conversion value
    */
    private static final int NUM2 = 150;
    /**.
        Conversion value
    */
    private static final int NUM3 = 250;
    /**.
        Conversion value
    */
    private static final int NUM4 = 350;
    /**.
        Conversion value
    */
    private static final int NUM5 = 450;
    /**.
        Conversion value
    */
    private static final int NUM6 = 500;
    /**.
        Conversion value
    */
    private static final int HUNDRED = 100;
    /**.
        Conversion value
    */
    private static final int TWOHUNDRED = 200;
    /**.
        Conversion value
    */
    private static final int THREEHUNDRED = 300;
    /**.
        Conversion value
    */
    private static final int FOURHUNDRED = 400;
    /**.
        Conversion value
    */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a,
        final int rows, final int columns) {

    // write ypur code here
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (a[i][j] >= 0 && a[i][j] < NUM1) {
                    a[i][j] = 0;
                } else if (a[i][j] >= NUM1 && a[i][j] < NUM2) {
                    a[i][j] = HUNDRED;
                } else if (a[i][j] >= NUM2 && a[i][j] < NUM3) {
                    a[i][j] = TWOHUNDRED;
                } else if (a[i][j] >= NUM3 && a[i][j] < NUM4) {
                    a[i][j] = THREEHUNDRED;
                } else if (a[i][j] >= NUM4 && a[i][j] < NUM5) {
                    a[i][j] = FOURHUNDRED;
                } else {
                    a[i][j] = NUM6;
                }

            }
        }
        return a;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
