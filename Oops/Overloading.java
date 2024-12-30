package Oops;
public class Overloading 
{
    public static void main(String[] args) {
         demo obj=new demo();

         System.out.println(obj.add(10,20));
         System.out.println(obj.add(10.3f,20.89f));
         System.out.println(obj.add(10,20,30));
         System.out.println(obj.add(10.3,20.80));
         System.out.println(obj.add("Free","Fire"));
    }
}

class demo
{
    int add(int a,int b)
    {
     return a+b;
    }
    int add(int a,int b,int c)
    {
      return a+b+c;
    }

    float add(float a,float b)
    {
       return a+b;
    }
    double add(double x,double y)
    {
        return x+y;
    }
    String add(String s1,String s2)
    {
        return s1+s2;
    }
}