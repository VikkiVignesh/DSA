package Stacks;

import java.util.LinkedList;

public class UsingLinkedList {

    static class Node
        {
            int data;
            Node link;

            public Node(int x)
            {
                this.data=x;
                this.link=null;
            }
        }

    static class StackLL
    {

        static Node head;
        static Node tail;
        static int size;
        

        public boolean isEmpty()
        {
            return head ==null;
        }

        public void push(int a)
        {
            Node node=new Node(a);

            if(head==null)
            {
                head=node;
                return;
            }

            node.link=head;
            head=node;
        }

        public void pop()
        {
            if(isEmpty())
            {
               System.out.println("Empty Stack....");
               return;
            }
           // System.out.println(head.data+" reomved from the stack.");
            head=head.link;
        }

        public int peek()
        {
            return head.data;
        }      

    }
    public static void main(String[] args) {
        
        StackLL sl=new StackLL();

        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.push(4);
        while (!sl.isEmpty()) {
            System.out.println(sl.peek());
            sl.pop();
        }
    }
}
