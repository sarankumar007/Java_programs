import java.sql.SQLOutput;
import  java.util.*;
public class insert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=sc.nextInt();
        String b=sc.next();
        b=b.toLowerCase();
        char ch=b.charAt(0);
        StringBuilder sb = new StringBuilder(a);
        sb.insert(n-1,ch);
        System.out.println(sb.toString());

    }
}
