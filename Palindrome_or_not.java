import java.util.*;
class file
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        String s=k.nextLine();
        String s1=s.toUpperCase();
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2+=s1.charAt(i);
        }
        if(s2.equals(s1))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}