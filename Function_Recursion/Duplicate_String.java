import java.util.*;
class Duplicate_String
{
    public static boolean[] alpha=new boolean[26];//by default false

    public static void remove(String str,int pos,String nstr)
    {
        if(pos==str.length())
        {
            System.out.println("The modified string is: "+nstr);
            return;
        }
        char check=str.charAt(pos);
        if(alpha[check-'a'])
        remove(str,pos+1,nstr);
        
        else
        {
            nstr=nstr+check;
            alpha[check-'a']=true;
            remove(str,pos+1,nstr);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the string to be modified: ");
        String str=sc.next();
        remove(str,0,"");
    }
}
