import java.util.*;
class Pattern_4
{
    public static void main(String args[])
    {
      /**
       * 1
       * 23
       * 456
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       int n= 1;
       for (int i=1;i<=r;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print(n+" ");
               n++;
           }
           System.out.println();
       
        }
    }
}