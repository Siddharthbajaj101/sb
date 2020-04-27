

public class ComputeVol
{
  public void Addvol(Box v1,Cylinder v2 ) 
  {
    
     double totalvol = v1.vol + v2.vol ;
     
     System.out.println("volume of box " + v1.vol);
      
     System.out.println("volume of cylinder " + v2.vol);
     
     System.out.println("total volume"   + totalvol);
      
      
     }
    
    public static void main (String args[])
    {
        Box box = new Box();
        box.input(20.0,30.1,40.2);
        Cylinder cylinder = new Cylinder();
        cylinder.input(15.9,20.20);
        
        ComputeVol input = new ComputeVol();
        input.Addvol(box,cylinder);
        
        
        
        
        
        
        
        
        
        
        
    }
   
}
