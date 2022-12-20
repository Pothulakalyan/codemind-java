import java.util.*;
class file
{
    public static void main(String args[])
    {
       Scanner k=new Scanner(System.in);
        String s=k.nextLine();
        char ch[]=s.toCharArray();
        int vw=0,con=0,d=0,ws=0;
        for(int i=0;i<ch.length;i++)
        {
             char temp=ch[i];
             if(temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U'||temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u')
             {
                 vw++;
             }
             else if(temp=='0'||temp=='1'||temp=='2'||temp=='3'||temp=='4'||temp=='5'||temp=='6'||temp=='7'||temp=='8'||temp=='9')
             {
                 d++;
             }
             else if(temp==' ')
             {
                 ws++;
             }
             else
             {
            	 con++;
             }
       
            
        }
        System.out.println("Vowels: "+vw);
        System.out.println("Consonants: "+con);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+ws);
}
}