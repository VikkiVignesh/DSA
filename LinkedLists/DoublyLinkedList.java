package LinkedLists;

public class DoublyLinkedList {

    public static class Node
    {
        int data;
        Node prev;
        Node next;

        public Node(int d)
        {
            this.data=d;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node Head;
    public static Node Tail;

    public static int size;


    public void F_PrintDLL()
    {
        if(size<1)
        {
            System.out.println("Empty List !!");
            return;
        }
        Node temp=Head;
        while (temp!=null) {
            if(temp.next == null)
            {
             System.out.println(temp.data+" <-> null");
             return;
            }
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void R_PrintDLL()
    {
        if(size<1)
        {
            System.out.println("Empty List !!");
            return;
        }
        Node temp=Tail;
        while (temp!=null) {
            if(temp.prev==null)
            {
              System.out.println(temp.data+" <-> null");
              return;
            }
            System.out.print(temp.data+" <-> ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public void addFirst(int d)
    {
        Node node=new Node(d);
        if(Head==null)
        {
            Head=Tail=node;
            System.out.println("Node "+ d+ " Added to the List !!");
            return;
        }

        node.next=Head;
        Head.prev=node;
        Head=node;
        System.out.println("Node "+ d+ " Added to the List !!");
        size++;
    }


    public void addLast(int d)
    {
        Node node=new Node(d);
        if(Head==null)
        {
            Head=Tail=node;
            System.out.println("Node "+ d+ " Added to the List !!");
            return;
        }

        Tail.next=node;
        node.prev=Tail;
        Tail=node;
        System.out.println("Node "+ d+ " Added to the List !!");
        size++;
    }

    public int RemoveFirst()
    {
        if(Head==null)
        {
            System.out.println("List is Empty Operation Failed !!");
            return -1;
        }
        int data=0;
        if(size==1)
        {
            data=Head.data;
            Head=null;
            System.out.println(data+" Removed from the List !!");
            return data;
        }
        data=Head.data;
        Head=Head.next;
        Head.prev=null;
        System.out.println(data+" Removed from teh List !!");
        size--;
        return data;
    }

    public int RemoveLast()
    {
        if(Head==null)
        {
            System.out.println("List is Empty Operation Failed !!");
            return -1;
        }
        int data=0;
        if(size==1)
        {
            data=Head.data;
            Head=null;
            System.out.println(data+" Removed from teh List !!");
            return data;
        }

        data=Tail.data;
        Tail=Tail.prev;
        Tail.next=null;
        System.out.println(data+" Removed from teh List !!");
        size--;
        return data;
    }


    public void Reverse_DLL()
    {
        Node prev=null;
        Node curr=Head;
        Node next;
    
        while(curr!=null)
        {
         next=curr.next; 
         curr.next=prev;  
         curr.prev=next;

         prev=curr;
         curr=next;
        }
        Head=prev;
    }
    public static void main(String[] args) {
        DoublyLinkedList DLL=new DoublyLinkedList();

        DLL.addFirst(10);
        DLL.addFirst(20);
        DLL.addFirst(30);
        DLL.addFirst(40);
        DLL.addFirst(50);
        
        System.out.println("Size : "+size );

        DLL.addLast(100);
        DLL.addLast(200);
        DLL.addLast(300);
        DLL.addLast(400);

        System.out.println("Size : "+size );

        DLL.F_PrintDLL();
        DLL.R_PrintDLL();


        DLL.RemoveFirst();
        DLL.RemoveFirst();

        DLL.F_PrintDLL();
        DLL.R_PrintDLL();

        System.out.println("Size : "+size );
        DLL.RemoveLast();
        DLL.RemoveLast();

        System.out.println("Size : "+size );
        DLL.F_PrintDLL();
        DLL.R_PrintDLL();

        DLL.Reverse_DLL();

        DLL.F_PrintDLL();
        DLL.R_PrintDLL();
        
        
        
    }
}
