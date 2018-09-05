/**
 * Author : Khyathi
 */
import java.util.Scanner;
/**
 * Scanner class for taking the inputs
 */

/*
 * In the previous module you have created List ADT.
 * ADTs are developed as reusable libraries
 * i.e., anyone who needs the ADT can use it in their program
 * A program that uses the ADT is called a "client" of the ADT
 * The client typically instantiates an object of the ADT
 * and invokes the public methods on the ADT object.
 *
 * This assignment is to practice the idea of client to the ADT.
 * Client class is Fibonacci and the client needs to use the List ADT
 * to store fibonacci numbers in the List ADT.
 * So, Fibonacci is going to instantiate an object of List ADT
 * generate fibonacci numbers and add them to the list
 * by invoking the add method provided in the List ADT.
 *
 */
/**
 * Class for finding the fibonacci series
 */
public class Fibonacci
{
    /*
     * fib is a static method takes a argument n
     * n is the count of the fibonacci numbers to be generated.
     * The method returns a List with the n fibonacci numbers.
     *
     * Look for the hint.txt if some of the testcases fail.
     */
    /**
     * Fibonacci series function
     *
     * @param      n     no of fibonnaci 
     *
     * @return     list
     */
    public static List fib(final int n) {
        // todo - complete this method
        // int n1 = 0;
        // int n2 = 1;
        // for(int i = 1; i <= n; i++) {
        // 	int n3 = n1 + n2;
        // 	n1 = n2;
        // 	n2 = n3;
        List fib = new List(n);
        fib.add(0);
        fib.add(1);
        for (int i = 2; i < n; i++) {
        	int fib1 = fib.get(i - 1) + fib.get(i - 2);
        	fib.add(fib1);
        }
        return fib;
    }
    /**
     * Main function
     *
     * @param      args  The arguments
     */
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //List fib = new List();
        System.out.println(fib(n));
    }
}
