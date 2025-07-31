package Stacks;

import java.util.HexFormat;
import java.util.Stack;

public class Palindrome {
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
    static Node head;

    public static boolean isPalindrome(Node head)
    {
        Stack<Integer> s=new Stack<>();
        boolean res=true;
        Node temp=head;
        while (temp!=null) {
           s.push(temp.data);
           temp=temp.link; 
        }

        temp=head;
        while (!s.isEmpty()) {
            int node=s.pop();
        
            if(temp.data==node)
            {
                res=true;
            }
            else
            {
                res=false;
                break;
            }
            temp=temp.link;
        }
        return res;

    }
    public static void main(String[] args) {
        Node one=new Node(10);
        Node two=new Node(20);
        Node three=new Node(30);
        Node four=new Node(20);
        Node five=new Node(100);
        head=one;
        one.link=two;
        two.link=three;
        three.link=four;
        four.link=five;

        System.out.println(isPalindrome(head));
    }
}
