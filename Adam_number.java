import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int a,b,c,rev=0,rem,rev1=0,rem1;
        a=k.nextInt();
        b=a*a;
        //reverse of n
        while(a!=0)
        {
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        //square of rev
        c=rev*rev;
        while(c!=0)
        {
            rem1=c%10;
            rev1=rev1*10+rem1;
            c=c/10;
        }
        if(b==rev1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}