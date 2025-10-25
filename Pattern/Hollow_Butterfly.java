import java.util.*;
class Hollow_Butterfly
{
 public static void main(String args[])/**V.IMP*/
    {
      /**
       *    &          &
       *    &&        &&
       *    & &      & &
       *    &  &    &  &
       *    &   &  &   &
       *    &    &&    &   
       *    &    &&    &
       *    &   &  &   &
       *    &  &    &  &
       *    & &      & & 
       *    &&        &&
       *    &          &
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.print("Number of rows: ");
       int r= sc.nextInt();
       for (int i=1;i<=r;i++)
       {
           for(int j=1;j<=i;j++)
           {
               if(j==1|| j==i)
               System.out.print("&");
               else
               System.out.print(" ");
           }
           int sp=2*(r-i);
           for(int j=1;j<=sp;j++)
           System.out.print(" ");
           for(int j=1;j<=i;j++)
           {
               if(j==1|| j==i)
               System.out.print("&");
               else
               System.out.print(" ");
           }
           System.out.println();
        }
           for (int i=r;i>=1;i--)
       {
           for(int j=1;j<=i;j++)
           {
               if(j==1|| j==i)
               System.out.print("&");
               else
               System.out.print(" ");
           }
           int sp=2*(r-i);
           for(int j=1;j<=sp;j++)
           System.out.print(" ");
           for(int j=1;j<=i;j++)
           {
               if(j==1|| j==i)
               System.out.print("&");
               else
               System.out.print(" ");
           }
           System.out.println();
        }
    } 
}