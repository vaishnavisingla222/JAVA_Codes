import java.util.*;
class BasicsTrees 
{
    public static class Node
    {
        int val;
        Node left;
        Node right;
        public Node(int val)
        {
            this.val=val;
        }
    }
    public static void display(Node root)
    {
        if(root==null)
        return;

        System.out.print(root.val+" -> ");

        if(root.left!=null)
        System.out.print(root.left.val+" ");
        else
        System.out.print("null ");

        if(root.right!=null)
        System.out.print(root.right.val);
        else
        System.out.print("null ");

        System.out.println();

        display(root.left);
        display(root.right);
    }
    public static void preorder(Node root)
    {
        if(root==null)
        return;

        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
        
        return;
    }
    public static void inorder(Node root)
    {
        if(root==null)
        return;

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
        
        return;
    }  
    public static void postorder(Node root)
    {
        if(root==null)
        return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
        
        return;
    }    
    public static int sizeOfTree(Node root)
    {
        if(root==null)
        return 0;

        return (1+sizeOfTree(root.left)+sizeOfTree(root.right));
    }
    public static int sumOfTree(Node root)
    {
        if(root==null)
        return 0;

        return (root.val+sumOfTree(root.left)+sumOfTree(root.right));
    } 
    public static int maxValue(Node root)
    {
        if(root==null)
        return Integer.MIN_VALUE;//because if maximum value is negative then leaf node will give 0 which will become maximum

        int a=root.val;
        int b=maxValue(root.left);
        int c=maxValue(root.right);

        return Math.max(a,Math.max(b,c));
    }
    public static int heightTree(Node root)
    {
        if (root==null || root.left==null && root.right==null)
        return 0;           

        return (1+Math.max(heightTree(root.left),heightTree(root.right)));
    }
    public static void nthEllements(Node root, int level)
    {
        if(root==null)
        return;
        if(level==1)
        {
            System.out.print(root.val+" ");
            return;
        }
        nthEllements(root.left, level-1);
        nthEllements(root.right, level-1);
    }
    public static void bfs(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        if(root!=null)
        q.add(root);

        while(q.size()>0)
        {
            Node temp=q.peek();
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);

            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    public static void main(String args[])
    {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);

        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.right=e;

        System.out.println("Tree:");
        display(root);//by recursion in PreOrder form

        System.out.print("\nPreorder: ");
        preorder(root);//root->left->right
        System.out.print("\nInorder: ");
        inorder(root);//left->root->right
        System.out.print("\nPostorder: ");
        postorder(root);//left->right->root

        System.out.println("\nSize of tree: "+sizeOfTree(root));

        System.out.println("\nSum of tree Nodes: "+sumOfTree(root));

        System.out.println("\nMax value of tree: "+maxValue(root));

        System.out.println("\nHeight of Tree: "+heightTree(root));

        int level=heightTree(root)+1;//tottal number of level
        for(int i=1;i<=level;i++)
        {
            System.out.print("\nNumbers at "+i+" Level: ");
            nthEllements(root,i);//using recursion and iteration
        }
        System.out.print("\nBreadth-First Search: ");
        bfs(root);
    }
} 
