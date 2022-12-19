import java.util.*;
class file
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
		String s=k.nextLine();
		char ch[]=s.toCharArray();
		char target=k.next().charAt(0);
		int c=0;
		for(int i=0;i<ch.length;i++)
		{
			if(target==ch[i])
			{
				c++;
			
			}
		}
		if(c==0)
		{
		    System.out.println("-1");
		}
		else
		{
		    System.out.println(c);
		}
		
    }
}