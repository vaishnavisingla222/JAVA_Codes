import java.util.*;
class Basics
{
    public static void main(String[] args) 
    {
        Queue<Integer> que=new LinkedList<>();
        System.out.println(que.isEmpty());//true
        que.add(1);
        System.out.println(que.isEmpty());//false
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que);
        //delete ellement by remove or poll
        que.remove();//2 3 4 5
        System.out.println(que.size());//4
        System.out.println(que);
        que.poll();//3 4 5
        System.out.println(que);
        //find the top most ellement by peek or element
        System.out.println(que.peek());//3
        System.out.println(que.element());//3
    }
}
