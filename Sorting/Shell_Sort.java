import java.util.*;
public class Shell_Sort 
{
    public static void shell_sort(int[] arr)
    {
        int n=arr.length;
        for (int gap=n/2;gap>0;gap/=2) 
        {
            for (int i=gap;i<n;i++) 
            {
                int temp=arr[i];
                int j=i;
                while (j>=gap && arr[j-gap]>temp) 
                {
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=temp;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int len=sc.nextInt();

        int arr[]=new int[len];
        System.out.print("Enter the ellemnts of the array: ");
        for(int i=0;i<len;i++)
        arr[i]=sc.nextInt();
        
        shell_sort(arr);
        System.out.println("The sorted array is:");
        for (int i = 0; i < len; i++)
        System.out.print(arr[i] + " ");
        
        System.out.println();
    }
}
