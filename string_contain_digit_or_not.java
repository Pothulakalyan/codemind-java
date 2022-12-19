import java.util.*;
class file
{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        String s=k.nextLine();
        char arr[]=s.toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            char temp=arr[i];
            if(Character.isDigit(temp))
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("Doesn't contain digit");
        }
        else
        {
            System.out.println("Contains "+c+" digit");
        }
    }
}