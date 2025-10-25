import java.util.*;
class Basics 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st = new Stack<>();// stores in form of a
        st.push(1);// 1
        st.push(2);// 1 2
        st.push(3);// 1 2 3
        st.push(4);// 1 2 3 4
        st.push(5);// 1 2 3 4 5
        System.out.println(st.peek());// 5- Finds last ellement
        System.out.println(st);// 1 2 3 4 5
        st.pop();// removes upper ellement
        System.out.println(st);// 1 2 3 4
        System.out.println("size="+ st.size()); //4
    }
}
