package Trees.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class BST {
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

    public static Node BuildBST(Node root,int val)
    {
        if(root==null)
        {
            Node newnode=new Node(val);
            return newnode;
        }

        if(root.data>val)
        {
            root.left=BuildBST(root.left, val);
        }
        else 
        {
            root.right=BuildBST(root.right, val);
        }
        return root;
    }

     public void Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }

        if(root.data==key)
        {
            return true;
        }
        
        if(root.data >key)
        {
          return search(root.left, key);
        }
        else{
          return search(root.right, key);
        }

    }

    public static Node Deletenode(Node root, int d)
    {
        if(root.data<d)
        {
            root.right=Deletenode(root.right, d);
        }
        else if(root.data> d)
        {
            root.left=Deletenode(root.left, d);
        }
        else
        {
            // case 1: leaf Node
            if(root.left==null && root.right==null)
            {
                return null;
            }


            //case 2: Single Child
            if(root.right==null)
            {
                return root.left;
            }
            else if(root.left==null)
            {
                return root.right;
            }

            //case 3 : Two child
            Node IS=findInorder_Successor(root.right);
            root.data=IS.data;
            root.right =Deletenode(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorder_Successor(Node root)
    {
        while (root.left!=null) {
            root=root.left;
        }
        return root;
    }


    public static void PrintInRange(Node root,int x,int y)
    {
        if(root==null)
        {
            return;
        }

        if(root.data>=x && root.data<=y)
        {
            PrintInRange(root.left, x, y);
            System.out.print(root.data+" ");
            PrintInRange(root.right, x, y);
        }
        else if(root.data <x)
        {
            PrintInRange(root.left, x, y);
        }
        else
        {
            PrintInRange(root.right, x, y);
        }
    }

    public static void printPath(ArrayList<Integer> ls)
    {
        for(int i=0;i<ls.size();i++)
        {
            System.out.print(ls.get(i)+"-");
        }
        System.out.println("null");
    }


    public static Void path(Node root,ArrayList<Integer> list)
    {
        if(root ==null)
        {
            return;
        }

        list.add(root.data);
        if(root.left==null && root.right==null)
        {
            printPath(list);
        }
        path(root.left, list);
        path(root.right, list);
        list.remove(list.size()-1);
    }

    public static boole isValisBST(Node root)
    {
        
    }
    
    public static void main(String[] args) {
        int arr[]={8,5,3,1,4,6,10,11,14};
        Node root=null;

        for (int i =0;i<arr.length;i++) {
            root=BuildBST(root, arr[i]);
        }

        BST bst =new BST();
        bst.Inorder(root);

        System.out.println(search(root, 9));


        //  bst.Inorder(root);
        //  System.out.println();
         
        //  Deletenode(root, 10);

        //  bst.Inorder(root);
        //  System.out.println();

        //  Deletenode(root, 14);
        //  bst.Inorder(root);
        //  System.out.println();

        //  Deletenode(root, 5);
        //  bst.Inorder(root);
        //  System.out.println();


         PrintInRange(root, 5, 12);

         ArrayList<Integer> ls=new ArrayList<>();
         path(root, ls);
    }
}
