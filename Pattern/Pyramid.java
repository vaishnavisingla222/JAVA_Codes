import java.util.*;
class Pyramid
{
     public static void main(String args[])
    {
      /**
       * Pyramid             &
       *                     &&    
       *                     &&&
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       
       for (int i=1; i<=r;i++)
       {
           for (int j= 1;j<=i; j++)
           {
               System.out.print("&");
           }
           System.out.println();
       }
    }
}