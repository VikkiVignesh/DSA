
import java.util.*;
class Node {
    int data;
    Node link;

    Node(int x)
    {
      data=x;
      link=null;
    }
    Node(int x,Node pt)
    {
      data=x;
      link=pt;
    }
      
  }
public class DelheadNode {
    private static Node delhead(Node head)
    {
        if(head==null || head.link==null )
          return null;
        return head.link;
    }

    private static void printlist(Node head)
    {
        if(head==null)
        {
            System.out.println("Empty List");
            return;
        }
        Node mover=head;
        while(mover!=null)
        {
            System.out.println(mover.data);
            mover=mover.link;
        }
    }

    private static Node convertintoll(int a[])
    {
        Node head =new Node(a[0]);
        Node mover=head;
        for(int i=1;i<a.length;i++)
        {
            Node newnode=new Node(a[i]);
            mover.link=newnode;
            mover=newnode;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        Node head=convertintoll(arr);
        printlist(head);
        head=delhead(head);
        printlist(head);
    }
}
