package Trees;

public class UnivaluedTree {

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

public static boolean isUnivalued(Node root)
{
    if(root==null)
    {
        return true;
    }

    if(root.left!=null && root.data!=root.left.data)
    {
        return false;
    }
    if(root.right!=null && root.data!=root.right.data)
    {
        return false;
    }

    return isUnivalued(root.left) && isUnivalued(root.right);
}

public static Node Mirror(Node root)
{
    if(root==null)
    {
        return root;
    }

    Node left=Mirror(root.left);
    Node right=Mirror(root.right);

    root.left=right;
    root.right=left;
    return root;
}


public static Node deleteLeaf(Node root,int x)
{
    if(root==null)
    {
        return null;
    }

    root.left=deleteLeaf(root.left, x);
    root.right=deleteLeaf(root.right, x);
    if(root.data==x && root.left==null && root.right==null)
    {
        return null;
    }
    return root;
}

    public static void main(String[] args) {
        CustomBinTree bt=new CustomBinTree();
        int nodes[]={2,2,5,-1,-1,2,-1,-1,2,-1,-1};
        Node root1=bt.constructTree(nodes);
        System.out.println(root1.data);
        bt.Preorder(root1);
        System.out.println();
        bt.Inorder(root1);
        System.out.println();
        bt.Postorder(root1);
        System.out.println();

        System.out.println(isUnivalued(root1));
        Node mnode=Mirror(root1);
        bt.Preorder(mnode);
        System.out.println();
        bt.Preorder(root1);
        System.out.println();

        deleteLeaf(root1, 2);
        System.out.println();
        bt.Preorder(root1);
    }
}
