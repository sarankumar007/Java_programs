import java.util.*;
public class numbercount {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] num1=new int[n1];
        int[] num2=new int[n2];
        for(int i=0;i<n1;i++){
            System.out.println("enter num1");
            num1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            System.out.println("enter num2");
            num2[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(num1[i]==num2[j]){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}