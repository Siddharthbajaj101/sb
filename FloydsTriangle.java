import java.util.Scanner;
public class FloydsTriangle 
{
    public static void main(String args [])
    {
      Scanner scan = new Scanner(System.in);  
       System.out.println("Please enter the number of rows ") ;
       int range = scan.nextInt();
       int k=1 ;
       for( int i=1;i <= range ; i++)
       {
           for (int j = 1 ; j<= i; j++,k++ )
           {
               System.out.print(k+"");
            }
             System.out.println();
            }
        }
    }
        