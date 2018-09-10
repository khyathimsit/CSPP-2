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
    /**
     * This constant is used to create an array
     * with the initial capacity.
     */
    public static final int TEN = 10;
    /**.
     * Set decalaration
     */
    public int[] set;
    /**
     * Size
     */
    public int size;
    public Set() {
        set = new int[10];
        size = 0;
    }
    /**
     * Function to add all the elements into the set
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (size == set.length) {
            resize();
        }
        if (!contains(item)) {
            set[size++] = item;
        }
    }
    /**
     * Function to resize the set by double.
     */
    private void resize() {
        set = Arrays.copyOf(set, size * 2);
    }
    /**
     * adds all the elements of the array to the set
     *
     * @param      arr   The arr
     */
    public void add(final int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }
    /**
     * Function to find yhe intersection of two sets
     *
     * @param  other  { parameter_description }
     *
     * @return   the result that contains the common
     * elements of the two sets.
     */
    public Set intersection(Set other) {
        Set result = new Set();
        for (int i = 0; i < this.size; i++) {
            if (other.contains(this.get(i))) {
                result.add(this.get(i));
            }
        }
        return result;
    }
    /**
     * retains all the elements from the set.
     *
     * @param      arr   The arr
     *
     * @return the set that contains all the elements
     * of this set.
     */
    public Set retainAll(final int[] arr) {
        Set result1 = new Set();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == set[i]) {
                    result1.add(set[i]);
                }
            }
            
        }
        return result1;
    }
    /**
     * Function to find out the cartesian product of two sets.
     *
     * @param      other  The other
     *
     * @return   product in the form of 2D array.
     */
    public int[][] cartesianProduct(final Set other) {
        int [][] result = new int[this.size() * other.size()][2];
        int k = 0;
        if (this.size() == 0 || other.size() == 0) {
            return null;
        }
        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < other.size(); j++) {
                result[k][0] = this.get(i);
                result[k][1] = other.get(j);
            }
        }
        return result;
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
     * Function to find the item is in list or not
     *
     * @param      item  The item
     *
     * @return     true or false
     */
    public boolean contains(final int item) {
        return indexOf(item) != -1;
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
            if (item == set[i]) {
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
        if (index < 0 && index >= this.size()) {
            return -1;
        } else {
            return set[index];
        }
    }
    /**
     * String version of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size == 0) {
            return "{}";
        }
        String str = "{";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            str = str + set[i] + ",";
        }
        str = str + set[i] + "}";
        return str.toString();
    }

}
/**
 * Solution class for code-eval.
 */
public final class Solution {
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
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
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

    
    
    
    
    