import java.util.*;
public class Recharge {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter days");
        int days=sc.nextInt();

        if(days<84){
            System.out.println("enter no.of.calls");
            int calls=sc.nextInt();
            System.out.println("enter no.of.sms");
            int messages=sc.nextInt();
            System.out.println("enter amount of data used");
            double data=sc.nextDouble();
            int exp=84-days;
            System.out.println("expires in "+exp+" days");
            if(calls<3000){

                int bal=3000-calls;
                System.out.println("still you can call "+bal+" times");

            }
            else
                System.out.println("calls limit reached");
            if(messages<100){
                int bal1=100-messages;
                System.out.println(bal1+" sms left");
            }
            else
                System.out.println("sms limit reached");
            if(data<2){
                double bal2=2.0-data;
                System.out.println("data left is"+bal2+"gb");
            }
            else
                System.out.println("reduced data speed");

        }
        else
            System.out.println("pack expired");
    }
}
