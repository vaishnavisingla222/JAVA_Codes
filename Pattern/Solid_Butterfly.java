import java.util.*;
class Solid_Butterfly
{
public static void main(String args[])/**V.IMP*/
    {
      /**                   $      $
       *  Butterfly         $$    $$
       *                    $$$  $$$
       *                    $$$$$$$$
       *                    $$$$$$$$
       *                    $$$  $$$
       *                    $$    $$
       *                    $      $
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       for (int i=1;i<=r;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("$");
           }
           int space= 2*(r-i);
           for(int j=1;j<=space;j++)
           System.out.print(" ");
           for(int j=1;j<=i;j++)
           {
               System.out.print("$");
           }
           System.out.println();
        }
           for (int i=r;i>=1;i--)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("$");
           }
           int space= 2*(r-i);
           for(int j=1;j<=space;j++)
           System.out.print(" ");
           for(int j=1;j<=i;j++)
           {
               System.out.print("$");
           }
           System.out.println();
       }
    }
}