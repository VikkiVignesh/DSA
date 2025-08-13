package Trees;

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

public class CustomBinTree {
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
