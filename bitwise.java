import java.util.*;
public class bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=Integer.toBinaryString(a);

        System.out.println(b);
        char[] c=b.toCharArray();

        int count =0;
        for(char ch:c){
            if(ch=='1'){
                count++;
            }
        }
        System.out.println(count);



    }
}
