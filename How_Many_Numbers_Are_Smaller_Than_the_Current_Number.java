import java.util.*;
class file
{
    public static void main(String agrs[])
    {
        Scanner k=new Scanner(System.in);
		        	int a=k.nextInt();
		        	int arr[]=new int[a];
		        	//int f=0;
		        	for(int i=0;i<a;i++)
		        	{
		        		arr[i]=k.nextInt();
		        	}
		        	for(int i=0;i<a;i++)//6 5 4 8
		        	{
		        		int count=0;
		        		for(int j=0;j<a;j++)
		        		{
		        			if(arr[i]>arr[j])
		        			{
		        				count++;
		        			}
		        		}
		        		System.out.print(count +" ");
		        	}
    }
}