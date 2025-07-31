package Queue;

public class UsingLl {

    static class Node
    {
        int data;
        Node link;

        Node(int d)
        {
            this.data=d;
            this.link=null;
        }
    }

    static class Queuell
    {
        Node head;
        Node tail;
        public void addLast(int d)
        {
            Node node =new Node(d);
            if(head==null)
            {
                tail=head=node;
                return;
            }
            tail.link=node;
            tail=node;
        }

        public int remove()
        {
            if(head==null)
            {
                return -1;
            }
            int data=head.data;
            head=head.link;
            return data;
        }
        public int peek()
        {
            if(head==null)
            {
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty()
        {
            return head==null;
        }
    }
    public static void main(String[] args) {
        Queuell q=new Queuell();
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
        q.addLast(4);
        q.remove();
        q.remove();
        q.remove();
        q.addLast(50);
        q.remove();
        q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
