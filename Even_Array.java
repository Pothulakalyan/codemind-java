import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,flag=0;
        n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=k.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                flag=0;
            }
            else
            {
                flag=1;
                break;
                
            }
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