

public class Time
{
    int hrs;
    int min;
     public void init(int h ,int m)
    {
        hrs = h;
        min = m;
    }
    public void addTime(Time obj1,Time obj2)
    {
         min = obj1.min+obj2.min;
        int extraHrs=0; 
        if (min>=60)
        {
             extraHrs =min/60;
            min %= 60;
        }
         hrs = obj1.hrs+obj2.hrs+ extraHrs ;
        
    }
    public void display ()
    {
        System.out.println(hrs+"\n"+min);
    }
    public static void main()
     {
       Time t1 = new Time();
       Time t2 = new Time();
       Time t3 = new Time();
       t1.init(2,50);
       t2.init(3,40);
       t3.addTime(t1,t2);
       t3.display();
     }
    }   
