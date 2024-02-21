import java.util.*;

class Node
{
    int data;
    Node link;

    Node(int d)
    {
        data=d;
        link=null;
    }

    Node(int d,Node x)
    {
        data=d;
        link=x;
    }
}
public class Travesal {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node mover=head;
        Node one=new Node(10);
        head.link=one;
        Node two=new Node(20);
        one.link=two;
        Node three=new Node(30);
        two.link=three;
        
        Node four=new Node(40);
        three.link=four;
        Node five=new Node(50);
        four.link=five;

        while(mover!=null)
        {
            System.out.println(mover.data);
            mover=mover.link;
        }
    }
}
