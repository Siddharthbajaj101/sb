

public class Circle
{
    double radius ;
    double pi = 3.14;
   public void init (double r)
   {
       
       radius = r;
       
    
}
public double calc()
{
    double ans  = pi*radius*radius; // calculating area
    return ans;


}
public static void main ()
{
    Circle obj = new Circle();
    obj.init(10.5);
    double display = obj.calc();
    System.out.println(display);
}
}
    
