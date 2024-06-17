package SinglyLinkedList;

public class SinglyLL {
    
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
    Node head=null;

    void addFirst(int d)
    {
        Node node=new Node(d);
        if(head==null)
        {
            System.out.println("List is Empty... so made Newnode as head");
            head=node;
            return;
        }
        node.link=head;
        head=node;
        System.out.println("Node Added At Beginning");
    }


    void addLast(int d)
    {
        Node node=new Node(d);
        if(head==null)
        {
            System.out.println("List is Empty... so made Newnode as head");
            head=node;
            return;
        }
        Node curr=head;
        while(curr!=null)
        {
            curr=curr.link;
        }
        curr.link=node;
    }


    public void printList(Node head)
    {
        Node curr=head;
        if(head==null)
        {
            System.out.println("List is Empty!!....");
            return;
        }
        System.out.println("Printing Linked List");
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.link;
        }
    }

    public static void main(String[] args) {
        SinglyLL Sll=new SinglyLL();

       /*  Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(40);
        Node n5=new Node(50);
        Sll.head=n1;
        n1.link=n2;
        n2.link=n3;
        n3.link=n4;
        n4.link=n5;*/

        Sll.printList(Sll.head);

        /*while(true)
        {
            System.out.println("_____Welcome to Linked List Operations_____");
            System.out.println("1.Displaying Linked List");
            System.out.println("2.Adding Node At First");
            System.out.println("3.Adding Node At Last");
        }*/
 
    }
}
