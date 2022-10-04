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
            if(se==arr[i])
            {
                count++;
            }
        }
        System.out.println(count);
       
    }
}