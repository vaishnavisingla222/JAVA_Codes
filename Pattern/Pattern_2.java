import java.util.*;
class Pattern_2
{
    public static void main(String args[])
    {
      /**
       * 1
       * 12
       * 123
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for (int i=1;i<=r;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print(j);
           }
           System.out.println();
       }
    }
}