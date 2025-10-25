import java.util.*;
class Plus
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of stars in a bar");
    int r=sc.nextInt();
    for(int i=0;i<r/2;i++)
    {
    for(int j=1;j<=r/2;j++)
    {
        System.out.print("  ");
    }
    System.out.print("* ");
    for(int j=1;j<=r/2;j++)
    {
        System.out.print("  ");
    }
    System.out.println();
    }
    for(int j=0;j<r;j++)
    {
        System.out.print("* ");
    }
    System.out.println();
    for(int i=0;i<r/2;i++)
    {
    for(int j=1;j<=r/2;j++)
    {
        System.out.print("  ");
    }
    System.out.print("* ");
    for(int j=1;j<=r/2;j++)
    {
        System.out.print("  ");
    }
    System.out.println();
    }
   } 
}