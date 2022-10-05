import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,sum=0,count=0,avg,flag=0;
        n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=k.nextInt();
            sum=sum+arr[i];
        }
        avg=sum/n;
        for(int i=0;i<n;i++)
        {
            if(avg==arr[i])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}