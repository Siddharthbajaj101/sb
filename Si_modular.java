

public class Si_modular
{
    double rate;
    int principal;
    byte time ;
    public void intialize(double r ,int p,byte t)
    {
     rate = r;
     principal = p;
     time = t;
    }
    public double calc ()
    {
        double si = time*principal*rate;
        return si;
    
    
    }
    public void display(double return1)
    {
       System.out.println(return1); 
    }
    public static void main()
    {
        Si_modular obj = new Si_modular();
        obj.intialize(2.5,10000,(byte)125);
        double ans=obj.calc();
        obj.display(ans);
        
        
        
    }
    
}
