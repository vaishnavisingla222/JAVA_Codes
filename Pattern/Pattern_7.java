import java.util.*;
class Pattern_7
{
    public static void main(String args[])
    {
      /**
       *    1
       *   212
       *  32123
       * 4321234 
       *543212345   
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for (int i=1;i<=r;i++)
       {
           for(int j=r-1;j>=i;j--)
           System.out.print(" ");
           for (int j=i;j>=1;j--)
           System.out.print(j);
           for(int j=2;j<=i;j++)
           System.out.print(j);
           System.out.println();
       }
    }
}