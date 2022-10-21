import java.util.*;
public class d2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int a=count-21;
        if(count<0) {
            System.out.println("negative is not accepted");
            System.exit(0);
        }
        if(a<0)
            a=a*-1;
        if(count-21>0)
            System.out.println(a+" extra lemon");
        else if(count-21<0)
            System.out.println(a+" less lemon");
        else
            System.out.println("sufficient");
    }
}
