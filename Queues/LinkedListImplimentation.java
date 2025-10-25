import java.util.*;
class LinkedListImplimentation
{
    public static class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }
    }
    public static class QueueLL
    {
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int val)
        {
            Node temp=new Node(val);
            if(size==0)
            head=tail=temp;
            else
            {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int peek()
        {
            if(size==0)
            {
                System.out.println("Queue is empty\n");
                return -1;
            }
            return head.val;
        }
        public void remove()
        {
            if(size==0)
            {
                System.out.println("Queue is empty\n");
                return;
            }
            head=head.next;
            size--;
            return;
        }
        public void display()
        {
            if(size==0)
            {
                System.out.println("Queue is empty\n");
                return;
            }
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
            return;
        }
    }
    public static void main(String args[])
    {
        QueueLL que=new QueueLL();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.display();
        System.out.println(que.peek());
        que.remove();
        que.display();
    }
}