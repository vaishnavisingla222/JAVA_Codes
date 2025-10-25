import java.util.*;
class Alphabet_Square
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int r=sc.nextInt();
    for(int i=1;i<=r;i++)
    {
      for(int j=1;j<=r;j++)
      {
        char ch=(char)j;
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}
