import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int a,temp,rev=0,r;
        a=k.nextInt();
        temp=a;
        while(a!=0)
        {
            r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        if(rev==temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}