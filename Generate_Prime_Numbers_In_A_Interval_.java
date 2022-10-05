import java.util.*;
import java.lang.*;
class file
{
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int a,b;
        a=k.nextInt();
        b=k.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(isprime(i))
            {
                System.out.println(i);
            }
        }
        
    }
}