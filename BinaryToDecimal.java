import java.util.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=0;
        int temp=0;
        int  n=sc.nextInt();
        while(n>0){
            int a=n%10;
             temp+=a*Math.pow(2,j);
            j++;
            n/=10;
        }
        System.out.println(temp);
    }
}
