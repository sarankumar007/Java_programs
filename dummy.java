import java.util.*;
public class dummy {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        boolean flag=true;

        if(a.charAt(0) == '_'){
            System.out.print(a);
            flag=false;
        }
        else if(a.charAt(n - 1) == '_'){
            String[] b=a.split("_");
            String b1=b[0];
            char[]b2=b1.toCharArray();
            for(int i=b2.length-1;i>=0;i--){
                System.out.print(b2[i]);

            }
            System.out.print("_");
            flag=false;
        }
        else if(a.contains("_") && flag){
            String[] a1=a.split("_");
            String a2=a1[0];
            char[] a3=a2.toCharArray();
            for(int i=a3.length-1;i>=0;i--){
                System.out.print(a3[i]);
            }
            System.out.print("_"+a1[1]);
        }
        else
        {
            char[] xxx=a.toCharArray();
            for(int i=xxx.length-1;i>=0;i--){

                System.out.print(xxx[i]);
            }
        }

    }
}