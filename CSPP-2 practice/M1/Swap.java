import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
	     Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
	     int b = sc.nextInt();
	     int temp;
	     temp = a;
	     a = b;
	     b = temp;
	     System.out.println("Value of a is:" +a+ "Value of b is:" +b);	
	    // a = a ^ b;
	    // b = a ^ b;
	    // a = a ^ b;
	    // System.out.println(a + " " + b)

	 }
}