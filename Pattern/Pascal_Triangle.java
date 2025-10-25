import java.util.*;
class Pascal_Triangle
{
public static void main(String args[])/**V.IMP */
    {
      
      /**
       *    1
       *   1 1
       *  1 2 1
       * 1 3 3 1 
       *1 4 6 4 1   
      */
     
       Scanner sc=new Scanner(System.in );
       System.out.println("Number of rows?");
       int r= sc.nextInt();
       int res=1;
       for (int i=0;i<r;i++)
       {
           for(int j=r-1;j>i;j--)
           System.out.print(" ");
           for (int k=0;k<=i;k++)
           {
             if( i==0 ||k==0)
             System.out.print("1 ");
              else
             {
               res=res*(i-k+1)/k; /**  MOST IMPORTANT FORMULA*/
               System.out.print(res+" ");
             }
           }
           System.out.println();
       }
    }
}