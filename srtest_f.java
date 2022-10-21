/*import java.util.*;
public class srtest_f {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0,f=0;
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                f=1;
                a[j + 1] = a[j];
                j = j - 1;
            }
            if(f==0)
                count++;
            f=0;

            a[j + 1] = key;
        }
        System.out.println(count);
    }
}
*/

import java.util.*;
public class srtest_f {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
//        long i, j, flag,N=100,num1=0,num2=1;
//        int counter=0,k=0,m=1,lol=0;
//         long [] a=new long[200];
//        while (counter < N) {
//            a[k]=num1;
//            k+=2;
//            long num3 = num2 + num1;
//            num1 = num2;
//            num2 = num3;
//            counter = counter + 1;
//        }
//        for (i = 2;; i++) {
//            if (i == 1 || i == 0)
//                continue;
//            flag = 1;
//            for (j = 2; j <= i / 2; ++j) {
//                if (i % j == 0) {
//                    flag = 0;
//                    break;
//                }
//            }
//            if (flag == 1) {
//                if(lol==100)
//                    break;
//                a[m] = i;
//                m += 2;
//                lol++;
//            }
//        }
//        System.out.println(a[x-1]);
//        System.out.println(Arrays.toString(a));


//       String a=sc.nextLine();
//       String x="AEIOUaeiou";
//       String f=a.charAt(1)+"",z=a.charAt(a.length()-2)+"";
//       if(!x.contains(f))
//           System.out.print(a.charAt(0));
//       for(int i=1;i<a.length()-1;i++){
//           String u=a.charAt(i+1)+"";
//           String v=a.charAt(i-1)+"";
//           if(!x.contains(u)&& !x.contains(v))
//               System.out.print(a.charAt(i));
//       }
//       if(!x.contains(z))
//           System.out.print(a.charAt(a.length()-1));



/*int a=sc.nextInt();
String b=sc.next();
int c=sc.nextInt();
System.out.println(b.equals("plus")?a+c:a-c);*/








    }
}





























