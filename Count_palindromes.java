import java.util.*;
import java.util.Scanner;
class palindromes
{
    public static boolean ispalindrome(int n)
    {
        int rem,rev=0,temp=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==temp)
        return true;
        else
        return false;
        
    }
    public static void main(String[] args)
    {
        Scanner k=new Scanner(System.in);
        int n,rev=0,count=0;
        n=k.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=k.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(ispalindrome(arr[i]))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}