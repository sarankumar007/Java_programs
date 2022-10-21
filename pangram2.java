import java.util.*;
public class pangram2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        a=a.toLowerCase();
        boolean flag=true;
        if(a.length()<26){
            System.out.println("not pangram");
        }
        else{
        for(char i='a';i<='z';i++){
            if(a.indexOf(i)==-1){
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
        }
    }
}
