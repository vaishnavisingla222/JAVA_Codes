import java.util.*;
class ArrayImplementation 
{
    public static class QueueArray
    {
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr=new int[100];
        public void add(int val)
        {
            if(r==arr.length-1)
            {
                System.out.println("Queue is full");
                return;
            }
            if(f==-1)
            {
                f=r=0;
                arr[0]=val;
            }
            else
            arr[++r]=val;

            size++;
            return;
        }
        public int remove()
        {
            if(size==0)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int x=arr[f];
            f++;
            size--;
            return x;
        }
        public int peek()
        {
            if(size==0)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }
        public void display()
        {
            if(size==0)
            {
                System.out.println("Queue is empty");
                return;
            }
            for(int i=f;i<=r;i++)
            System.out.print(arr[i]+" ");

            System.out.println();
            return;
        }
    }
    public static void main(String args[])
    {
        QueueArray obj=new QueueArray();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.display();
        obj.remove();
        obj.display();
        System.out.println(obj.peek());
    }
}
