import java.util.*;
class file
{
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        char vaw;
        vaw=k.nextLine().charAt(0);
        if(vaw=='A'||vaw=='E'||vaw=='I'||vaw=='o'||vaw=='U'||vaw=='a'||vaw=='e'||vaw=='i'||vaw=='o'||vaw=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
        
    }
}