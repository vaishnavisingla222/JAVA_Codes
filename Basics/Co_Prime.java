import java.util.*;
class Co_Prime
{
    public static void main(String args[])
/**Co prime number are those whose hcf=1*/
{
  Scanner sc=new Scanner(System.in);
  int hcf=0;
  System.out.println("enter 1st number");
  int a=sc.nextInt();  
  System.out.println("enter 2nd number");
  int b=sc.nextInt();  
  for(int i=1;i<=a && i<=b;i++)
  {
    if(a%i==0 && b%i==0)
    {
        hcf=i;
    }
  }
  if(hcf==1)
  {
    System.out.println("yes");
  }
  else{
    System.out.println("no");
  }
 }
}