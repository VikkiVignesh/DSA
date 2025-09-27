package Trees.BinarySearchTree;

import Trees.BinarySearchTree.LongestBST.NodeInfo;

public class LongestBST {
    
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

    static class NodeInfo {
      boolean isValid;
      int size;
      int min;
      int max;

      public NodeInfo(boolean isval,int s,int min,int max)
      {
        this.isValid=isval;
        this.size=s;
        this.min=min;
        this.max=max;
      }
        
    }
    public static void Inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+"  ");
        Inorder(root.right);
    }



    public static int maxBst=0;
    public static NodeInfo Longest_bst(Node root)
    {
      if(root == null)
      {
        return new NodeInfo(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
      }
      NodeInfo left=Longest_bst(root.left);
      NodeInfo right=Longest_bst(root.right);
      
      int size=left.size+right.size+1;
      int min=Math.min(root.data, Math.min(left.min, right.min));
      int max=Math.max(root.data, Math.max(left.max,right.max));

      if(root.data <= left.max || root.data >= right.min)
      {
        return new NodeInfo(false, size, min, max);
      }

      if(left.isValid && right.isValid)
      {
        maxBst=Math.max(maxBst, size);
         System.out.println("Node " + root.data + 
                       " | Subtree size = " + size +
                       " | VALID BST | min = " + min +
                       " | max = " + max +
                       " | maxBst = " + maxBst);
        return new NodeInfo(true, size, min, max);
      }

      return new NodeInfo(false, size, min, max);
    }
    public static void main(String[] args) {
        Node root= new Node(50);
        root.left=new Node(30);
        root.right=new Node(60);

        root.left.left=new Node(5);
        root.left.right=new Node(20);

        root.right.left=new Node(45);
        root.right.right=new Node(70);

        root.right.right.left=new Node(65);
        root.right.right.right= new Node(80);

        Inorder(root);
        System.out.println();

        NodeInfo info=Longest_bst(root);

        System.out.println("Longest BST in BT is "+ maxBst);
    }
}
