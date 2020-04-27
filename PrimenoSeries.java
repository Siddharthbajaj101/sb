import java.util.Scanner;
public class PrimenoSeries
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("pls enter the ranges max no");        
        int range = scan.nextInt();
        System.out.println("pls enter the ranges max no");            
        PrimeNo obj = new PrimeNo();
        boolean isPrime = false;
        for (int i = 1; i<=range;i++)
        {
          isPrime = obj.isPrimeNumber(i);
          if (isPrime == false)
          {
            System.out.println(i);
            }
            
        }
    }
}
