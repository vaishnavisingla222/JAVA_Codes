/**WAP to find a nmuber entered by the user is prime or composite*/
import java.util.*;
class Prime_Composite
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to be checked");
        int num= sc.nextInt();
        int fac=0;
        for (int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            fac++;
        }
        if(num==1)
        System.out.println("Number is neither prime nor composite");
        else if(num<=0)
        System.out.println("Invalid number");
        else
        {
            if(fac==0)
            System.out.println("The number is prime");
            else
            System.out.println("the number is composite");
        }
    }
}
