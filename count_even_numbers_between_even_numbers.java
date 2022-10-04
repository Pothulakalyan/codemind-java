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
        for(int i=1;i<n-1;i++)
        {
            if(arr[i-1]%2==0 && arr[i]%2==0 && arr[i+1]%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}