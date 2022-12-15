import java.util.*;
class file
{
    public static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        int a=k.nextInt();
        int c=0,f=0;
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=k.nextInt();
        }
        int se=k.nextInt();
        for(int i=0;i<a;i++)
        {
            if(isprime(arr[i]))
            {
                if(se<=arr[i])
                {
                    c++;
                    f=0;
                }
            }
        }
        if(f==0)
        {
            System.out.println(c);
        }
    }
}