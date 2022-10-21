import java.util.ArrayList;
import java.util.*;
public class test2 {
    public static void main(String[] args) {
//        ArrayList<Integer> a=new ArrayList<>();
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            a.add(sc.nextInt());
//        }
//        a.add(55);
//
//        for(int ch:a)
//            System.out.print(ch+" ");
        HashMap<Integer,String> b=new HashMap<>();
        b.put(0,"saran");
        b.put(1,"yk");
        b.put(2,"yk");
        System.out.println(b);
        int n=b.size();
        for(int i=0;i<n;i++){
            System.out.print(b.get(i)+" ");
        }
    }
}
