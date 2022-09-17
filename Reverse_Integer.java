import java.util.*;
class Reverseinteger
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,rev=0,rem;
        n=k.nextInt();
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}