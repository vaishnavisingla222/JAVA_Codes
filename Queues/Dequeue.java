import java.util.*;
class Dequeue //double ended queue
{
    public static void main(String args[])
    {
        Deque<Integer> dq= new LinkedList();
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addLast(5);
        dq.addFirst(1);
        dq.addFirst(0);
        System.out.println(dq);//0 1 2 3 4 5
        dq.removeLast();
        System.out.println(dq);// 0 1 2 3 4
        dq.removeFirst();
        System.out.println(dq);//1 2 3 4
        System.out.println(dq.getFirst());//1
        System.out.println(dq.getLast());//4
        dq.add(5);//works as last
        System.out.println(dq);
        dq.remove();//works as first
        System.out.println(dq);
        dq.removeAll(dq);//remove all ellemnts
        System.out.println(dq);
        dq.addLast(2);
        dq.addLast(1);
        dq.addLast(4);
        dq.addLast(1);
        dq.addFirst(1);
        dq.addFirst(0);
        System.out.println(dq);
        dq.removeFirstOccurrence(1);//removes 1st occurence of 1
        System.out.println(dq);
        dq.removeLastOccurrence(1);
        System.out.println(dq);
    }
}
