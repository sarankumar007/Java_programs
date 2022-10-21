import java.util.*;
public class commonInSecondLine {

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n1=sc.nextInt();
//        int n2=sc.nextInt();
//        ArrayList<Integer> a=new ArrayList<>();
//        ArrayList<Integer> b=new ArrayList<>();
//        for(int i=0;i<n1;i++){
//            a.add(sc.nextInt());
//        }
//        for(int i=0;i<n2;i++){
//            b.add(sc.nextInt());
//        }
//        b.retainAll(a);
//        System.out.println(b.size());
//        HashSet<Integer> a=new HashSet<>();
//        a.add(55);
//        a.add(44);
//        a.add(77);
//        a.add(88);
//        HashSet<Integer> b=new HashSet<>();
//        b.add(89);
//        b.add(55);
//        b.add(55);
//        b.add(77);
//        b.add(76);
//
//
//        b.retainAll(a);
//        System.out.println(b);

        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] num1=new int[n1];
        for(int i=0;i<n1;i++){
            num1[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<n2;i++){
            a.put(i,sc.nextInt());
        }
        int count=0;
        for(int i=0;i<n1;i++){
            if(a.containsValue(num1[i])){
                for(int j=0;j<n2;j++){
                    if(a.get(j)==num1[i]){
                        count++;
                    }
                }

            }
        }
        System.out.println(count);



    }
}