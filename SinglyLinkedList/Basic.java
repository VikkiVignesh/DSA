package SinglyLinkedList;
import java.util.*;
//Creation of Node
    // |data|link| 
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

public class Basic {
 
    
    public static void main(String[] args) {
        int arr[]={20,5,7,10,3};
        System.out.println("Head of the List  "+Convert_to_List(arr).data);
    }

    static Node Convert_to_List(int a[])
    {
        Node head=new Node(a[0]);
        Node mover=head;
        for(int i=1;i<a.length;i++)
        {
            Node node=new Node(a[i]);
            mover.link=node;
            mover=node;
        }
        return head;
    }
}


