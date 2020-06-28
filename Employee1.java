

public class Employee1
{
  int pan;
  String name;
  double tax_income;
  double tax;
  public void input(int p,String n,double ti)
  {
      pan = p;
      name=n;
      tax_income=ti;
      
  }
  public void  calc ()
  {
      if (tax_income<=100000)
      {
          tax=0.0;
      }
      else if(tax_income>100000&&tax_income<=150000)
      {
          tax = 0.1*tax_income;
      }
      
      else if(tax_income>150000&&tax_income<=250000)
      {
          tax = 0.2*tax_income+5000;
      }
      else 
      {
          tax = 0.3*tax_income+25000;
      }
      
      
    }     
    public void display()
    {
        System.out.println("Pan\tName\tTax Income\tTax");
        System.out.println(pan+"\t"+name+"\t"+tax_income +"\t"+ tax);     
    }
} 
