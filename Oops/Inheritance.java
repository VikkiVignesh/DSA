package Oops;

public class Inheritance {
    
    public static void main(String[] args) 
    {
        A signleInher=new A();
    mulB multilevel=new mulB();
    ha hir1=new ha();
    hb hir2=new hb();
    mulplieInheritance mulinher=new mulplieInheritance();
    signleInher.pare();


    System.out.println("Multilevel Inheritance"+multilevel.s1);


    System.out.println("Hirearchal Inheritance");
    System.out.println(hir1.hirvar);
    System.out.println(hir2.hirvar);

    mulinher.methodA();
    mulinher.methodB();
   }
    
    
}


class SingleInheritance
{
   int a=20;
   String str="vikki";

   void pare()
   {
    System.out.println("SingleInheritnace Method");
   }
}
class A extends SingleInheritance
{
  float b=12.3f;

  void display()
  {
    System.out.print("Method from Class A");
  }
}



class MultipleInheritance
{
  int b=20;
  String s1="MultipleInheritance";
}
class mulA extends MultipleInheritance
{
 float c=23.4f;
}
class mulB extends mulA
{
  double d=20.78;
}


class Hirearchal
{
    int hirvar=100;
}
class ha extends Hirearchal
{
 String s1="Class 1";
}
class hb extends Hirearchal
{
  String s2="Class 2";
}



//Multiple Inheritance
interface interfaceA
{
   void methodA();
  
}
interface interfaceB
{
      void methodB();
}

 class mulplieInheritance implements interfaceA, interfaceB 
{
  public void methodA()
  {
    System.out.println("Interface A");
  }
  public void methodB()
  {
    System.out.println("Method B");
  }
}