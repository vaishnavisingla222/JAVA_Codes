import java.util.*;
class Triplets
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the value of sum");
        int sum=sc.nextInt();
        System.out.println("Enter the value of ellements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The value of triplets");
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                for (int k=j+1;k<size;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==sum)
                    System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                }
            }
        }
    }
}