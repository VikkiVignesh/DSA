package Threads_Concepts.Examples;


class Q
{
    int num;
    boolean valueSet=false;

    public synchronized void getNum() {
        while (!valueSet) {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("Get Value:" + num);
        valueSet=false;
        notify();
    }

    public synchronized void setNum(int num) {
        while (valueSet) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println("Put Number:"+num);
        this.num = num;
        valueSet=true;
        notify();
    }
}


class Producer implements Runnable
{
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t=new Thread(this,"Producer");
        t.start();
    }

    public void run()
    {
        int i=0;
        while (true) {
            q.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class Consumer implements Runnable
{
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }

    public void run()
    {
        while (true) {
            q.getNum();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

public class InterprocessCom {
    public static void main(String[] args) {
        Q q=new Q();
        new Producer(q);
        new Consumer(q);

    }  
}
