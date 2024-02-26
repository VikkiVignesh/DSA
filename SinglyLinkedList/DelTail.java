
import java.util.*;

class Node
{
    int data;
    Node link;

    Node(int a)
    {
        data=a;
        link=null;
    }
    Node(int a,Node x)
    {
        data=a;
        link=x;
    }
}
public class DelTail {

    private static void printList(Node hNode)
    {
        Node temp=hNode;
        if(hNode==null)
        {
            System.out.println("Empty List");
            return;
        }
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.link;
        }
    }

    private static Node deltail(Node hNode)
    {
        Node temp=hNode;
        if(hNode==null || hNode.link==null)
        {
            System.out.println("Empty List");
            return null;
        }
        while(temp.link.link!=null)
        {
            temp=temp.link;
        }
        temp.link=null;
        return hNode;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.link=new Node(20);
        head.link.link=new Node(30);
        head.link.link.link=new Node(40);
        System.out.println("________Linked List__________");
        printList(head);
        System.out.println("Deleted Tail");
        head=deltail(head);
        printList(head);
        
    }
}
