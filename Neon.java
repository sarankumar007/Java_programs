//import java.util.*;
//public class Neon {
// static int num,sq,b,sum=0;
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//         num=sc.nextInt();
//
//         sq=num*num;
//
//         for(int i)
//         hi();
//
//        while(sum>9) {
//            hi();
//        }
//        System.out.println(sum);
//
//    }
//    public static void hi(){
//        while (sq > 0) {
//            b = sq % 10;
//            sum = sum + b;
//            sq = sq / 10;
//        }
//
//    }
//}
import java.util.*;
public class Neon {

    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("saran");
        a.add("lol");
String[] x=new String[a.size()];
   x=a.toArray(x);
        System.out.println(Arrays.toString(x));
        ArrayList<String> b=new ArrayList<>(a);
        System.out.println(b);
    }

}