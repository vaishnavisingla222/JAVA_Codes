import java.util.*;
class Hollow_Rhombus
{
    public static void main(String args[])
    {
      /**
       *     &&&&&
       *    &   &
       *   &   &
       *  &   &
       * &&&&& 
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for(int i=1;i<=r;i++)
       {
           for (int j=r-1;j>=i;j--)
           {
               System.out.print(" ");
           }
           for (int j=1;j<=5;j++)
           {
               if(i==1||j==1||i==r||j==r)
              System.out.print("&");
              else
              System.out.print(" ");
           }
           System.out.println();
       }
    }
}