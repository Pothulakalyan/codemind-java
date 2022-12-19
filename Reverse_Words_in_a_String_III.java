import java.util.*;
class file
{
    public static void main(String args[])
    {
        
        Scanner k=new Scanner(System.in);
		String s=k.nextLine();
		String words[]=s.split(" ");
		String output=" ";
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String s3=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				s3+=word.charAt(j);
			}
			output+=s3;
		}
		System.out.println(output.trim());
    }
}