package Trees.BinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
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

    public static void Inorder(Node root)
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


    public static void path(Node root,ArrayList<Integer> list)
    {
        if(root ==null)
        {
            return ;
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

    public static boolean isValisBST(Node root,Node min,Node max)
    {
        if(root == null)
        {
           return true;
        }

        if( min!=null && root.data <= min.data || max!=null && root.data >= max.data)
        {
            return false;
        }
         return isValisBST(root.left, min, root) &&  isValisBST(root.right, root, max);
    }


    public static Node mirrorBST(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Node leftMirror=mirrorBST(root.left);
        Node rightMirror=mirrorBST(root.right);

        root.left=leftMirror;
        root.right=rightMirror;

        return root;
    }

    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static Node CreateBst_frm_Array(int a[],int st,int ed)
    {
        if(st>ed)
        {
            return null;
        }
        int mid=(st+ed)/2;
        Node root=new Node(a[mid]);
        root.left=CreateBst_frm_Array(a, st, mid-1);
        root.right=CreateBst_frm_Array(a, mid+1, ed);
        return root;
    }
    

    public static void InorderTrav(Node root, ArrayList<Integer> ls)
    {
        if(root==null)
        {
            return;
        }
        InorderTrav(root.left, ls);
        ls.add(root.data);
        InorderTrav(root.right,ls);
    }

    public static Node Balance_BST(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        InorderTrav(root, list);
        Collections.sort(list);
        System.out.println(list);


        root=Create_BST(list, 0, list.size()-1);
        return root;
    }


    public static Node Create_BST(ArrayList<Integer> l,int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        int mid=(s+e)/2;

        Node root=new Node(l.get(mid));
        root.left=Create_BST(l, s, mid-1);
        root.right=Create_BST(l, mid+1, e);
        return root;
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
        
       
        System.out.println("IS valid Tree - "+isValisBST(root, null,null));

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

         preorder(root);
          System.out.println();
         Node res=mirrorBST(root);
         preorder(res);
         System.out.println();
        
         int ar[]={1,2,3,4,5,6,7,8,9};
         Node rs=CreateBst_frm_Array(ar, 0, ar.length-1);
         preorder(rs);


         Node r=Balance_BST(root);

         System.out.println();
         preorder(r);
         

        
    }
}
