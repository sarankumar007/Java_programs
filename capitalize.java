import java.util.*;
public class capitalize {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        int f=0;
        for(int i=0;i<n;i++){
            char x=a.charAt(i);
            String xa=x+"";
            if(Character.isAlphabetic(x)&& f==0){
                System.out.print(xa.toUpperCase()+"");
                f=1;
            }
            else if(f==1 && Character.isAlphabetic(x)){
                System.out.print(x);

            }
            else{
                System.out.print(a.charAt(i));
                f=0;
            }
        }

    }
}