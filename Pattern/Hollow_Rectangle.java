import java.util.*;
class Hollow_Rectangle
{
    public static void main (String args[])
    {
      /**
       * Hollow Rectangle    &&&&&&
       *                     &    &
       *                     &    &
       *                     &&&&&&
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       System.out.println("Nmuber of Columns?");
       int c=sc.nextInt();
       for (int i=1; i<=r;i++)
       {
           for (int j= 1;j<=c; j++)
           {
               if(i==1||i==r||j==1||j==c)
               System.out.print("&");
               else 
               System.out.print(" ");
           }
           System.out.println();
       }
    }
}