import java.util.*;
public class fop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //0 in left and 1 in right
       /* int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int ch:a)
            System.out.print(ch+" ");

        */

String a=sc.nextLine();
int max=-99;
        int f=0;
for(int i=0;i<a.length();i++){
    int count=0;

    char t=a.charAt(i);
    for(int j=0;j<a.length();j++){

        if(t==a.charAt(j)){
            count++;

        }
        if(count>max){
            max=count;
            f=j;
        }
    }


}
        System.out.println(a.charAt(f));
























    }
}
