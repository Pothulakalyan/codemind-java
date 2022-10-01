import java.util.*;
import java.lang.*;
import java.util.Scanner;
class file
{
    public static boolean isprime(int n)
    {
        if (n<2)
        return false;
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n;
        n=k.nextInt();
        if(isprime(n))
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
    }
}
