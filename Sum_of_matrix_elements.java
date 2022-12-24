import java.util.*;
class file
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
		int a=k.nextInt();
		int b=k.nextInt();
		int sum=0;
		int arr[][]=new int[a][b];
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				arr[i][j]=k.nextInt();
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
    }
}
