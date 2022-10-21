import java.util.Scanner;

//import java.util.*;
//public class sharantest {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        String ans="";
//        for(int i=0;i<n;i++){
//            String yo=sc.nextLine();
//            yo=rolex(yo);
//            ans+=yo+"\n";
//        }
//        System.out.println(ans);
//    }
//    public static String rolex(String a){
//        String[]x=a.split("\\s");
//        int n1=x[0].length();
//        int n2=x[1].length();
//        int l=n1>=n2?n1:n2;
//        String s1=x[0];
//        String s2=x[1];
//        String y="";
//        for(int i=0;i<l;i++){
//            if(i<n1)
//                y=y+s1.charAt(i);
//            if(i<n2)
//                y=y+s2.charAt(i);
//
//        }
//        return y;
//    }
//}
//public class sharantest{
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        String x="";
//        String y="";
//        int[][] a=new int[n][n];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                a[i][j]=sc.nextInt();
//                if(i<=n/2 && j>=n/2){
//                    x=x+" "+a[i][j]+" ";
//                }
//                 if(i>=n/2 && j<=n/2)
//                    y=y+" "+a[i][j]+" ";
//            }
//        }
//
//
//        x=x.trim();y=y.trim();
//        x=x.replaceAll("  "," ");
//        y=y.replaceAll("  "," ");
//        String[] h=x.split(" ");
//        String [] g=y.split(" ");
//
//        int[] rolex=new int[h.length];
//        int[] vikram=new int[g.length];
//        for(int i=0;i<rolex.length;i++){
//            rolex[i]=Integer.parseInt(h[i]);
//        }
//        for(int i=0;i<vikram.length;i++){
//            vikram[i]=Integer.parseInt(g[i]);
//        }
//        System.out.println(Arrays.toString(rolex));
//        System.out.println(Arrays.toString(vikram));
//        int count=0;
//        for(int i=0;i<rolex.length;i++){
//            for(int j=0;j<vikram.length;j++){
//                if(rolex[i]==vikram[j]){
//                    vikram[j]=-99999;
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println(count);
//
//        System.out.println(Arrays.toString(rolex));
//        System.out.println(Arrays.toString(vikram));
//
//
//    }
//}

import  java.util.*;
import java.math.*;
public class sharantest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.nextLine();
//        String a=sc.nextLine();
//        String [] b=a.split(" ");
//        int f=0;
//        for(int i=b.length-1;i>=0;i--){
//            if(b[i].length()==2){
//                System.out.print(b[i]+" ");
//                f=1;
//            }
//        }
//        if(f==0)
//            System.out.println("-1");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if(a.length<2)
        {
            System.out.println("need two elements");
            System.exit(0);
        }
        int f = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] != a[n - 1]) {
                f = 1;
                System.out.println(a[i]);
                break;
            }
        }
        if (f == 0)
            System.out.println("no");
    }
}
        //---------------------------------
//        LinkedList<Integer> a = new LinkedList<>();
//        while(true){
//            System.out.println("1.push 2.pop 3.display 4.exit\nEnter your choice : ");
//            int x=sc.nextInt();
//            if(x==1) {
//                System.out.println("Enter the element to be pushed : ");
//                int t=sc.nextInt();
//                push(a,t);
//                System.out.println("________________________________________________");
//            }
//            else if(x==2){
//                pop(a);
//                System.out.println("________________________________________________");
//            }
//            else if(x==3){
//                System.out.println("________________________________________________");
//                for(int i=a.size()-1;i>=0;i--){
//                    System.out.println(a.get(i));
//                }
//                System.out.println("________________________________________________");
//            }
//            else if(sc.nextInt()==4)
//                System.exit(0);
//
//        }
//    }
//      public static void push(LinkedList<Integer>a,int x){
//       a.add(x);
//        }
//        public static void pop(LinkedList<Integer>a){
//        if(a.size()>0) {
//            System.out.println("Popped element is : "+a.get(a.size()-1));
//            a.remove(a.size() - 1);
//        }else{
//            System.out.println("Is empty");
//        }

//        System.out.println("enter weight:");
//        int w=sc.nextInt();
//        System.out.println("enter age:");
//        int a=sc.nextInt();
//        if(w<40){
//            System.out.println("under weight");
//        }
//        if(w>110){
//            System.out.println("extra ropes needed");
//        }
//        if(a<12){
//            System.out.println("under age");
//        }
//        if(w>=40 && w<=110 && a>=12){
//            System.out.println("enjoy bunjee jumping");
//        }
//
//        }

//}
/*Given an array of size n.which of the following specifications: Each element in the array contains either a policeman or a thief. Each policeman can catch only one thief.
 A policeman cannot catch a thief who is more than k units away from him.we need to find the maximum number of thieves that can caught.
 i/p:
 6
 p
 t
 p
 t
 t
 p
 3
 */