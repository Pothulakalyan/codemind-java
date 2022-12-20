import java.util.*;
class file
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        String s=k.nextLine();
        String words[]=s.split(" ");
        String output=" ";
        for(int i=words.length-1;i>=0;i--)
        {
            output+=" "+words[i];
        }
        System.out.println(output.trim());
    }
}