import java.util.*;
public class magicalprime {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       int flag=0;
       int b=a;
        for(int i=2;i<=a/2;i++){
            if(a%i==0) {
                flag = 1;
                break;
            }

        }
        int rev=0;
        int test=0;
        while(b>0){
            test=b%10;
            rev=(rev*10)+test;
            b=b/10;
        }
        int flag1=0;
        for(int i=2;i<=rev/2;i++){
            if(rev%i==0) {
                flag1 = 1;
                break;
            }

        }

        if(flag==0 && flag1==0)
            System.out.println("magical");
        else
            System.out.println("not magical");

    }
}
