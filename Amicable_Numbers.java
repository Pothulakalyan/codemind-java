import java.util.*;
import java.util.Scanner;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int a,b,sum1=0,sum2=0;
        a=k.nextInt();
        b=k.nextInt();
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                sum1=sum1+i;
            }
        }
        for(int j=1;j<=b/2;j++)
        {
            if(b%j==0)
            {
                sum2=sum2+j;
            }
        }
        if(sum1==b && sum2==a)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}