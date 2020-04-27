
import java.util.Scanner;
public class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter the no");
        int no = sc.nextInt();
        int temp = no, count=0;
        
        
        
        
        while(temp!=0) 
        {
           temp=temp / 10;  
           count++; 
        }
        int temp2 = no ,rem , ans = 0 ,mul= 1; 
            while (temp2!=0)   
           {
               rem = temp2%10;
              
               for (int  i = 1 ; i <= count ; i++)
               {
                    
                mul = mul * rem ;
                } 
                ans = ans + mul ; 
               temp2 = temp2/10;
            
            
            
            }
            if (ans == no )
            
            { 
                System.out.println(no + " is armstrong");
            }
            else
            {
              System.out.println(no + " is not armstrong");
            }
            
            
          
        
            
            
        
           
        
         
    
    
    
    
    
    
    
    
      }
}