import java.util.Scanner;
public class OverloadingShapes
{
    double area ;
    void area(int s)
    {
         area = s*s;
        System.out.println(area);
    }
    void area (double r )
    {
        float pi = 3.14f ;
         area = pi*r*r;
         System.out.println(area);
    }
    void area (int l,int b )
    {
        area = l*b;
        System.out.println(area);
    }
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the name of the shapes");
        String input = scan.next();
        OverloadingShapes obj = new OverloadingShapes();
        if("square".equalsIgnoreCase(input)) 
        {
            System.out.println("pls enter the side (integers only )");
            int side = scan.nextInt();
            obj.area(side);
        }
        else if("circle".equalsIgnoreCase(input))
        {
          System.out.println("pls enter the radius (decimals only )");
            double radius = scan.nextDouble();
            obj.area(radius);
        }
        else if ("rectangle".equalsIgnoreCase(input))
        {
         System.out.println("pls enter the dimensions (integers  only )");
           int length = scan.nextInt();
           int breadth = scan.nextInt();
            
            obj.area(length,breadth);   
        }
     }
 }