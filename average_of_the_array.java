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
            sum=sum+arr[i];
        }
        double avg=(float)sum/n;
        System.out.format("%.2f",avg);
    }
}