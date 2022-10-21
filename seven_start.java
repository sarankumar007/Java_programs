import java.util.Scanner;

public class seven_start {
    public static void main(String[] args) {
        int f=0;


        for(int i=2;i<=200;i++) {

            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    f = 1;

                    break;
                }

            }

            if (f == 0) {
                int b=i;

                while(b>9) {
                    b/=10;

                    }
                if(b==7){
                    System.out.print(i+" ");
                }


            }
            f=0;


        }

    }


}
