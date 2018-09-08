/**.
 * Creates a input stream
 */
import java.io.BufferedInputStream;
/**.
 * Scanner class for taking the input
 */
import java.util.Scanner;
/**.
 * for array operations
 */
import java.util.Arrays;

/**
 * Class for set.
 * @author : 
 */
class Set {
    /**.
     * Array declaration
     */
    public int[] intArray;
    /**.
     * Set decalaration
     */
    public Set[] set;
    /**
     * Size
     */
    public int size;
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        set = new Set[10];
    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**.
     * Size function
     *
     * @return  int(size)
     */
    public int size() {
        return size;
    }
    /**.
     * FUnction to find the item is in list or not
     *
     * @param      item  The item
     *
     * @return     true or false
     */
    public boolean contains(final int item) {
        return indexOf(item) > -1;
    }
    /**.
     * Searches for the first match.
     *
     * @param      item  The item
     *
     * @return     index of the required item
     */
    public int indexOf(final int item) {
        for (int i = 0; i < size; i++) {
            if (item == intArray[i]) {
                return i;
            }
        }
        return -1;
    }
    /**.
     * get function
     *
     * @param      index  The index
     *
     * @return     value at the specified index.
     */
    public int get(final int index) {
        if (index < 0 && index >= size) {
            return -1;
        } else {
            return intArray[index];
        }
    }

    public String toString() {
        if (size == 0) {
            return "{}";
        }
        String str = "{";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            str = str + intArray[i] + ",";
        }
        str = str + intArray[i] + "}";
        return str;
    }

    public void add(final int item) {
        intArray[size] = item;
        size += 1;
    }
     
    public void addAll(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

    public Set intersection(final set[] s) {
        for (int i = 0; i < s.length; i++) {
            if (intArray[i] == s[i]) {
                intersection.add(this.get(i));
            }
        }
        return intersection;
    }

    public Set retainAll(final set[] s) {
        for (int i = 0; i < s.length; i++) {
            if (intArray[i] == s[i]) {
                retainAll.add(this.get(i));
            }
        }
        return retainAll;
    }
    
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                    s.add(Integer.parseInt(tokens[1]));
                break;
                case "addAll":
                    if (tokens.length == 2) {
                        String[] t1 = tokens[1].split(",");
                        int[] temp = new int[t1.length];
                        for (int i = 0; i < temp.length; i++) {
                            temp[i] = Integer.parseInt(t1[i]);
                        }
                        s.addAll(temp);
                    }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
