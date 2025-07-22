package LinkedLists;

import java.util.LinkedList;

public class LinkedList1 {

    public static class Node {
    int data;
    Node link;

    public Node(int d)
    {
        this.data=d;
        this.link=null;
    }
    }
    static Node head;
    static Node tail;
    static int size;

    public static void printLinkedList(Node head)
    {
        if(head==null)
        {
            System.out.println("Linked List ios Empty!!");
            return;
        }
        for(Node n=head;n.link!=null;n=n.link)
        {
            System.out.print(n.data+" -> ");
        }
        System.out.println();
    }

    public void addFirst(int data)
    {
        Node newnode= new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        newnode.link=head;
        head=newnode;
    }


    public void addLast(int data) {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.link=newnode;
        tail=newnode;
        
    }

    public void printLlist()
    {
        Node temp=head;
        while(temp !=null)
        {
            if(temp.link==null)
            {
              System.out.print(temp.data+" -> null");
            }
            else{
                 System.out.print(temp.data+" -> ");        }
            temp=temp.link;
        }
           
        System.out.println();

    }

    public int getListLen()
    {
        Node temp=head;
        int len=0;
        while (temp!=null) {
            len++;
            temp=temp.link;
            size++;
        }
        return len;
    }

    public void addAtIndex(int index,int data)
    {
        if(index==0)
        {
            addFirst(data);
            return;
        }
        if(index==1 && head==null)
        {
            addFirst(data);
            return;
        }
        Node newnode=new Node(data);
        int cnt=0;
        Node temp=head;
        while (cnt<index-1) {
            temp=temp.link;
            cnt++;
        }
        newnode.link=temp.link;
        temp.link=newnode;

    }

    public String RemoveFirst()
    {
        if(head==null)
        {
            System.out.println("Linked List is empty Can't delete any node..");
            return "";
        }
        else if(getListLen()==1)
        {
            System.out.println("Removed "+ head.data+" from the Linked List");
            head=tail=null;
            size=0;
            return "";
        }
        int val=head.data;
        head=head.link;
        size--;
        return val+" Removed from te linked List";

    }

    public void RemoveLast()
    {
        int val=0;
        if(head==null)
        {
            System.out.println("List is Empty!!..");
            return;
        }
        if(size==1)
        {
            System.out.println(head.data +" removed from the list");
            head=tail=null;
            return;
        }
        Node temp=head;
        while(temp.link.link!=null)
        {
          temp=temp.link;
        }
        System.out.println(temp.link.data +" Removed from the List");
        temp.link=null;
        tail=temp;
        size--;
    }

    public int search(int key)
    {
        int i=0;
        Node temp=head;
        while (temp!=null) {
            if(temp.data==key)
            {
                return i;
            }
            i++;
            temp=temp.link;
        }
        return -1;
    }

    public void Removefrmlast(int n)
    {
        int size=getListLen();
        System.out.println(size);
        if(n==size)
        {
            System.out.println(head.data+" removed from the list..");
            head.link=null;
            return;
        }
        Node temp=head;
        int i=0;
        while(i<size-n)
        {
            temp=temp.link;
            i++;
        }

        System.out.println("Removed "+ temp.link.data+" from teh list..");
        temp.link=temp.link.link;
        return;
    }


    public int helper(Node head, int key)
    {
       if(head==null)
       {
        return -1;
       }
       if(head.data==key)
       {
        return 0;
       }
       int idx=helper(head.link, key);

       if(idx==-1)
       {
         return -1;
       }
       return idx+1;
    }
    
    public int Recsearch(int key)
    {
        return helper(head,key);
    }

    public void Reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null)
        {
            next=curr.link;
            curr.link=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public Node getMidNode(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.link!=null)
        {
            slow=slow.link;
            fast=fast.link.link;
        }
        return slow;
    }



//Linked List palindrome Code
    public Boolean isPalindrome()
    {
        if(head ==null || head.link!=null)
        {
            return true;
        }
        Node midnode=getMidNode(head);

        Node prev=null;
        Node curr=midnode;
        Node next;

        while(curr!=null)
        {
            next=curr.link;
            curr.link=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;

        while(right!=null)
        {
            if(left.data!= right.data)
            {
                System.out.println(left.data+"    "+right.data);
                return false;
            }
            right=right.link;
            left=left.link;
        }
        return true;
    }

    //Detect cycles in teh linekd list
    public static boolean detectCycles()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.link!=null)
        {
            slow=slow.link;
            fast=fast.link.link;
            if(fast == slow)
            {
                return true;
            }
            
        }
        return false;
    }



    //Remove Cycles in the linked list

    public static void RemoveCycle()
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.link!=null)
        {
            slow=slow.link;
            fast=fast.link.link;
            if(fast==slow)
            {
                slow=head;
                break;
            }
  
        }

        Node prev=null;
        while(fast!=slow)
        {
            slow=slow.link;
            prev=fast;
            fast=fast.link;
        }
        System.out.println(prev.data+" is disconnected from the cycle...");
        prev.link=null;

    }



    //LinkedList Merge sort 

    public Node mergell(Node head1,Node head2)
    {
       Node mergeList=new Node(-1);
       Node temp=mergeList;

       while(head1.link!=null && head2.link!=null)
       {
         if(head1.data<head2.data)
         {
            temp.link=head1;
            head1=head1.link;
            temp=temp.link;
         }
         else{
            temp.link=head2;
            head2=head2.link;
            temp=temp.link;
         }
       }

       while(head1.link!=null)
       {
         temp.link=head1;
         head1=head1.link;
         temp=temp.link;
       }

         while(head2.link!=null)
       {
         temp.link=head2;
         head2=head2.link;
         temp=temp.link;
       }

       return mergeList.link;
    }

    public Node MergeSort(Node head)
    {
        if(head==null && head.link==null)
        {
            return head;
        }
        Node midNode=getMidNode(head);

        Node righhead=midNode.link;
        midNode.link=null;

        Node newLeft=MergeSort(head);
        Node newRight=MergeSort(midNode);

        return mergell(newLeft,newRight);
    }


    public void ZigZagll()
    {
        //Get the mid node;

        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.link!=null)
        {
            slow=slow.link;
            fast=fast.link.link;
        }

        Node midnode=slow;

        Node prev=null;
        Node curr=midnode.link;
        midnode.link=null;
        Node next;

        while (curr!=null) {
            next=curr.link;
            curr.link=prev;
            prev=curr;
            curr=next;
        }

        Node LH=head;
        Node RH=prev;

        Node nxtl,nextR;

        while (LH!=null && RH!=null) {
           nxtl=LH.link;
           LH.link=RH;
           nextR=RH.link;
           RH.link=nxtl;


           LH=nxtl;
           RH=nextR;
        }

    }
    public static void main(String[] args) {
    //   
    // head=new Node(1);
    // Node temp=new Node(2);
    // head.link=temp;
    // head.link.link=new Node(3);
    // head.link.link.link=temp;
    // System.out.println(detectCycles());
    // RemoveCycle();
    // System.out.println(detectCycles());

    LinkedList1 ll1=new LinkedList1();
    ll1.addFirst(1);
    ll1.addFirst(2);
    ll1.addFirst(3);
    ll1.addFirst(4);
    ll1.addFirst(5);
    ll1.addLast(6);
    ll1.printLlist();
    // ll1.MergeSort(head);
    // ll1.printLlist();
    ll1.ZigZagll();
    ll1.printLlist();
    }
}
