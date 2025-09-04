package Stacks;

import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue {
    static class StackQueue
    {
       Queue<Integer> q1=new LinkedList<>();
       Queue<Integer> q2=new LinkedList<>();

       public boolean isEmpty()
       {
        return q1.isEmpty() && q2.isEmpty();
       }

       public void add(int x)
       {
         if(!q1.isEmpty())
         {
            q1.add(x);
         }
         else
         {
            q2.add(x);
         }
       }

       public int remove()
       {
        int top=-1;
        if(isEmpty())
        {
            System.out.println("Empty Stack....");
            return -1;
        }

        if(!q1.isEmpty())
        {
            while (!q1.isEmpty()) {
                top=q1.remove();
                if(q1.isEmpty())
                {
                    break;
                }
                q2.add(top);
            }
        }
        else
        {
            while (!q2.isEmpty()) {
                top=q2.remove();
                if(q2.isEmpty())
                {
                    break;
                }
                q1.add(top);
            }
        }
        printQueue();
        return top;
       }

       public int peek()
       {
            int top=-1;
            if(isEmpty())
            {
                System.out.println("Empty Stack....");
                return top;
            }

            if(!q1.isEmpty())
            {
                while (!q1.isEmpty()) {
                    top=q1.remove();
                    q2.add(top);
                }
            }
            else
            {
                while (!q2.isEmpty()) {
                    top=q2.remove();
                    q1.add(top);
                }
            }
            return top;
       }

       public void printQueue()
       {
        System.out.println("Q1: "+ q1.toString());
        System.out.println("Q2: "+q2.toString());
       }

    }
    public static void main(String[] args) {
        StackQueue s=new StackQueue();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.printQueue();

        while (!s.isEmpty()) {
            System.out.println(s.remove());
        }
    }
}
