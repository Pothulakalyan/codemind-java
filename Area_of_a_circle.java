import java.util.Scanner;
class file
{
    public static void main(String[] args)
    {
        int r;
        double pi=3.14,area;
        Scanner a=new Scanner(System.in);
        r=a.nextInt();
        area=pi*r*r;
        System.out.format("%.2f",area);
        a.close();
    }
}