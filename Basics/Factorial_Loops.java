import java.util.*;
class Factorial_Loops
//Using LOOPS
{
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
  int num=sc.nextInt();
  int pr=1;
  for (int i=1;i<=num;i++)
  {
    pr=pr*i;
  }
  System.out.println("The result = "+pr);
}
}