import java.util.*;
public class wordlength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] x=a.split("\\s");
        int smallest=10000000;
        int largest=-1;
        int f=0;
        for(int i=0;i<x.length;i++){
            int l=x[i].length();
            if(l<smallest){
                smallest=l;
                f=i;
            }
        }
        int j=0;
        for(int i=0;i<x.length;i++){
            int l=x[i].length();
            if(l>largest){
                largest=l;
                j=i;
            }
        }
        System.out.println("Big word: "+x[j]);
        System.out.println("Small word: "+x[f]);
    }
}
