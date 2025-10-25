import java.util.*;
public class Binary_Search/* can only be used in sorted array */
{
    public static int search_recursion(int[]arr, int target,int st,int end)
    {
        int n=arr.length;
        if(st>end)
        return -1;
        
        int mid=(st+end)/2;
        if(target==arr[mid])
        return mid;

        else if(target<arr[mid])
        return search_recursion(arr, target,st,mid+1);
        
        else
        return search_recursion(arr, target,mid+1,end);
    }
    public static int search(int[] arr, int target)
    {
        int n=arr.length;
        int st=0,end=n-1;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(target==arr[mid])
            return mid;
            else if(target<arr[mid])
            end=mid-1;
            else
            st=mid+1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the ellements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        Arrays.sort(arr);

        System.out.println("Enter the targeted ellement");
        int target=sc.nextInt();
        //int ind=search(arr,target);
        int ind=search_recursion(arr,target,0,size-1);
        if(ind!=-1)
        System.out.println("After the sorting the targeted ellement is found on "+ind+" index of sorted array");
        else
        System.out.println("The targeted ellement is not in the array");
    }
}
