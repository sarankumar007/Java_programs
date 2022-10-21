//import java.util.*;
//public class srtest {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//     String a=sc.nextLine();
//     char[] x=a.toCharArray();
//     String b="aeiouAEIOU";
//     String f="";
//     for(int i=0;i<x.length;i++){
//         String bejoy=" "+i+" ";
//         if(b.indexOf(x[i])>=0 ){
//             for(int j=i;j<x.length;j++){
//
//                 String tina=" "+j+" ";
//                 if(b.indexOf(x[j])<0 && (!f.contains(bejoy) && !f.contains(tina))){
//                     char t=x[j];
//                     x[j]=x[i];
//                     x[i]=t;
//                     f=f+" "+i+" "+j+" ";
//                     break;}}
//         }
//         else{
//             for(int j=i;j<x.length;j++){
//                 String tina=" "+j+" ";
//                 if(b.indexOf(x[j])>=0 && (!f.contains(bejoy) && !f.contains(tina)) ){
//                     char t=x[j];
//                     x[j]=x[i];
//                     x[i]=t;
//                     f=f+" "+i+" "+j+" ";
//                     break;
//                 }}}}
//        for(char ch:x)
//            System.out.print(ch);
//
//    }
//}


//import java.util.Scanner;
//
//public class srtest {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String str1=scan.next();
//        char ch1[]=new char[str1.length()/2];
//        char ch2[]=new char[str1.length()/2];
//        int x=0,y=0;
//        for(int i=0;i<str1.length();i++) {
//            char c=str1.charAt(i);
//            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//                ch1[x]=c;
//                x++;
//            }
//            else {
//                ch2[y]=c;
//                y++;
//            }
//        }
//        x=0;
//        y=0;
//        for(int i=0;i<str1.length();i++) {
//            char c=str1.charAt(i);
//            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//                System.out.print(ch2[y]);
//                y++;
//            }
//            else {
//                System.out.print(ch1[x]);
//                x++;
//            }
//        }
//
//        scan.close();
//    }
//}
//import java.util.*;
//public class srtest {
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] a=new int[n];
//        for(int i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            int t=a[i];
//            int x=5*t*t-4;
//            int y=5*t*t+4;
//            int s=(int)Math.sqrt(x);
//            int u=(int)Math.sqrt(y);
//            if(s*s==x || u*u==y)
//                System.out.print(a[i]+" ");
//        }
//
//    }
//}


import java.util.Scanner;

////Largest Unit Digit Integer
import java.util.*;
//public class srtest {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[] a=new int[3];
//        int max=-9999;
//        int f=0;
//        for(int i=0;i<3;i++){
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<3;i++){
//            int t=a[i];
//            int u=t%10;
//            if(u>max){
//                f=i;
//            }
//        }
//        System.out.println(a[f]);
//
//    }
//}
//Pair sum
//public class srtest{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int [] a=new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i+=2){
//            System.out.print(a[i]+a[i+1]+" ");
//        }
//    }
//}
//togglecase
//public class srtest{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String a=sc.next();
//        String x=sc.next();
//        for(int i=0;i<a.length();i++){
//            char t=a.charAt(i);
//            String r=t+"";
//            if(r.equalsIgnoreCase(x)){
//                if(Character.isUpperCase(t))
//                    System.out.print(r.toLowerCase());
//                else
//                    System.out.print(r.toUpperCase());
//            }
//            else
//                System.out.print(t);
//        }
//
//
//    }
//}
import java.util.Scanner;

//public class srtest {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner scan =new Scanner(System.in);
//        int n=scan.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++) {
//            a[i]=scan.nextInt();
//        }
//        int x=scan.nextInt();
//        while(true) {
//            if(x>=n) {
//                x=x-n;
//            }
//            x=n-x;
//            if(x<n&&x>=0) {
//                break;
//            }
//        }
//
//        for(int i=0;i<n;i++) {
//            System.out.print(a[x]+" ");
//            x++;
//            if(x>=n) {
//                x=0;
//            }
//        }
//    }
//
//}


//abacadafagahajakalamanapaqarasatavawaxayazubucudufuguhujukulumunupuqurusutuvuwuxuyuz
//op:bacadafagahajakalamanapaqarasatavawaxayazabucudufuguhujukulumunupuqurusutuvuwuxuyuzu
//iaeuiouaeoiaueouiesvllsrmsfxdcbdgptl

//public class srtest{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String a=sc.nextLine();
//         int b=sc.nextInt();
//         String []x=a.split("\\s");
//         for(int i=0;i<x.length;i++){
//             int f=ktm_mr(x[i]);
//             String y=x[i].substring(f);
//             int t=Integer.parseInt(x[i].substring(0,f));
//             t=t+b;
//             x[i]=t+y;
//         }
//        for(int i=x.length-1;i>=0;i--){
//            System.out.print(x[i]+" ");
//        }
//
//    }
//    public static int ktm_mr(String a){
//        int f=0;
//        for(int i =0;i<a.length();i++){
//            char t=a.charAt(i);
//            if(Character.isAlphabetic(t)){
//                f=i;
//                break;
//            }
//        }
//        return f;
//    }
//}
public class srtest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>0){
                if(a[i]<=10000 && a[i]%100==0){
                    balance+=a[i];
                    System.out.println("Credit:Successful");
                }
                else
                    System.out.println("Credit:Failed");
            }
            else if(a[i]<0){
                a[i]=a[i]*-1;
                if(a[i]<=balance && a[i]%100==0){
                    balance-=a[i];
                    System.out.println("Debit:Successful");
                }
                else
                    System.out.println("Debit:Failed");
            }
        }
        System.out.println(balance);

    }
}












/*
What is the output?
String myStr1 = "AdaikAlam";
String myStr2 = "adaiKALAM";
System.out.println(myStr1.equalsIgnoreCase(myStr2));
        a)false
        b)1
        c)true
        d) infinity ♾
Comment 👇 :)
*/

/*
What is the output?
String myStr = "agent_Amar";
System.out.println(myStr.contains("Agent_"));
System.out.println(myStr.contains("Amar "));
        a)true
          true
        b)true
          false
        c)false
          true
        d)false
          false
Comment 👇 :)
*/






















