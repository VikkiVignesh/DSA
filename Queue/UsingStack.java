package Queue;

import java.util.Stack;

public class UsingStack {
    static class QueueStack
    {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        public boolean isEmpty()
        {
            return s1.isEmpty();
        }
        public void add(int x)
        {
            if(s1.isEmpty())
            {
                s1.push(x);
            }
            else{
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                s1.push(x);
                while (!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            }
        }
        public int remove()
        {
            return s1.pop();
        }
        public int peek()
        {
            return s1.peek();
        }
    }
    public static void main(String[] args) {
       QueueStack q=new QueueStack();

       q.add(10);
       q.add(20);
       q.add(30);
       q.add(40);
       q.add(50);
       q.remove();
       q.remove();

       while (!q.isEmpty()) {
        System.out.println(q.remove());
       }
    }
}
