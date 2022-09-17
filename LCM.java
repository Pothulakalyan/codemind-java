import java.util.*;
class Lcm
{
    public static void main(String[] args)
    {
      Scanner k=new Scanner(System.in);
      int a,b,c;
      a=k.nextInt();
      c=a;
      b=k.nextInt();
      while(true){
          if(c%a==0 && c%b==0){
              System.out.println(c);
              break;
          }
          c++;
      }
    }
}