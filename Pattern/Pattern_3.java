import java.util.*;
class Pattern_3
{
public static void  main(String args[])
    {
      /**
       * 123
       * 12
       * 1
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for (int i=r;i>=1;i--)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print(j);
           }
           System.out.println();
       }
    }
}