import java.util.*;
public class xpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int n=name.length();
        char[] name1=name.toCharArray();

        for(int i=0;i<n;i++){
            for(int j=0;j<= n;j++){
                 if(i==j || i+j==n-1)
                    System.out.print(name1[j]);


                else
                    System.out.print(" ");

            }
            System.out.println();

        }



    }



}
