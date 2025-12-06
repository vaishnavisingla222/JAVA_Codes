import java.util.*;
class ExpressionEvaluation 
{
    public static class Node 
    {
        String data;
        Node left,right;
        Node(String data) 
        {
            this.data=data;
            left = right = null;
        }
    }
    public static boolean isOperator(String s) 
    {
        return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
    }
    public static double evaluate(Node root) 
    {
        if (!isOperator(root.data)) 
            return Double.parseDouble(root.data);

        double left=evaluate(root.left);
        double right=evaluate(root.right);
        double ans=0;

        switch (root.data) 
        {
            case "+": 
            ans=left+right;
            break;

            case "-": 
            ans=left-right;
            break;

            case "*": 
            ans=left*right;
            break;

            case "/":
            if(right==0)
            {
                System.out.println("Invalid number\n");
                ans=Double.MIN_VALUE;
            }
            ans=left/right;
            break;

            default: 
            System.out.println("Incorect operator\n");
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        //(3 + (5 * 2))
        Node root=new Node("+");
        root.left=new Node("3");
        root.right=new Node("*");
        root.right.left=new Node("5");
        root.right.right=new Node("2");

        System.out.println("Result = "+evaluate(root));
    }
}
