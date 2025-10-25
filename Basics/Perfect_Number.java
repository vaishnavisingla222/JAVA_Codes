import java.util.*;
class Perfect_Number
{
    /**Perfect Number: A positive integer that is equal to the sum of its proper divisors (excluding itself).
Example: 6 (1 + 2 + 3 = 6) */
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
              sum=sum+i;
            }
        }
        if(num==sum)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}