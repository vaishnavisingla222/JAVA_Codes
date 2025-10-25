import java.util.*;
class Prime_Factors
// Program to print prime factors of a number and if a number comes multiple times then print asa much times it comes
//for example 96=2*2*2*2*2*3

{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int n=num;
        for(int i=2;i<=num;i++)
        while(n%i==0)
        {
            System.out.println(i);
            n/=2;
        }
    }
}