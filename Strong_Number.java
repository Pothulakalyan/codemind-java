import java.util.*;
class solution{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f=1,sum=0;
        int num=n;
        while(num!=0)
        {
            int r=num%10;
            f=1;
            for(int i=1;i<=r;i++)
            {
                f=f*i;
            }
            sum+=f;
            num=num/10;
        }
        if(sum==n)
        {
            System.out.format("The number %d is a strong number",n);
        }
        else
        {
            System.out.format("The number %d is not a strong number",n);
        }
    }
}