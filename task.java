import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int c=n-1,d=n;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<d;j++){
//                if(j<c){
//                    System.out.print(" ");
//                }
//                else {
//                    System.out.print("*");
//                }
//            }
//            c--;
//            d++;
//            System.out.println();
//        }
        for(int i=0;i<n;i++){

            for(int j=0;j<n+i;j++){
                if(j<n-i-1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }




    }

}
