import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,s=0;
        n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=k.nextInt();
        }
        int a=k.nextInt();
        int b=k.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                c++;
                s=arr[i];
                System.out.print(s +" ");
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
    
    }
}