
import java.util.Scanner;
public class Calculator
{
  public static void main(String args[])
  {  
      Scanner sc = new Scanner(System.in);
      System.out.println("pls enter the first no (it should be an integer)");
      int a = sc.nextInt();
    
      System.out.println("pls enter the second no (it should be an integer)");
      int b = sc.nextInt();
    
      Scanner opr = new Scanner(System.in);
      System.out.println("pls enter the operation to perform (it should be an character)");
      String operation = opr.nextLine();
    
      if("/".equals(operation)){
      while (b==0)
       { 
        System.out.println("pls enter a non zero value as the second no");
        
      System.out.println("pls enter the second no (it should be an integer)");
        b = sc.nextInt();
        
        }
    }
        
     double ans;
     switch(operation)
     {
       case "+":
       ans = a+b;
       System.out.println ("the answer is "+ans);
       
       break;
       case "-":
       ans = a-b;
       System.out.println ("the answer is "+ans);
       
       break;
       case "x":
       case "*":
       ans = a*b;
       System.out.println ("the answer is "+ans);
       
       break;
       case "/":
          
           
       ans = a/b;
       System.out.println ("the answer is "+ans);
       
       break;
       case "%":
       ans = a%b;
       System.out.println ("the answer is "+ans);
       
       break;
       case "^":
       ans = Math.pow(a,b);
       System.out.println ("the answer is "+ans);
       
       break;
       default:
       System.out.println ("the chracter is invalid");
       break;
    














     }
    
  }
  
}