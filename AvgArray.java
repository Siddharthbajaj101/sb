import java.util.* ;  
public class AvgArray
{
   int ar [] ;
   int limit ;
   int avg = 0;
   
   public void input()
   { 
     Scanner scan = new Scanner(System.in);
     System.out.println("Pls enter the no of elements");   
     limit = scan.nextInt();
     ar = new int[limit];
     int j ;
     for (int i =  0 ; i < limit ; i++)
     
     { j = i+1;
         System.out.println("Pls enter the "+ j + " element" );
       ar[i] = scan.nextInt() ;  
     }
   }
   public void calc ()
   {
    for(int i = 0 ; i < limit ; i++ )
     avg += ar[i];
    
    avg /= limit;
   }
   public void display ()
   {
    System.out.println("the average is "+avg);
   }
   public static void main()
   {
     AvgArray obj = new AvgArray() ;
     obj.input();
     obj.calc();
     obj.display();
   }
} 