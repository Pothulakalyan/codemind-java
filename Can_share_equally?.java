import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int a,b;
        a=k.nextInt();
        b=k.nextInt();
        if((a%2==0)&&(a>0||b%2==0))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}