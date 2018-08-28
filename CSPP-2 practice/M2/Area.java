import java.util.Scanner;
public class Area 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int radii = sc.nextInt();
		double result;
		result = area(radii);
		System.out.println(result);
	}
	public static double area(int r)
	{
		double a;
        a = pi() * r * r;
        return a;
	}
	public static double pi()
	{
		return 3.14;
	}
}