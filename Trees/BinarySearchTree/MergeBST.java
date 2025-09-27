package Trees.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MergeBST {
    
    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int x)
        {
            this.data=x;
            this.left=null;
            this.right=null;
        }
    }

    public static List<Integer> list=new ArrayList<>();

    public static void Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        list.add(root.data);
        Inorder(root.right);
    }

    public static void print(Node root)
    {
        if(root==null)
        {
            return;
        }
        print(root.left);
        System.out.print(root.data+" ");
        print(root.right);
    }

    public static Node creatBst(List<Integer> ls,int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        int mid=(s+e)/2;
        Node root= new Node(ls.get(mid));
        root.left=creatBst(ls, s, mid-1);
        root.right=creatBst(ls, mid+1, e);
        return root;
    }

    

    public static void main(String[] args) {
        Node root1=new Node(2);
        Node root2=new Node(9);

        root1.left=new Node(1);
        root1.right=new Node(4);

        root2.left=new Node(3);
        root2.right=new Node(12);

        print(root2);
        System.out.println();
        print(root1);
        System.out.println();

        Inorder(root1);
        Inorder(root2);
        Collections.sort(list);

        Node root=creatBst(list, 0, list.size()-1);
        print(root);
    }
}
