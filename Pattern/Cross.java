/**
 * &   &
 *  & &
 *   &
 *  & &
 * &   &
 */
import java.util.*;
class Cross
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of stars in a bar");
    int r=sc.nextInt();
    for(int i=0;i<=r;i++)
    {
    for(int j=1;j<=r;j++)
    {
       if(i==j||i+j==(r+1))
       {
        System.out.print("*");
       }
       System.out.print(" ");
    }
    System.out.println();
    }
    }
}