import java.util.*;
class Pattern_9
{
     public static void main(String args[])
    {
      /**
       *    1
       *   1 2
       *  1 2 3
       * 1 2 3 4 
       *1 2 3 4 5   
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for (int i=1;i<=r;i++)
       {
           for(int j=r-1;j>=i;j--)
           System.out.print(" ");
           for (int j=1;j<=i;j++)
           System.out.print(j+" ");
           System.out.println();
       }
    }
}