import java.util.*;
class Abundant_Deficient
{
    /**Abundant Number: A number for which the sum of its proper divisors is greater than the number itself.
Example: 12 (1 + 2 + 3 + 4 + 6 = 16 > 12)
Deficient Number: A number for which the sum of its proper divisors is less than the number itself.
Example: 8 (1 + 2 + 4 = 7 < 8) */
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
        if(num<sum)
        System.out.println("Abundant");
          
        else if(num>sum)
        System.out.println("Deficient");
    }
}
