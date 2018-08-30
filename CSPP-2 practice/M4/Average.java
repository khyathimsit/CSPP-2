import java.util.Scanner;
class Average 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum = 0;
        int[] array = new int[n];
        for(int i=0;i<n;i++)
        {
           array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum = sum+array[i];
        }
        double average = sum/array.length;
        System.out.println(average); 
    }
}