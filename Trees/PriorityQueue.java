class PriorityQueue 
{
    static int MAX=1000;
    static int[] arr=new int[MAX];
    static int size=0;
    public static void init(PriorityQueue pq) 
    {
        pq.size=0;
    }
    public static void insert(PriorityQueue pq, int val) 
    {
        if (pq.size>=MAX) 
        {
            System.out.println("Queue is full");
            return;
        }
        pq.arr[pq.size]=val;
        int i=pq.size;
        pq.size++;

        while (i>0 && pq.arr[(i-1)/2]<pq.arr[i]) 
        {
            //swap
            int temp=pq.arr[i];
            pq.arr[i]=pq.arr[(i-1)/2];
            pq.arr[(i-1)/2]=temp;
      
            i=(i-1)/2;
        }
    }
    public static int findMax(PriorityQueue pq) 
    {
        if (pq.size<= 0) 
        { 
            System.out.println("Queue is empty");
            return -1;
        }
        int root=pq.arr[0];
        pq.arr[0]=pq.arr[pq.size-1];
        pq.size--;

        int i=0;
        while (true) 
        {
            int left=2*i+1;
            int right=2*i+2;
            int largest=i;

            if (left<pq.size && pq.arr[left]>pq.arr[largest])
                largest=left;
      
            if (right<pq.size && pq.arr[right]>pq.arr[largest])
                largest=right;

            if (largest==i)
                break;

            //swap
            int temp=pq.arr[i];
            pq.arr[i]=pq.arr[largest];
            pq.arr[largest]=temp;

            i=largest;
        }
        return root;
    }
    public static void display(PriorityQueue pq) 
    {
        System.out.print("Priority Queue: ");
        for (int i=0; i<pq.size; i++)
        System.out.print(pq.arr[i]+" ");

        System.out.println();
    }
    public static void main(String args[])
    {
        PriorityQueue pq=new PriorityQueue();
        init(pq);

        insert(pq,2);
        insert(pq,5);
        insert(pq,4);
        insert(pq,3);
        insert(pq,6);

        display(pq);

        System.out.println("Max: "+findMax(pq));
        display(pq);
    }
}
