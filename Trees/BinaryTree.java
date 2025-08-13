package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
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

    static class Binaryt{
        static int idx=-1;

        public Node Buildtree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newnode=new Node(nodes[idx]);
            System.out.println("Node "+newnode.data+" created");
            newnode.left=Buildtree(nodes);
            if(newnode.left!=null)
            {
                 System.out.println("Left Node "+newnode.left.data+" created");
            }
            else
            {
                System.out.println("Left Node is Null.");
            }
            newnode.right=Buildtree(nodes);
            if(newnode.right!=null)
            {
                System.out.println("Right Node "+newnode.right.data+" created");
            }
            else{
                System.out.println("Right Node is Null.");
            }
            return newnode;
        }

        public void preorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
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

         public void postorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public void levelorder(Node root)
        {
            if(root==null)
            {
                return;
            }

            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curr=q.remove();
                if(curr==null)
                {
                    if (q.isEmpty()) {
                        break;
                    }
                    System.out.println();
                    q.add(null);
                }
                else
                {
                    System.out.print(curr.data+" ");
                    if(curr.left!=null)
                    {
                        q.add(curr.left);
                    }
                    if(curr.right!=null)
                    {
                        q.add(curr.right);
                    }
                }
            }
        }


        public int height(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            int height=Math.max(lh, rh)+1;
            return height;
        }

        public int getNodescnt(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int lf=getNodescnt(root.left);
            int rt=getNodescnt(root.right);
            return  lf+rt+1;
        }

        public int sum(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int left=sum(root.left);
            int right=sum(root.right);
            return left+right+root.data;
        }

        public int diameter(Node root)
        {
            if(root==null)
            {return 0;}

            int lh=height(root.left);
            int ld=diameter(root.left);
            int rh=height(root.right);
            int rd=height(root.right);

            int selfdia=lh+rh+1;

            return Math.max(selfdia , Math.max(ld,rd));
        }
    }


    static class Info
    {
        int dia;
        int ht;

        public Info(int d,int h)
        {
            this.dia=d;
            this.ht=h;
        }
    }

    public static Info cal_diameter(Node root) {
        if(root==null)
        {
            return new Info(0,0);
        }

        Info left=cal_diameter(root.left);
        Info right=cal_diameter(root.right);

        int height=Math.max(left.ht,right.ht)+1;
        int dia=Math.max(Math.max(left.dia, right.dia),left.ht+right.ht+1);
        return new Info(dia, height);
    }
    public static void main(String[] args) {

        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Binaryt bt=new Binaryt();
        Node root=bt.Buildtree(nodes);
        System.out.println(root.data);

        System.out.println("Pre-Order Traversal");
        bt.preorder(root);
        System.out.println();

        System.out.println("In-Order Traversal");
        bt.Inorder(root);
        System.out.println();

        System.out.println("Post-Order Traversal");
        bt.postorder(root);
        System.out.println();

        bt.levelorder(root);
        System.out.println();
        System.out.println("Height of Tree is : "+bt.height(root));
        System.out.println("Number of node sin the Tree is : "+ bt.getNodescnt(root));

        System.out.println("Sum of Nodes : "+bt.sum(root));

        System.out.println("Diameter of Tree : "+ bt.diameter(root));

        System.out.println("Height : "+cal_diameter(root).ht);
        System.out.println("Diameter : "+cal_diameter(root).dia);
    }

}
