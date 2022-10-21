import java.util.*;
public class pal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]a=sc.nextLine().split("\\s");
        int l=-1;
        int s=100000;
        int f=0,e=0;
        for(int i=0;i<a.length;i++) {
            StringBuilder x = new StringBuilder(a[i]);
            x.reverse();
            x= new StringBuilder(x.toString());
            int lol=a[i].length();
            if(x.equals(a[i])){

                if(lol<s){
                    s=lol;
                    f=i;
                }
                if(lol>l){
                    l=lol;
                    e=i;
                }
            }
        }
        System.out.println(a[f]);
        System.out.println(a[e]);
    }
}
