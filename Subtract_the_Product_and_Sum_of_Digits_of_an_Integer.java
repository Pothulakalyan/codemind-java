import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,rem,sum=0,pro=1,result;
        n=k.nextInt();
        while(n>0)
        {
            rem=n%10;
            pro=pro*rem;
            sum=sum+rem;
            n=n/10;
        }
         result=pro-sum;
        System.out.println(result);
    }
}