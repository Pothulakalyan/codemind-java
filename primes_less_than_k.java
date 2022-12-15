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
        int a,se,count=0,flag=0;
        a=k.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=k.nextInt();
        }
        se=k.nextInt();
        for(int i=0;i<a;i++)
        {
            if(isprime(arr[i]))
            {
                if(se>=arr[i])
                {
                    count++;
                    flag=0;
                }
            }
        }
        if(flag==0)
        {
            System.out.println(count);
        }
    }
}