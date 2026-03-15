package Threads_Concepts.Examples;
class Hi extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class Hello implements Runnable
{
 public void run()
   {
    for(int i=0;i<5;i++)
    {
       System.out.println("Hello");
    try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
    }
   }
}

public class ThreadsEx {
    public static void main(String[] args) {
        Hi h=new Hi();
        Hello he=new Hello();
        Thread t1=new Thread(he);
        h.start();
        t1.start();
    }
}
