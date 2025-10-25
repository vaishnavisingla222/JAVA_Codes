class Fibonassi
{
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int c;
        System.out.println("The series is:");
        System.out.println(a);
        System.out.println(b);
        for (int i=3;i<21;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            
        }
    }
}