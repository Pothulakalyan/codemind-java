import java.util.Scanner;
import java.lang.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,c=1;
        n=k.nextInt();
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                c=0;
                break;
            }
           
        }
        if(c==1)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
}   }