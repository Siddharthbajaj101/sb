

public class OverloadingAdd
{
    void  adding ( int num1 , int num2 )
    { 
       int ans = num1 + num2;
       System.out.println(ans);
    }
    void  adding ( double num1 , double num2 )
    { 
       double ans = num1 + num2;
       System.out.println(ans);    
    }
    public static void main ()
    {
      OverloadingAdd obj = new OverloadingAdd();
      obj.adding(4,5);
      obj.adding(2.0,3.0);
    }
}
