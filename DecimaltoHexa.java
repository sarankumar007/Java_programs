import java.util.*;
public class DecimaltoHexa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

        String x="";
       String b="";
        while(a!=0){
            int y=a%16;
            if(y>=10){
                switch (y){
                    case 10:{
                        b="A";
                        break;
                    }
                    case 11:{
                        b="B";
                        break;
                    }
                    case 12:{
                        b="C";
                        break;
                    }
                    case 13:{
                        b="D";
                        break;
                    }
                    case 14:{
                        b="E";
                        break;
                    }
                    case 15:{
                        b="F";
                        break;
                    }

                }
                x=b+" "+x;
            }
            else
                x=y+" "+x;



            a=a/16;

        }
        System.out.println(x);

    }
}
