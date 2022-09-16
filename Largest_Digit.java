import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int a,b,max=0;
        a=k.nextInt();
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            if(max<b)
            {
                max=b;
            }
        }
        System.out.println(max);
        
    }
}