import java.util.*;
public class DecimalToBinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        String x="";

        while(a!=0){

            x=(a%2)+" "+x;
            a=a/2;

        }
        System.out.println(x);
    }
}
