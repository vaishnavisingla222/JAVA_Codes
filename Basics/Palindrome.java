/**Palindrome is a word or number that is same from starting and the end*/
import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check");
        int num =sc.nextInt();
        int rev=0;
        int n=num;
        int rem;
        while(n>0)
        {
           rem =n%10;
           rev=rev*10+rem;
           n=n/10;
        }
        if(rev==num)
        System.out.println("Palindrome");
        else
        System.out.println("Not a palindrome");
    }
}