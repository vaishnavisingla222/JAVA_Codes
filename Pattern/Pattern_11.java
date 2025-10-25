import java.util.*;
class Pattern_11
{
    /**
     *1
     *121
     *12321
     *1234321
     */
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r=sc.nextInt();
        for(int i=1;i<r+1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=i-1;j>0;j--){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}