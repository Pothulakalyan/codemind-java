import java.util.*;
class file
{
    public static void main(String[] args)
    {
    Scanner k=new Scanner(System.in);
    int n,sum=0;
    n=k.nextInt();
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
    if(n<sum)
    {
        System.out.println("True");
    }
    else
     {
        System.out.println("False");
     }
  }
}