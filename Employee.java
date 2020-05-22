import java.util.Scanner;
public class Employee
{
 String name ; 
 float salary ;
 public void hra (int sum)
 {
    salary = sum ; 
    salary *= 1.5;
    System.out.println ("the salary is : "+salary);
    
    }
 public void setName(String name)
 {
    
   this.name = name ;  
    
    System.out.println ("the name is : "+this.name);
    
    
 }
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in) ;
   System.out.println("pls  enter the base salary"); 
   int no = sc.nextInt();
   Scanner scan = new Scanner(System.in);
   System.out.println("pls  enter the name"); 
   String name = scan.nextLine();
    Employee employee1 = new Employee() ; 
    employee1.hra(no);
    employee1.setName(name);
 }
 
}
