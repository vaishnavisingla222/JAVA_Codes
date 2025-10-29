import java.util.*;
class Radix_Sort
{
    public static int findMax(int arr[])
    {
        int len=arr.length;
        int max=arr[0];
        for(int i=0;i<len;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        return max;
    }
    public static void count_sort(int arr[],int place)
    { 
        int len=arr.length;
        int[] out=new int[len];
        int[] freq=new int[10];//digits-> 0 to 9
        
        for(int i=0;i<len;i++)
        {
            int digit=Math.abs(arr[i]/place)%10;
            freq[digit]++;
        }
        
        for(int i=1;i<freq.length;i++)
        freq[i]+=freq[i-1];


        for(int i=len-1;i>=0;i--)
        {
            int digit=Math.abs(arr[i]/place)%10;
            int indx=freq[digit]-1;
            out[indx]=arr[i];
            freq[digit]--;
        }

        for(int i=0;i<len;i++)
        arr[i]=out[i];
    }
    public static void radix_sort(int[] arr)
    {
        //find max value in array
        int max=findMax(arr);

        for(int place=1;max/place>0;place*=10)
        count_sort(arr,place);//modified for radix sort digit wise
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
        
        radix_sort(arr);
        System.out.print("The sorted array is: ");
        for (int i = 0; i < len; i++)
        System.out.print(arr[i] + " ");
        
        System.out.println();
    }
}
