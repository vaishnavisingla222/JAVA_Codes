import java.util.*;
class Pattern_10
{
    public static void main(String args[])
    {
      /**
       *1111
       *222
       *33
       *4
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for (int i=1;i<=r;i++)
       {
           for(int j=r;j>=i;j--)
           System.out.print(i);
           System.out.println();
       }
    }
}