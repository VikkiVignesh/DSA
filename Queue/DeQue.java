package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DeQue {

    static class DeStack
    {
        Deque<Integer> q=new LinkedList<>();

        public boolean isEmpty()
        {
            return q.isEmpty();
        }

        public void push(int x)
        {
            q.add(x);
        }

        public int pop()
        {
            return q.removeLast();
        }

        public int peek()
        {
            return q.getLast();
        }
    }

    static class Dequeue
    {
        Deque<Integer> q=new LinkedList<>();

        public boolean isEmpty()
        {
            return q.isEmpty();
        }

        public void add(int x)
        {
            q.addLast(x);
        }

        public int peek()
        {
            return q.getFirst();
        }

        public int remove()
        {
            return q.removeFirst();
        }
    }
    public static void main(String[] args) {
        
        DeStack stack=new DeStack();
        Dequeue queue=new Dequeue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
        System.out.println();

        while (!queue.isEmpty()) {
            System.out.print(queue.remove()+" ");
        }
    }
}
