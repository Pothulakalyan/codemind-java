import java.util.*;
import java.lang.*;
class file

{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,sq,t;
        n=k.nextInt();
        sq=(int)Math.sqrt(n);
        t=sq*sq;
        if(n==t)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}