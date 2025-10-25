import java.util.*;
class Pattern_6
{
    public static void main(String args[])
    {
      /**
       *    1
       *   2 2
       *  3 3 3
       * 4 4 4 4 
       *5 5 5 5 5   
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for (int i=1;i<=r;i++)
       {
           for(int j=r-1;j>=i;j--)
           System.out.print(" ");
           for (int j=1;j<=i;j++)
           {
           System.out.print(i+" ");
           }
           System.out.println();
       }
    }
}
