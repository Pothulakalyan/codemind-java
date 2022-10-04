import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
            int n,max=-999;
            n=k.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=k.nextInt();
            }
            for(int i=0;i<n-1;i++)
            {
                if(max<arr[i])
                {
                    max=arr[i];
                }
                
            }
            System.out.print(max);

    }
}