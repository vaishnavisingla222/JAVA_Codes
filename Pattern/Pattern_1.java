import java.util.*;
class Pattern_1
{
    public static void main(String args[])
    {
      /**
       * Inverted Pyramid         &                     
       *                         &&                   
       *                        &&&
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for (int i=r; i>=1;i--)
       {
           for(int j=1;j<=i-1;j++)
           {
               System.out.print(" ");
           }
           for (int j=0;j<=r-i; j++)
           {
               System.out.print("&");
           }
           System.out.println();
       }
    }
}