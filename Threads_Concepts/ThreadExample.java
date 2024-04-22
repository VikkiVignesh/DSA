package Threads_Concepts;

import java.lang.Thread;

class ThreadA extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Negative Numbers "+ (-1*i));
        }
        System.out.println("Thread A Terminal");
    }
}

class ThreadB extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Even Numbers "+ (2*i));
        }
        System.out.println("Thread B Terminal");
    }
}


class ThreadC extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Odd Numbers "+ (2*i-1));
        }
        System.out.println("Thread C Terminal");
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        ThreadA A=new ThreadA();
        ThreadB B=new ThreadB();
        ThreadC C=new ThreadC();
         
        A.start();
        A.setPriority(10);
        B.start();
        B.setPriority(3);
        C.start();
        C.setPriority(9);
    }
}
