import java.util.*;
class Inverted_Pyramid
{
     public static void main(String args[])
    {
      /**
       * Inverted Pyramid    &&&
       *                     &&
       *                     &
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for (int i=r; i>=1;i--)
       {
           for (int j=i;j>=1; j--)
           {
               System.out.print("&");
           }
           System.out.println();
       }
    }
}