import java.util.*;
class file
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        String s=k.nextLine();
        char ch[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++)
        {
            char temp=ch[i];
            if(temp=='0'||temp=='1'||temp=='2'||temp=='3'||temp=='4'||temp=='5'||temp=='6'||temp=='7'||temp=='8'||temp=='9')
            {
                sum+=temp-48;
            }
        }
        System.out.println(sum);
    }
}