import java.util.Scanner;
public class Swap
{
    
  public static void main (String args[])
  { 
      Scanner sc = new Scanner (System.in);
      System.out.println("pls enter your first no");
      int a = sc.nextInt();       
      Scanner scan = new Scanner (System.in);
      System.out.println("pls enter your Second no");
      int b = scan.nextInt();
       a = a+b;
       b= a-b ;
       a = a-b ;
       System.out.println("a : "+a);
       System.out.println("b : "+b);




      





  }
}