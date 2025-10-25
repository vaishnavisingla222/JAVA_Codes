import java.util.*;
class Pattern_5
{
     public static void main(String args[])
    {
      /**
       * 1
       * 01
       * 101
       * 0101
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for (int i=1;i<=r;i++)
       {
           for(int j=1;j<=i;j++)
           {
               if((i+j)%2==0)
               System.out.print("1");
               else
               System.out.print("0");
           }
           System.out.println();
       }
    }
}