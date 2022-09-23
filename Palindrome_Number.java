import java.util.Scanner;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int a=k.nextInt();
        for(int b=0;b<a;b++){
            int n,r1,r2,flag=0;
            n=k.nextInt();
            int d=(int)Math.log10(n);
            while(n!=0)
            {
                r1=n%10;
                r2=n/(int)Math.pow(10,d);
                if(r1!=r2)
                {
                    flag=1;
                    break;
                }
                n=n%(int)Math.pow(10,d);
                n=n/(int)Math.pow(10,d);
                d=d-2;
            }
            if(flag==0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}
