import java.util.*;
class swap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
     System.out.println("Enter two numbers one by one");
     a=sc.nextInt();
     b=sc.nextInt();
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("The value of a= "+a+" and b= "+b);
    }
}