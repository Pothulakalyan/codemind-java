import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner k=new Scanner(System.in);
        int a=k.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=k.nextInt();
        }
        int b=k.nextInt();
        int c=0,d=0;
        for(int i=0;i<a;i++){
            c=arr[i]+b;
            for(int j=0;j<a;j++){
                if(c>=arr[j]){
                    d=1;
                }
                else{
                    d=0;
                    break;
                }
            }
            if(d==1){
                System.out.printf("True ");
            }
            else{
                System.out.printf("False ");
            }
        }
    }
}