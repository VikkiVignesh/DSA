package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SubTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int d)
        {
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }

    static class BinTree{
        int idx=-1;
        public Node buildBinTree(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }

            Node newnNode=new Node(nodes[idx]);
            newnNode.left=buildBinTree(nodes);
            if(newnNode.left==null)
            {
                //System.out.println("Left Child is Null");
            }
            else
            {
                //System.out.println("Left Node "+newnNode.left.data+" is created.");
            }
            newnNode.right=buildBinTree(nodes);
              if(newnNode.right==null)
            {
                //System.out.println("Right Child is Null");
            }
            else
            {
                //System.out.println("Right Node "+newnNode.right.data+" is created.");
            }
            return newnNode;
        }

        public void Levelorder(Node root)
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
                    if(q.isEmpty())
                    {
                        break;
                    }
                    System.out.println();
                    q.add(null);
                    
                }
                else
                {
                    System.out.println(curr.data);
                    if(curr.left!=null) {
                        q.add(curr.left);
                    }
                    if(curr.right!=null) {
                        q.add(curr.right);
                    }
                }
            }
        }
    }


    public static boolean isIdentical(Node root ,Node subroot)
    {
        if(root==null && subroot==null)
        {
            return true;
        }
        else if(root== null || subroot== null || root.data!=subroot.data)
        {
            return false;
        }

        if(!isIdentical(root.left, subroot.left))
        {
            return false;
        }
        if(!isIdentical(root.right, subroot.right))
        {
            return false;
        }
        return true;
    }

    public static boolean isSubTress(Node root,Node Subroot)
    {
        if(root==null)
        {
            return false;
        }

        if(root.data == Subroot.data)
        {
            if(isIdentical(root,Subroot))
            {
                return true;
            }
        }
        return isSubTress(root.left, Subroot) || isSubTress(root.right, Subroot);
    }

    static class Info
    {
        Node node;
        int hd;

        public Info(Node c,int d)
        {
            this.hd=d;
            this.node=c;
        }
    }

    public static void TopView(Node root) {
        if(root ==null)
        {
            return;
        }
        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();

        q.add(new Info(root, 0));
        q.add(null);

        int min=0,max=0;
        while (!q.isEmpty()) {
            Info curr = q.remove();

            if(curr==null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }

            if(!map.containsKey(curr.hd))
            {
                map.put(curr.hd, curr.node);
            }

            if(curr.node.left!=null)
            {
                q.add(new Info(curr.node.left, curr.hd-1));
                min=Math.min(curr.hd-1, min);
            }

             if(curr.node.right!=null)
            {
                q.add(new Info(curr.node.right, curr.hd+1));
                max=Math.min(curr.hd+1, max);
            }
        }
        for(int i=min;i<=max;i++)
        {
            System.out.print(map.get(i).data);
        }
    }


    public static void KthLevel(Node root,int level,int k)
    {
        if(root==null)
        {
            return;
        }
        if(level==k)
        {
            System.out.print(root.data+" ");
            return;
        }
        KthLevel(root.left,level+1,k);
        KthLevel(root.right,level+1,k);
    }


    public static boolean getpath(Node root,int n,ArrayList<Node> p)
    {
        if(root==null)
        {
           return false;
        }

        p.add(root);
        if(root.data==n)
        {
            return true;
        }

        boolean left=getpath(root.left, n, p);
        boolean right=getpath(root.right, n, p);
        if(left || right)
        {
            return true;
        }
        p.remove(root);
        return false;
    }


    public static Node LowestCommonAncestor(Node root,int n1,int n2)
    {
        if(root==null)
        {
            return null;
        }
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getpath(root,n1,path1);
        getpath(root,n2,path2);

        int i=0;
        for(;i<path1.size() && i<path2.size();i++)
        {
            if(path1.get(i).data!=path2.get(i).data)
            {
                break;
            }
        }
        Node lcu=path1.get(i-1);
        return lcu;
    }

    public static Node LCA(Node root,int n1,int n2)
    {
        if(root ==null || root.data==n1 || root.data==n2)
        {
            return root;
        }
        Node left=LCA(root.left,n1,n2);
        Node right=LCA(root.right, n1, n2);

        if(left==null)
        {
            return right;
        }
        if(right==null)
        {
            return left;
        }
        return root;
    }

    public static int Dist(Node root,int d)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.data==d)
        {
            return 0;
        }

        int left=Dist(root.left, d);
        int right=Dist(root.right, d);
        if(left==-1 && right==-1)
        {
            return -1;
        }
        else if(left==-1)
        {
            return right+1;
        }
        else
        {
            return left+1;
        }
    }

    public static int MinDist(Node root,int n1,int n2)
    {
        Node lcu=LCA(root, n1, n2);

        return Dist(lcu, n1)+Dist(lcu, n2);

    }

    public static int kthAncestor(Node root,int n,int k)
    {
        if(root==null)
        {
            return -1;
        }
        if(root.data==n)
        {
            return 0;
        }
        int left=kthAncestor(root.left, n, k);
        int right=kthAncestor(root.right, n, k);

        if(left==-1 && right==-1)
        {
            return -1;
        }
        int max=Math.max(left, right);
        if(max+1==k)
        {
            System.out.println(root.data);
        }
        return max+1;
    }

    public static void preorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static int sumTree(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=sumTree(root.left);
        int right=sumTree(root.right);
        int data=root.data;

        root.data=left+ (root.left==null ?0:root.left.data) +right+(root.right==null ? 0: root.right.data);
        return data;
    }
    public static void main(String[] args) {
        
        int node1[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        int node2[]={3,6,-1,-1,7,-1,-1};

        int nodes[]={1,2,-1,4,-1,5,-1,6,-1,-1,3,-1,-1};

        BinTree bt1=new BinTree();
        // BinTree bt2=new BinTree();
         Node root1=bt1.buildBinTree(node1);
        // Node root2=bt2.buildBinTree(node2);
        // System.out.println(root1.data);
        // System.out.println(root2.data);

        // System.out.println("Tree 1");
        // bt1.Levelorder(root1);
        // System.out.println("Tree 2");
        // bt2.Levelorder(root2);

        // System.out.println("Is SubTree : "+ isSubTress(root1, root2));
        BinTree bt=new BinTree();
        Node root=bt.buildBinTree(nodes);
        bt.Levelorder(root);


        //TopView(root);
        KthLevel(root,0,4);
        System.out.println();
        KthLevel(root1,0,1);

        int lcu=LowestCommonAncestor(root1, 4, 6).data;
        System.out.println("Lowest Common Ancestor : "+ lcu);
        System.out.println(LCA(root1, 4, 6).data);
        System.out.println(MinDist(root1, 4, 5));

        System.out.println(kthAncestor(root1, 5, 2));
        preorder(root1);
        System.out.println("Sum Tree : "+sumTree(root1));
        preorder(root1);
    }
}
