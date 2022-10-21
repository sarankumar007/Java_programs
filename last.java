import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.*;
public class last {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the date");
        int k=sc.nextInt();
        System.out.println("enter the month");
        int m=sc.nextInt();
        System.out.println("enter the year");
        int year=sc.nextInt();
        int a=m;

        int r,c,d;
        int flag=0;
        m=m-2;
//         if(m==-1)
//             m=10;
//         if(m==-2)
//             m=11;
        c=year/100;
        d=year%100;
        if(((year%4==0) && (year%100!=0)) || (year%400==0))
            flag=1;
        if(k>=29 && m+2==2 && flag==0 )
        {
            System.out.println("invalid");
            System.exit(0);
        }

        int f=(k+((13*m-1)/5))+d+(d/4)+(c/4)-(2*c);
        r=f%7;

        if(r<0)
            r=7+r;

//        if(a==1){
//            if(r==6){
//                r=0;
//            }else{
//                r=r+1;
//            }
//        }else{
//            if(r==6){
//                r=1;
//            }else if(r==5){
//                r=0;
//            }else{
//                r=r+2;
//            }
//        }


        switch (r){
            case 1:{
                if(a==1){
                    System.out.println("tuesday");
                }else if(a==2){
                    System.out.println("wednesday");
                }else{

                System.out.println("monday");}
                break;
            }
            case 2:{
                if(a==1){
                    System.out.println("wednesday");
                }else if(a==2){
                    System.out.println("thursday");
                }else{
                System.out.println("tuesday");}
                break;
            }
            case 3:{
                if(a==1){
                    System.out.println("thursday");
                }else if(a==2){
                    System.out.println("friday");
                }else{
                System.out.println("wednesday");}
                break;
            }
            case 4:{
                if(a==1){
                    System.out.println("friday");
                }else if(a==2){
                    System.out.println("saturday");
                }else{
                System.out.println("thursday");}
                break;
            }
            case 5:{
                if(a==1){
                    System.out.println("saturday");
                }else if(a==2){
                    System.out.println("sunday");
                }else{
                System.out.println("friday");}
                break;
            }
            case 6:{
                if(a==1){
                    System.out.println("sunday");
                }else if(a==2){
                    System.out.println("monday");
                }else{
                System.out.println("saturday");}
                break;
            }
            case 0:{
                if(a==1){
                    System.out.println("monday");
                }else if(a==2){
                    System.out.println("tuesday");
                }else{
                System.out.println("sunday");}
                break;
            }

        }



    }
}
