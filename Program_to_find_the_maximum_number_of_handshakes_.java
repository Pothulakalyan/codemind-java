import java.util.Scanner;
class file
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner k=new Scanner(System.in);
        a=k.nextInt();
        b=(a*(a-1))/2;
        System.out.println(b);
        k.close();
    }
}