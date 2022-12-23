import java.util.*;
class file
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        String s=k.nextLine();
        String s1=s.toLowerCase();
        String words[]=s1.split(" ");
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            String s5=words[i];
            String s4="";
            for(int j=s5.length()-1;j>=0;j--)
            {
                s4+=s5.charAt(j);
            }
            if(s4.equals(s5))
            {
                c++;
            }
        }
        System.out.println(c);
    }
}