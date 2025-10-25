import java.util.*;
class Pattern_12
{
    /**
     * &
     * &
     * &
     * & & & &
     */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        for (int i=1;i<=r;i++)
        {
            for (int j=1;j<r+1;j++)
            {
                if(i==r||j==1)
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}