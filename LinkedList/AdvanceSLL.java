public class AdvanceSLL /* Include insertion, getting, reversing and deleting an ellement */
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList
    {
        Node head=null;
        Node tail=null;
        void insert_begin(int val)
        {
           Node temp=new Node(val);
            if(head==null)//empty list
            head=temp;

            else
            {
                temp.next=head;
                head=temp;
            } 
        }
        void insert_index(int val,int ind)
        {
            if(ind==size())//if not put this the tail will not shift to end it will be in second last
            {
                insert_end(val);
                return;
            }
            else if(ind==0)// if not put this then the value will enter at index 1 inspite of 0
            {
                insert_begin(val);
                return;
            }
            else if(ind<0 || ind>size())
            {
                System.out.println("Invalid index given can not be inserted");
                return;
            }
            Node t=new Node(val);
            Node temp=head;
            for(int i=0;i<ind-1;i++)
            temp=temp.next;//no change till index-1
            
            t.next=temp.next;
            temp.next=t;
        }
        void insert_end(int val)
        {
            Node temp=new Node(val);
            if(head==null)
            head=temp;

            else
            tail.next=temp;

            tail=temp;
        }
        void delete(int ind)
        {
            if(ind==0)//otherwise in place of 0 indx 1 indx is removed
            {
                head=head.next;
                return;
            }
            Node temp=head;
            for(int i=0;i<ind-1;i++)
            temp=temp.next;//no change till index-1
            
            temp.next=temp.next.next;
            if(ind==size()-1)
            tail=temp;
        }
        void reverse()
        {
            Node prev=null;
            Node temp=head;
            while(temp!=null)
            {
              Node nextNode = temp.next;
              temp.next = prev;
              prev = temp;
              temp = nextNode;  
            }
            head=prev;
        }
        void display()
        {
            Node temp=head;
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size()
        {
            Node temp=head;
            int count=0;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }
        int get(int ind)
        {
            Node temp=head;
            for(int i=1;i<=ind;i++)
            temp=temp.next;
            return temp.data;
        }
    }
    public static void main(String args[])
    {
        LinkedList ll=new LinkedList();
        ll.insert_end(3);//3
        ll.display();
        ll.insert_end(4);//3 4;
        ll.display();
        ll.insert_begin(1);//1 3 4
        ll.display();
        ll.insert_index(2,1);// 1 2 3 4 //this function will not work for putting the values at beginning or end
        ll.display();
        ll.insert_index(0,0);//0 1 2 3 4
        ll.display();
        ll.reverse();//4 3 2 1 0
        ll.display();
        int len=ll.size();
        System.out.println("Size= "+len);//5
        System.out.println();
        ll.delete(3);// 4 3 2 0 i.e delete at a particular index
        ll.display();
        len=ll.size();
        System.out.println("Size= "+len);//4
        System.out.println();
        System.out.println(ll.get(1));//3 i.e to get an ellement at particular index
    }
}
