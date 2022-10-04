import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,count=0;
        n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=k.nextInt();
        }
        int se=k.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==se)
            {
                count=1;
                break;
            }
            else
            {
                count=0;
            }
        }
        if(count==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}