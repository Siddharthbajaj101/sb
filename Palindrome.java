import java.util.Scanner;

public class Palindrome
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);  
      System.out.println ("Pls enter your no"); 
      int no = sc.nextInt();
      int temp= no ,rem=0 , rev=0 ;
      while (temp!=0)
      {
        rem = temp%10;
        rev = rev * 10+rem;
        temp = temp/10;
      }
      if (no==rev)
      { 
         System.out.println (no +" is a palindrome no"); 
          
        }
      else 
      {
        
        System.out.println("it is not a palindrome no ");
        
        
        
        }
    
    
    
    
    
    
    
    
    
    
     
    }
}
