import java.util.Scanner;
class file
{
    public static void main(String[] args)
    {
       Scanner k=new Scanner(System.in);
       int n,sum=0,prod=1,rem;
       n=k.nextInt();
       while(n!=0)
       {
           rem=n%10;
           sum=sum+rem;
           prod=prod*rem;
           n=n/10;
           
       }
       if(sum==prod)
       {
           System.out.println("Spy Number");
       }
       else
       {
           System.out.println("Not Spy Number");
       }
       
    }
}