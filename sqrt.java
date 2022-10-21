import java.util.*;
public class sqrt {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        while(a<b){
            int flag=0;
            for(int j=2;j<=a/2;j++){
                if(a%j==0){
                   flag=1;

                    break;
                }
            }
            a++;
            if(flag==0)
                System.out.print(a+" ");
        }



    }
}