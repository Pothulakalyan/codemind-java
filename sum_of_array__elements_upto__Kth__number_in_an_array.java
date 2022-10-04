import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,sum=0;
        n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=k.nextInt();
        }
        int s=k.nextInt();
        for(int i=0;i<n;i++)
        {
            if(s>=arr[i])
            {
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}