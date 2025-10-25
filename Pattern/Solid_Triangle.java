import java.util.*;
class Solid_Triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r;
        System.out.println("Enter number of rows");
        r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
        for(int j=1;j<=r-i;j++)
        {
            System.out.print(" ");
        }
        for (int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        for(int j=1;i<=r-i;j++)
        {
           System.out.print(" ");
        }
        System.out.println("");
        }
    }
}