package Oops;

import java.io.*;
import java.util.*;
import java.lang.*;
public class AcessSpec {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();   
        a.set(10);
        //System.out.println("Direct Access of private menber outsid ethe class, value of a"+a.a); 
        System.out.println("Accessing data via getters"+a.get());
        System.out.println("Accessing Protected Value "+b.b);
        System.out.println("Accessing Default Value "+c.c);
    }
}

class A
{
  private int a;

  void set(int s)
  {
    a=s;
  }

  int get()
  {
    return a;
  }
}

class B extends A
{
  protected int b=30;
  
}
class C extends B
{
  int c=60;
 
}
