import java.util.Scanner;    
public class PrimeNo
{
    public boolean isPrimeNumber(int no )
    {int ctrl = no/2;
     boolean isPrimeNum = false;
     for (int i = 2 ;i<= ctrl; i++)
     {
         if (no%i ==0 )
         {
             isPrimeNum = true;
             break;
         }
        }
        return isPrimeNum;
        
    }
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        PrimeNo obj = new PrimeNo();
        System.out.println("pls enter the no");
        int userInput = scan.nextInt();
        boolean primeOrNot=obj.isPrimeNumber(userInput);
        if (primeOrNot == false)
        {
            System.out.println ("Yes "+userInput+" is a prime no");
        }
        else 
        {
          System.out.println ("No "+userInput+" is not a prime no");  
        }
    }
}
