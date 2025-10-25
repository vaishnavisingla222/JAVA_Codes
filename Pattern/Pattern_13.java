/**
 * &&&&&&&
 * &&& &&&
 * &&   &&
 * &     &
 */
import java.util.*;
class Pattern_13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        for(int i=1;i<=2*r-1;i++)
        {
            System.out.print("* ");
        }
        for(int j=1;j<r;j++){
        for(int i=r-1;i>=j;i--)
        {
            System.out.print("* ");
        }
        for(int i=1;i<r-1;i=i++)
        {
            System.out.print("  ");
        }
        for(int i=r-1;i>=j;i--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}