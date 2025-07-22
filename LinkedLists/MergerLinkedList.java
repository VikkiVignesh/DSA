package LinkedLists;

import java.util.LinkedList;

public class MergerLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(6);
        l1.add(7);

        l2.add(4);
        l2.add(5);

        printlist(l1.ge);
        mergeLinkedList(l1,l2)
    }

    public static void printlist(Node head)
    {
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ->");
            temp=temp.link;
        }

        System.out.println();
    }
}
