import java.util.*;
class Triangular_Number
{
    /** A triangular number is the number that can form equilaateral triangle
     * Example- 1,3,6,10
     */
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number to be checked");
     int num=sc.nextInt();
     boolean result=false;
      for(int i=1;i<=num*2;i++)
      {
        if(i*(i+1)==2*num)
        {
          result=true;
          System.out.println("Yes of size "+ i);
          break;
        }
        else{
          result=false;
        }
      }
        if(result==false)
        {
          System.out.println("No");
        }
    }
}