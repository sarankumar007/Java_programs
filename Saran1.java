import java.util.*;
public class Saran1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();

        char[] charr=a.toCharArray();
        int[] num=new int[a.length()];
        char[] l=new char[a.length()];
        int j=0;
        int k=0;
        for(int i=0;i<charr.length;i++){
            if(i%2==0){
                num[j]=Integer.parseInt(String.valueOf(charr[i]));
                j++;
            }
            else{
                l[k]=charr[i];
                k++;
            }
        }

        for(int i=0;i<num.length;i++){
            String x=l[i]+"";
            int xx=num[i];
            int count=0;
            while(count<xx){
                System.out.print(x);
                count++;
            }
        }


    }
}