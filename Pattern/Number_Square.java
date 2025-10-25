import java.util.*;
class Number_Square
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r;j++)
            {
            System.out.print(i);
            }
        System.out.println();
        }
    }
}