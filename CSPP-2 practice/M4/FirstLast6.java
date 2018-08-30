import java.util.Scanner;
class FirstLast6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] number = new int[n];
        for(int i=0;i<n;i++)
        {
           number[i]=sc.nextInt();
        }
        // System.out.println(number[0]);
        if (number[0] == 6 || number[number.length-1] == 6)
        {
            System.out.println("true");
            // return 0;
        } 
        else 
        {
            System.out.println("false");
            // return 0;
        }
    }
}