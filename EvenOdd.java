import java.util.Scanner ;
public class EvenOdd
{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in ) ;
        System.out.println("pls enter your no ");
        int no = scan.nextInt();
        if(no%2==0)
        {
         System.out.println("even");   
        }
        else
        {
            System.out.println("odd");
        }
    }
}
       