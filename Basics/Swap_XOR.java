public class Swap_XOR
{
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Swapping using XOR
        a = a ^ b;//15
        b = a ^ b;//5
        a = a ^ b;//10
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}