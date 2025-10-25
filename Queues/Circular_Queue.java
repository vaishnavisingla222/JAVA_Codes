import java.util.*;
class Circular_Queue
{
    public static class CircularQueueArray
    {
    int f=-1,r=-1,size=0;
    int[] arr=new int[5];
    public void add(int val) throws Exception
    {
        if(size==arr.length)
        throw new Exception("Queue is full\n");

        if(size==0)
        {
            arr[0]=val;
            f=r=0;
            size++;
            return;
        }
        if(r<arr.length-1)
        arr[++r]=val;

        else if (r==arr.length-1)
        {
            r=0;
            arr[0]=val;
        }
        size++;
        return;
    }
    public void remove() throws Exception
    {
        if(size==0)
        throw new Exception("Queue is empty\n");
            
        if(size==1)
        {
            f=r=-1;
            size--;
            return;
        }
        if(f==arr.length-1)
        f=0;

        else
        f++;

        size--;
        return;
    }
    public int peek() throws Exception
    {
        if(size==0)
        throw new Exception("Queue is empty\n");

        else
        return arr[f];
    }
    public void display()
    {
        if(size==0)
        {
            System.out.println("Queue is empty\n");
            return;
        }
        if(f<=r)
        {
            for(int i=f;i<=r;i++)
            System.out.print(arr[i]+" ");
        }
        else//r<f
        {
            for(int i=f;i<arr.length;i++)
            System.out.print(arr[i]+" ");
            for(int i=0;i<=r;i++)
            System.out.print(arr[i]+" ");
        }
        return;
    }
    }
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        CircularQueueArray obj=new CircularQueueArray();
        System.out.print("Enter the ellements: ");
        for(int i=0;i<5;i++)
        {
            int num=sc.nextInt();
            obj.add(num);
        }
        obj.display();
        System.out.println(obj.peek());
        obj.remove();
        obj.display();
    }
}
