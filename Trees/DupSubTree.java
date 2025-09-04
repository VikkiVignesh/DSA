package Trees;
import java.util.HashMap;

import Trees.DupSubTree.Res;

public class DupSubTree {

    static HashMap<String,Integer> m=new HashMap<>();
static class Node
    {
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

static class CustomBinTree {
    int idx=-1;
    
    public Node constructTree(int nodes[])
    {
        idx++;
        if(nodes[idx]==-1)
        {
            return null;
        }
        Node node=new Node(nodes[idx]);
        node.left=constructTree(nodes);
        node.right=constructTree(nodes);
        return node;
    } 


    public void Preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
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

    public void Postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data+" ");
    }

}


public static String Checkduplicates(Node root)
{
    if(root==null)
    {
        return "";
    }

    String str="(";
    str+=Checkduplicates(root.left);
    str+=Integer.toString(root.data);
    str+=Checkduplicates(root.right);
    str+=")";

    if(m.get(str)!=null && m.get(str)==1)
    {
        System.out.print(str+" ");
    }
    if(m.containsKey(str))
    {
        m.put(str,m.get(str)+1 );
    }
    else
    {
        m.put(str, 1);
    }

    return str;
}


static class Res
{
    public int val;
}

public static int maxPathSum(Node root,Res res)
{
    if(root==null)
    {
        return 0;
    }
    int left=maxPathSum(root.left, res);
    int right=maxPathSum(root.right, res);

    int maxsingle=Math.max(Math.max(left, right)+root.data,root.data);
    int maxTop=Math.max(maxsingle, left+right+root.data);

    res.val = Math.max(res.val, maxTop);
    
    return maxsingle;
}

public static int calMaxPath(Node root)
{
    Res res=new Res();
    res.val=Integer.MIN_VALUE;
    return maxPathSum(root, res);
}

public static void main(String[] args) {
    CustomBinTree bt=new CustomBinTree();
    int nodes[]={1,4,3,-1,-1,-1,3,4,3,-1,-1,-1,3,-1,-1};
    Node root=bt.constructTree(nodes);
    bt.Preorder(root);
    System.out.println();
    bt.Inorder(root);
    System.out.println();

    Checkduplicates(root);

    System.out.println();
    System.out.println(calMaxPath(root));
}

}
