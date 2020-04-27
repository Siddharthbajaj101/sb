import java.util.Scanner ;
public class test
{
    public static void main(String args[])
  { 
       Scanner scan= new Scanner(System.in ) ;
       System.out.println("pls enter your character ");
        char character1 = scan.next().charAt(0) ;
        Scanner scan2= new Scanner(System.in ) ;
       System.out.println("pls enter your second character ");
        char character2 = scan2.next().charAt(0) ;
        int no1 = character1;
        int no2 = character2;
        int no3 = no1 + no2 ;
        char character3= (char) no3 ;
        System.out.println("your character"+character3);
    }
}