package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void Reverse(Queue<Integer>q)
    {
        Stack<Integer> s=new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=10;i++)
        {
            q.add(i);
        }
        printQueue(q);
        Reverse(q);

        System.out.println("After Reversing");
        printQueue(q);
    } 
    
    public static void printQueue(Queue<Integer>q)
    {
        while (!q.isEmpty()) {
        System.out.print(q.remove()+" ");
       }
       System.out.println();
    }
}
