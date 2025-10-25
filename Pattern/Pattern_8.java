import java.util.*;
class Pattern_8
{
    public static void main(String args[])/**V.IMP*/
    {
      /**     &
       *     &&&
       *    &&&&&
       *    &&&&&
       *     &&&
       *      &
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for (int i=1;i<=r/2;i++)
       {
           for(int j=(r/2)-i;j>=1;j--)
           System.out.print(" ");
           for (int j=1;j<=2*i-1;j++)
           System.out.print("&");
           for(int j=(r/2)-1;j>=1;j--)
           System.out.print(" ");
           System.out.println();
       }
       for (int i=r/2;i>=1;i--)
       {
           for(int j=(r/2)-i;j>=1;j--)
           System.out.print(" ");
           for (int j=1;j<=2*i-1;j++)
           System.out.print("&");
           for(int j=(r/2)-1;j>=1;j--)
           System.out.print(" ");
           System.out.println();
       }
    }
}