import java.util.*;
class Solid_Rhombus
{
  public static void main(String args[])
    {
      /**
       *     &&&&&
       *    &&&&&
       *   &&&&&
       *  &&&&&
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
           System.out.print("&");
           
           System.out.println();
       }
    }   
}