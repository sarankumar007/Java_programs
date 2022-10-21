import java.util.*;
public class dayofdate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the date");
        int k=sc.nextInt();
        System.out.println("enter the month");
        int m=sc.nextInt();
        System.out.println("enter the year");
        int year=sc.nextInt();

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
         if(k>29 && m+2==2 && flag==0 )
         {
             System.out.println("invalid");
             System.exit(0);
         }

         int f=(k+((13*m-1)/5))+d+(d/4)+(c/4)-(2*c);
         r=f%7;

         if(r<0)
             r=7+r;


        switch (r){
            case 1:{

                System.out.println("monday");
                break;
        }
            case 2:{
                System.out.println("tuesday");
                break;
            }
            case 3:{
                System.out.println("wednesday");
                break;
            }
            case 4:{
                System.out.println("thursday");
                break;
            }
            case 5:{
                System.out.println("friday");
                break;
            }
            case 6:{
                System.out.println("saturday");
                break;
            }
            case 0:{
                System.out.println("sunday");
                break;
            }

        }



    }
}
